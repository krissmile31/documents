number_string = ["không", "một", "hai", "ba", "bốn", "năm", "sáu", "bảy", "tám", "chín"]
number_class = ["", "ngàn", "triệu", "tỷ"]


def read1(number):
    return number_string[int(number[0])]


def read2(number):
    if number[0] == "1":
        tens = "mươi "
    else:
        tens = number_string[int(number[0])] + " mươi "

    if number[1] != "0":
        tens += number_string[int(number[1])]
    return tens


def read3(number):
    if number[1] == "0" and number[2] == "0":
        return number_string[int(number[0])] + " trăm"
    if number[1] == "0" and number[2] != "0":
        return number_string[int(number[0])] + " trăm lẻ " + number_string[int(number[2])]

    s = [number[1], number[2]]
    return number_string[int(number[0])] + " trăm " + read2(s)


# print(read3("900"))
def read(number):
    a = len(number) // 3
    b = len(number) % 3
    c = a
    tens = ""

    if (b == 1):
        tens = read1([number[0]]) + " " + number_class[a]
    elif (b == 2):
        tens = read2([number[0], number[1]]) + " " + number_class[a]

    for i in range(a):
        tens += " " + read3([number[i * 3 + b], number[i * 3 + b + 1], number[i * 3 + b + 2]]) + " " + number_class[
            c - 1]
        c -= 1
    return tens


def checkNum(number):
    for i in number:
        if i < "0" or i > "9":
            return False
    return True


def readNum(number):
    if checkNum(number):
        print(read(number))
    else:
        print("Not number")


num = input("Enter your number: ")
readNum(num)

