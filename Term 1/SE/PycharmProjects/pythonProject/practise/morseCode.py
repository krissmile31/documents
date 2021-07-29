# Programming Morse Code

def encryption(morse_string):
    # Dictionary of Morse codes
    morseDict = {'A': '.-', 'B': '-...',
                       'C': '-.-.', 'D': '-..', 'E': '.',
                       'F': '..-.', 'G': '--.', 'H': '....',
                       'I': '..', 'J': '.---', 'K': '-.-',
                       'L': '.-..', 'M': '--', 'N': '-.',
                       'O': '---', 'P': '.--.', 'Q': '--.-',
                       'R': '.-.', 'S': '...', 'T': '-',
                       'U': '..-', 'V': '...-', 'W': '.--',
                       'X': '-..-', 'Y': '-.--', 'Z': '--..',
                       '1': '.----', '2': '..---', '3': '...--',
                       '4': '....-', '5': '.....', '6': '-....',
                       '7': '--...', '8': '---..', '9': '----.',
                       '0': '-----', ', ': '--..--', '.': '.-.-.-',
                       '?': '..--..', '/': '-..-.', '-': '-....-',
                       '(': '-.--.', ')': '-.--.-'}

    morseCode = ""
    for i in morse_string:
        #convert input to upper string and encryption with dictionary of morse codes

        for key, value in morseDict.items():
            if i.upper() in key:
                morseCode += morseDict[key]
        # morseCode += morseDict[i.upper()]
    return morseCode

# Get the string as input from the user.
morse_string = input('Enter the string to be ' \
                         'converted to Morse code: ')
print(encryption(morse_string))