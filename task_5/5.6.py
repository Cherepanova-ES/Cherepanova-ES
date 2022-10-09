def numbers(n):
    s = 0
    i = 0
    m = 0
    while n != 0:
        s += n
        n = int(input())
        i += 1

    m = (s / i)
    print(m)


n = int(input())
numbers(n)
