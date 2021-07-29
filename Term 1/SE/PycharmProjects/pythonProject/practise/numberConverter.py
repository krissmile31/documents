
numberWord = {'0': 'không', '1': 'một','2': 'hai','3': 'ba',
                  '4': 'bốn','5': 'năm','6': 'sáu','7': 'bảy',
                  '8': 'tám','9': 'chín','10': 'mười'}
numberClass = ["", "ngàn", "triệu", "tỷ"]


def read1(number):
    return numberWord[number[0]]

def read2(number):
    if number[0] == '1':
        number_string = 'mười '
    else:
        number_string = numberWord[number[0]] + ' mươi '
    if number[1] != '0':
        number_string += numberWord[number[1]]
    return number_string

def read3(number):
    if number[1] == '0' and number[2] == '0':
        return numberWord[number[0]] + ' trăm '
    elif number[1] == '0' and number[2] != '0':
        return numberWord[number[0]] + ' trăm lẻ '
    else:
        combine = [number[0], number[1]]
        return numberWord[number[0]] + read2(combine)


def read(number):
    quotient = len(number) // 3
    modular = len(number) % 3
    q = quotient
    number_string = ""

    if modular == 1:
        number_string = read1(number[0]) + numberClass[quotient]
    elif modular == 2:
        combine = [number[0], number[1]]
        number_string = read2(combine) + numberClass[quotient]

    for i in range(quotient):

        number_string += " " + read3([number[i * quotient + modular], number[i * quotient + modular+1], number[i * quotient + modular+2]]) + " " + numberClass[q-1]
        q -= 1
    return number_string

number = input("Enter your number: ")
print(read(number))