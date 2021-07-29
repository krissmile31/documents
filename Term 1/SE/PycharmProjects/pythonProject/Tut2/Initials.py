#ask user's name
fullName = input("Please enter your first, middle and last name, separated by a space: "  )
#Split name on a " " (space) delimiter
name = fullName.split(" ")

for i in range(len(name)):
    #take the first char in each element
    name[i] = name[i][0:1]

# join using a '. ' hyphen
name = ". ".join(name)
print(name.upper())      #the fisrt char capitalize