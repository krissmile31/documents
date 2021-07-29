import heapq
import os
import sys
import time

class Tree:
    # Initialize an empty tree: 1 root, 1 empty node
    def __init__(self, character, frequency):
        self.char = character
        self.freq = frequency
        self.left = None
        self.right = None


    def less_than(self, other):
        return other.freq > self.freq

    def equal(self, other):
        return self.freq == other.freq

class Huffman:
    # initialise array & dictionary
    def __init__(self, path):
        self.path = path
        self.heap = []
        self.codes = {}
        self.reverse_mapping = {}

    # make_frequency_dict: sorted value( low - high )
    def freq_dict(self, text):
        # initialise a empty dictionary
        freq = {}
        for char in text:
            if not char in freq:
                freq[char] = 0
            freq[char] += 1
        return freq

    # make_heap_queue from node
    def heap_node(self, frequency):
        for key in frequency:
            node = self.Tree(key, frequency[key])
            self.heap.append(node)

    # build Tree: merge nodes
    def merge(self):
        while len(self.heap) > 1:
            node1 = heapq.heappop(self.heap)
            node2 = heapq.heappop(self.heap)
            merge_node = self.Tree(None, node1.freq + node2.freq)
            merge_node.left = node1
            merge_node.right = node2
            heapq.heappush(self.heap, merge_node)


    def encode_helper(self, root, current_code):
        if root is None:
            return

        if root.char is not None:
            self.codes[root.char] = current_code
            self.reverse_mapping[current_code] = root.char
            return

        self.encode_helper(root.left, current_code + "0")
        self.encode_helper(root.right, current_code + "1")

    def encode(self):
        root = heapq.heappop(self.heap)
        current_code = ""
        self.encode_helper(root, current_code)

    def encode_text(self, text):
        encodedText = ""
        for char in text:
            encodedText += self.codes[char]
        return encodedText

    def get_padding(self, encoded_text):
        # get the extra padding of encode_text
        exPad = 8 - len(encoded_text) % 8            # 8 bits
        for i in range(exPad):
            encoded_text += "0"

        # merge informal information of exPad in "string/bits" with encode_text --> truncate
        bin = '{0:08b}'
        pad_info = bin.format(exPad)
        return pad_info + encoded_text

    def byte_array(self, pad_encoded_text):
        if len(pad_encoded_text) % 8 != 0:
            print('Encoded text is not padded properly!')
            exit(0)

        byteArray = bytearray()
        # loop 8 characters once time
        for i in range(0, len(pad_encoded_text), 8):
            byte = pad_encoded_text[i: i + 8]
            byteArray.append(int(byte, 2))          # base 2

        return byteArray

    def compress(self):
        start = time.time()
        file, file_extension = os.path.splitext(self.path)
        output_path = file + '.bin'

        with open(self.path, 'r+') as f, open(output_path) as output:
            text = f.read()
            text = text.rstrip()

            frequency = self.freq_dict(text)
            self.heap_node(frequency)
            self.merge()
            self.encode()

            encoded_text = self.encode_text(text)
            pad_encoded_text = self.get_padding(encoded_text)

            byteArray = self.byte_array(pad_encoded_text)
            output.write(bytes(byteArray))

        print('Compression done!')
        return output_path

    # "Decompression"

    def remove_padding(self, pad_encoded_text):
        pad_info = pad_encoded_text[:8]
        exPad = int(pad_info, 2)
        pad_encoded_text = pad_encoded_text[8:]
        return pad_encoded_text[:-exPad]

    def decode_text(self, encoded_text):
        current_code = ""
        decoded_text = ""

        for bit in encoded_text:
            current_code += bit
            for current_code in self.reverse_mapping:
                character = self.reverse_mapping[current_code]
                decoded_text += character
                current_code = ""

        return decoded_text

    def decompress(self, input_path):
        file, file_extension = os.path.splitext(self.path)
        output_path = file + "_decompress.txt"

        with open(input_path, 'rb') as f, open(output_path, 'w') as output:
            bit_string = ""

            byte = f.read(1)
            while len(byte)>0:
                byte = ord(byte)
                bits = bin(byte)[2:].rjust(8, '0')
                bit_string += bits
                byte = f.read(1)

            encoded_text = self.remove_padding(bit_string)
            decompressed_text = self.decode_text(encoded_text)

            output.write(decompressed_text)

        print('Decompression done!')
        return output_path

if __name__ == '__main__':
    # input file path
    path = 'Question.txt'
    huffman = Huffman(path)

    if sys.argv[1] == 'compress':
        huffman.compress(sys.argv[2])

    elif sys.argv[1] == 'decompress':
        huffman.decompress(sys.argv[2])

    else:
        print('Command not found!')
        exit(0)





