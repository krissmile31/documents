#Dictionary for number
numberDict = {'0': 'không', '1': 'một', '2': 'hai', '3': 'ba',
              '4': 'bốn', '5': 'năm', '6': 'sáu', '7': 'bảy', '8': 'tám', '9': 'chín'}

numberClass = ['', 'ngàn', 'triệu', 'tỷ']

#read 1 number
def read1(number):
    return numberDict[number[0]]            #1st number --> find in dict  -> word form

#read 2 numbers
def read2(number):
    #number = 1*
    if number[0] == '1':
        if number[1] == '0':        # 1* = 10
            return ' mười '
        else:            #1* = 11, 12, 13,...
            return ' mười ' + numberDict[number[1]]
    # number = ab ( a ≠ 0,1 )
    else:
        if number[1] == '0':        # *0 = 20, 30,...
            #1st number + read form
            return numberDict[number[0]] + ' mươi '
        elif number[1] == '1':
            return numberDict[number[0]] + ' mươi mốt '
        elif number[1] == '4':
            return numberDict[number[0]] + ' mươi tư '
        elif number[1] == '5':
            return numberDict[number[0]] + ' mươi lăm '
        else:       #2nd number = other
            return numberDict[number[0]] + ' mươi ' + numberDict[number[1]]

#read 3 numbers
def read3(number):
    # number = *00 (100, 200, ...)
    if number[1] == '0' and number[2] == '0':
        return numberDict[number[0]] + ' trăm '

    # number = *0* (201, 506, 109,...)
    elif number[1] == '0' and number[2] != '0':
        return numberDict[number[0]] + ' trăm lẻ ' + numberDict[number[2]]

    #number = abc (with b ≠ 0)
    else:
        return numberDict[number[0]] + ' trăm ' + read2([number[1], number[2]])

#read all number
def readNumber(number):
    #beacause number splited by commas
    qu = len(number) // 3        #quotient
    mod = len(number) % 3         #modular

    #a copy of q coz q cannot be changed in function
    cp = qu

    #variable for read form
    number_string = ""


    if mod == 1:        #* or *,*** or *,***,***...
        #read form & number's class
        number_string = read1(number[0]) + " " + numberClass[qu]

    if mod == 2:        # ** or **,*** or **,***,***...
        number_string = read2([number[0], number[1]]) + " " + numberClass[qu]

    #the next 3 number after 2 above case
    for i in range(qu):
        #i= 0...qu, read the next 3 number, its class decrease to 1 after each case
        number_string += ' ' + read3([number[(i*3+mod)], number[(i*3+mod)+1], number[(i*3+mod)+2]]) + ' ' + numberClass[cp-1]
        cp -= 1
    return number_string

number = input("Enter your number: ")
print(readNumber(number))