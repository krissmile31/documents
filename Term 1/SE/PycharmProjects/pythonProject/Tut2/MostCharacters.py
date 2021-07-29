from collections import Counter

sentence = input("Enter a string: ")
k= Counter(sentence)
d = max(k.values())
i = k.values().index(d)
print("The character appears most frequently in the string: ")
print (k.items()[i])