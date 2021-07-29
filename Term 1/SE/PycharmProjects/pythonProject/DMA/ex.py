def decimalToBinary(x):
    bin = []
    while (x >= 1):
        bin.append(x % 2)
        x = x // 2
        decimalToBinary(x)
    str = [i for i in bin]
    bin = str[::-1]
    return bin

def cal(c, d, n, s, g):
    bin = decimalToBinary(d)
    for i in range(len(bin)):
        r = c**(2**i) % n
        print(c,'^(2^', i , ') mod ', n, ' = ', r, sep='')
    x = 1
    for i in g:
        x *= c**(2**i)
        print(c, '^', '(2^',i)
    k = x%n
    print(k)


def convert(d, s):
    for i in range(d):
        if 2**i == d:
            s.append(i)
            return
        elif 2**i > d:
            s.append(i-1)
            convert(d - 2**(i-1), s)
            return

def write(s):
    g = []
    kq = ""
    for i in range(len(s)):

        print(i)
        kq += "2^" + str(s[i])
        if i != len(s) - 1:
            kq += "+"
    print(kq)
    return g

s = []
c = 667
n = 2537
d = 555

list = [decimalToBinary(d)]
print()
convert(d, s)
write(s)
cal(c, d, n, list, write(s))






