var1 = True
var2 = False
var3 = False

if var3 or var2 and var1:
 print("True")
else:
 print("False")

x = True

y = False

z = False

if (not x or y):

    print(1)

elif (not x or not y and z):

    print(2)

elif (not x or y or not y and x):

    print(3)

else:

    print(4)
print(x or y and z)