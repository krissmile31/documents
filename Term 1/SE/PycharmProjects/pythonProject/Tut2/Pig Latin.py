#input a string from user & split to elements by spaces
Eng = input("Enter a sentence: ").split()

#loop over elements in Eng
for i in Eng:
    #place the first letter at the end of the word
    pigLatin = i[1:] + i[0]
    #i is uppercase
    if i[1:].isupper():
        pigLatin += 'AY' + ' '
    #i is lowercase
    else:
        pigLatin += 'ay' + ' '

#show transalation
print(pigLatin)

