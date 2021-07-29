
list = [5, 6,1]

for j in range(len(list)):
    iss = False

    for i in range(len(list)-1):
        if list[i] > list[i + 1]:
            temp = list[i]
            list[i] = list[i + 1]
            list[i + 1] = temp
            iss = True
    if iss == False:
        break

print(list)

