#declare Dictionary
alphaDict = {"ABC": '2', "DEF": '3', "GHI": '4', "JKL": '5', "MNO": '6', "PQR": '7', "STUV": '8', "WXYZ": '9'}

#method for translating
def Trans(phoneNum):
    # initialize result
    num = ""
    #loop over the input
    for i in phoneNum:
        #input = number || = "-" --> append it to result
        if i.isdigit() or i=='-':
            num += i
            continue

        # check alphabet in dict & append to result
        for key, value in alphaDict.items():
            #i: uppercase
            if i.upper() in key:
                #result = its value
                num += alphaDict[key]
                break       #break to check whether the next char is number, word or '-'
    return num      #result

#input from user
phoneNum = input("Enter  a 10-character telephone number in the format XXX-XXXXXXX: ")
print(Trans(phoneNum))