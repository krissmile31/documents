#input a string
sentence = input("Enter a sentence (all of words are run together but the first character of each word is uppercase): \n")

# Convert sentence: words are separated by spaces, lowercase and capitalise
def convert(sentence):
    #initialise result
    word = ""
        #loop over elements in sentence
    for i in sentence:
        #uppercase --> lowercase with space
        #only the first word starts with an uppercase letter
        if i.isupper() and i != sentence[0]:        #exclude the first char
           word += ' ' + i.lower()

        #i.islower(): normal form
        else:
            word += i
    return word

print(convert(sentence))