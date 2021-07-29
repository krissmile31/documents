from collections import Counter

#ask user input a string
stringCount = input("Enter a string: ")

#count char appearing most in that string
count = Counter(stringCount).most_common(1)

print("Character that appears most frequently in the string: " )
print(count)