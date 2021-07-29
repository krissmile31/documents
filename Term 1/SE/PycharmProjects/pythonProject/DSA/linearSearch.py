#function for order linear search with input: list & key(keyword needing to found)
def linearSearch(list, key):
    #initilaise index
    i = 0
    #initialise the place that keyword at
    pos = -1

    #index inside a
    while i < len(list):
        #checking each element of the list in turn, until the desired element is found.
        if list[i] == key:
            pos = i     #position = index in a
        #continue if place haven't been found
        i += 1

    #the position found
    return pos

#initialise list from user
list = []
lenList = int(input("Enter the length of your list: "))
print("Enter the list: ")
#enter each number in list
for x in range(lenList):
    num = int(input())
    list.append(num)        #add each number to list
print(list)
key = int(input("The keyword you wanna search: "))
print(linearSearch(list, key))

