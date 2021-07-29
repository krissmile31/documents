


#create function for counting sum of digits
def sum(digitString):
    sum = 0
    for i in digitString:
        #check whether that char i at each index is digit or not
        if (i.isdigit()):
            #count sum of digits
            sum += int(i)
    return sum

digitString = input("Enter a series of single-digit numbers (nothing seperateing them): ")
print("Sum of all the single digit numbers in the string: ", sum(digitString))
