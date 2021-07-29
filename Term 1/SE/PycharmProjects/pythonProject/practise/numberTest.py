
#Dictionary for numbers
numberWord = {'0': 'không', '1': 'một','2': 'hai','3': 'ba',
                  '4': 'bốn','5': 'năm','6': 'sáu','7': 'bảy',
                  '8': 'tám','9': 'chín','10': 'mười'}
numberClass = ["", "ngàn", "triệu", "tỷ"]

#read a number
def read1(number):
    return numberWord[number[0]]        # word form in dict for number of the firstplace

#read two numbers
def read2(number):
    #number = 1* (10, 11, 12, 13,...)
    if number[0] == '1':
        if number[1] == '0':
            return 'mười '
        else:
            return 'mười ' + numberWord[number[1]]

    # #1st number ≠ 1 (2, 3, 4, 5,...)
    else:
        if number[1] == '0':
            return numberWord[number[0]] + ' mươi '
        elif number[1] == '1':
            return numberWord[number[0]] + ' mươi mốt'
        else:
            return numberWord[number[0]] + ' mươi ' + numberWord[number[1]]

    # #2nd number ≠ 0
    # if number[1] != '0':
    #     # combine with 1st number
    #     number_string += numberWord[number[1]]
    # if number[0] != '0' and number[1] == '1':
    #    number_string = numberWord[number[0]] + ' mươi mốt '
    # return number_string

#read three numbers
def read3(number):
    #2 numbers in the next order = 0 (*00 : 100, 200, 300,...)
    if number[1] == '0' and number[2] == '0':
        #1st number + read form
       return numberWord[number[0]] + ' trăm '

    #the 2nd number = 0 & the 3rd number ≠ 0 (any numbers)
    if number[1] == '0' and number[2] != '0':
        return numberWord[number[0]] + ' trăm lẻ ' + numberWord[number[2]]


    #2nd number ≠ 0 & 3rd = 0 or both ≠ 0


    return numberWord[number[0]] + ' trăm ' + read2([number[1], number[2]])



#merge all 3 read form
def readNumber(number):
    #quotient
    q = len(number) // 3
    #modular
    m = len(number) % 3
    #create a copy of a because a cannot be changed in function
    c = q
    number_string = ""


    if m == 1:
        number_string = read1(number[0]) + ' ' + numberClass[q]


    elif m == 2:
        number_string = read2([number[0], number[1]]) + ' ' + numberClass[q]


    for i in range(q):
        number_string += ' ' + read3([number[(i*q+m)], number[(i*q+m)+1], number[(i*q+m)+2]]) + ' ' + numberClass[c-1]
        c -= 1
    return number_string

number = input("Enter your number: ")
print(readNumber(number))