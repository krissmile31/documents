import math
def Info(m, n):
    p1 = m/(m+n)
    p2 = n/(m+n)

    # H = []
    # for i in range(a):
    H = -p1 * (math.log2(p1)) - p2 * (math.log2(p2))
    if (m == 0 or n == 0):
        H = 0
    elif (m == n):
        H = 1
        #
        # H.append(entropy)

    # if (m == 0 or n==0):
    #     H = 0
    # elif (m==n):
    #     H = 1

    return H

def averageInfo(m, n, sum, a):
    p = m+n
    average = 0
    for i in range(a):
        average += Info(m, n, a) * (p/sum)

    return average
# def infoGain(yes, no):
#     S = entropy(yes, no)
#     return S

def gain(yes, no, m, n, sum):
    Gain = Info(yes, no) - averageInfo(m, n, sum)

    return Gain


def count(e):
    m=0
    n=0
    for i in range(len(e)):
        if e == 'yes':
            m += 1
        elif e == 'no':
            n += 1
    return m, n
sauceColor = ['red', 'white', 'pink']
red = ['yes', 'yes', 'no', 'no', 'no']
a = count(red)
print(a)
white = ['yes', 'yes', 'no']
b = count(white)
pink = ['yes', 'yes']
c = count(pink)

print(Info(b[0], b[1]))



