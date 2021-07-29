
def bubleSort(list):
    for j in range(len(list)):
        isSorted = False

        for i in range(len(list)-1):
            # check and swap two adjacent number  --> ascending sort
            if list[i] > list[i+1]:
                temp = list[i]
                list[i] = list[i+1]
                list[i+1] = temp
                isSorted = True
                
        if isSorted == False:
            break
    return list         #sorted list

def main():
    #initialise array list
    list = []
    lenList = int(input("Enter the length of list: "))

    #input array list
    for i in range(lenList):
        num = int(input())
        list.append(num)
    print(list)
    print(bubleSort(list))

main()