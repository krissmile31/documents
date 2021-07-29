def main():
    a = input('enter a : ')
    b = int(input('enter b : '))
    m = int(input('enter m : '))
    print(a,'^',b,'(mod',m ,') =',ApowBmodM(a, b, m),'mod',m)


def a_mod_m(a,m):
    number = 0

    # convert string a[i] to integer which gives
    # the digit value and form the number
    for i in range(len(a)):
        number = (number * 10 + int(a[i]))
        number = number % m

    return number

# Returns find (a^b) % m
def ApowBmodM(a, b, m):
    # Find a mod m
    # 667^937 mod 2537 = 667^(936+1) mod 2537 = 667^936 mod 2537 x 667 mod 2537
    ans = a_mod_m(a, m)
    mul = ans   # mul =667

    # now multiply ans b-1 times and take
    # mod with m
    for i in range(1,b):
        ans = ( ans* mul) % m

    return ans
# a = "667"
# b = 937
# m =2537

main()