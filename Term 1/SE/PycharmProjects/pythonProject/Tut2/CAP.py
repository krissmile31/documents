import string

def copyString(cap):
    #the first char of each sentence capitalized
    return string.capwords(cap)
#ask user input a sentence
cap = input("Enter a string: ")
print(copyString(cap))