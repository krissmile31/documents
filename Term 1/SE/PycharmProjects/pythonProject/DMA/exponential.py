def decimalToBinary(d):
    s = []
    while (d != 0):
        d %= 2
        print(d)
        s.append(d)
        d //= 2
    print(s)

def main():
    d = 55
    print(decimalToBinary(d))

main()
