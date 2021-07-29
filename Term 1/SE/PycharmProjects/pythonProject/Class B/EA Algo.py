def gcd(a, n):

    while (n!=0):
        quotient = []

        if (n!=0):
            quotient.append(a//n)
            remainder = a%n
            ptemp = a
        a = n
        n = temp % nrint('Dividend: ' ,a , '\tdivisor: ' , n ,'\tQuotient: ' , quotient , '\tRemainder: ' , remainder)
    return quotient, a

def EEA(n, q):
    p = []
    p.append(0)
    p.append(1)
    p[0] = 0
    p[1] = 1
    print('p0 = 0\np1 = 1')
    for i in range(2, len(q)):
        y = p[i-2] - p[i-1] * q[i-2]
        y %= n
        p.append(y)
        print('p', i, '=', y)

    r = p[len(q)]
    return r

def root(r, a, b, n):
    d = gcd(a, n)
    x0 = r * (b/d) % (n/d)
    return x0

a = 43
b = 6
n = 341
x = gcd(a, n)
r = EEA(n, x[0])
print(root(r, b, n, x[1]))

