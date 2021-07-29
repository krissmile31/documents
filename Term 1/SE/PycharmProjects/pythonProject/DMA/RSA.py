
def gcd(e,z):
    q = []
    while ( e != 0):
        q.append(z // e)
        temp = z % e
        z = e
        e = temp
    return q,z

def EEA(z,q):
    p = []
    p.append(0)
    p.append(1)
    for i in range(2,len(q)+1):
        y = p[i-2] -p[i-1]*q[i-2]
        y %= z
        p.append(y)
    return p[len(q)]

def root(r,b,z,d):
    x0 = r * (b/d) % (z/d)
    return int(x0)

def main():
    p = 7
    q = 11
    e = 17
    n = p * q
    z = (p - 1) * (q - 1)
    x = gcd(e, z)
    r = EEA(z, x[0])
    d = root(r,1, n, x[1])

    while True:
        print('Do u want encrypt or decrypt message [D/E]:')
        s = input()
        if s == 'D':
            # use private key (n, d)
            print('c1 = ', end ='')
            c1 = int(input())
            print('c2 = ', end ='')
            c2 = int(input())
            print('c3 = ', end ='')
            c3 = int(input())

            m1, m2, m3 = (c1**d) % n, (c2**d) % n, (c3**d) % n
            print('The decrypted message: ', end="")
            print(chr(m1), chr(m2), chr(m3))
            break

        elif s == 'E':
            # use public key (n, e)
            print('m1 = ', end ='')
            m1 = int(input())
            print('m2 = ', end ='')
            m2 = int(input())
            print('m3 = ', end ='')
            m3 = int(input())
            c1, c2, c3 = (m1 ** e) % n, (m2 ** e) % n, (m3 ** e) % n
            print('The encrypted message: ', end="")
            print(chr(c1), chr(c2), chr(c3))
            break

        else:
            print('Invalid input~')
            print()


main()

