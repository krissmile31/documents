from huffman import HuffmanCoding

#input file path
path = "/home/ubuntu/Downloads/sample.txt"

h = HuffmanCoding(path)

output_path = h.compress()
h.decompress(output_path)