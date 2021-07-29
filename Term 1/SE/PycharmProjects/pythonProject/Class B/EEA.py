
def gcd(a,n):
    q = []
    while ( a != 0):
        q.append(n // a)
        temp = n % a
        n = a
        a = temp
    return q,n
def EEA(n,q):
    p = []
    p.append(0)
    p.append(1)
    print('p0 = 0\np1 = 1')
    for i in range(2,len(q)+1):
        y = p[i-2] -p[i-1]*q[i-2]
        y %= n
        print('p', i,' = ', p[i-2] , ' - ', p[i-1], '.', q[i-2], ' mod ', n, ' = ', y, sep = '')
        p.append(y)
    return p[len(q)]
def root(r,b,n,d):
    x0 = r * (b/d) % (n/d)
    return int(x0)

def main():
    a = 43
    b = 6
    n = 341
    x = gcd(a, n)
    r = EEA(n,x[0])
    print('result = ',root(r,b, n, x[1]))

main()