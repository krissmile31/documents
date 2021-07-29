
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

def key(p, q, e):
    n = p * q
    z = (p - 1) * (q - 1)
    x = gcd(e, z)
    r = EEA(z, x[0])
    # private  key
    d = root(r, 1, n, x[1])
    return n, d

def signature(d, n, e, x):
    #generate the signature
    #“encrypt” the message x with the private key
    s = (x**d) %n
    # Append s to message x

    # verify the signature
    #“decrypt” the signature with the public key
    x1 = (s**e) %n
    if (x==x1):
        print(' the signature is valid')
    else:
        print(' invalid signature')



def main():
    p = 7
    q = 11
    e = 17
    # suppose that  signature s onto the message x = 2
    x = 2
    a = key(p, q, e)
    # d - private key, e,n - public key
    signature(a[1], a[0], e, x)


main()

