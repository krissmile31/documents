from collections import Counter
if __name__ == '__main__':
    list = []
    a = [5, 'a', 'b', 't', 5]
    b = Counter(a)
    print(b)
    for key, value in b.items():
        if value == 1:
            list.append(key)
    print(list)
    [1, 2, 3, 4, 1, 4, 1].count(1)
