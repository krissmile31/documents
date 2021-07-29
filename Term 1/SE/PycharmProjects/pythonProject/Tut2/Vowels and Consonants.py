
sentence = input("Enter a string: ")

#count vowels in string
def Vowel(sentence):
    #default vowels in alphabet
    vowel = ['u', 'e', 'o', 'a', 'i']
    # initialise count variable
    count = 0

    for i in sentence.lower():
        if i in vowel:      # i is 'ueoai'
            count += 1
    return count

#count consonants in string
def Consonant(sentence):
    # initialise count variable
    count = 0

    for i in sentence.lower():
        if i not in ['u', 'e', 'o', 'a', 'i']:      #i is not vowel
            count += 1
    return count

print("The number of vowels: ", Vowel(sentence))
print("The number of consonants: ", Consonant(sentence))