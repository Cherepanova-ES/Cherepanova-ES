def numbers(n):
    p = -1
    s = 0
    m = 0
    while n != 0:
        if p == n:
            s += 1
        else:
            p = n
            m = max(m, s)
            s = 1
        n = int(input())
    m = max(m, s)
    print(m)


n = int(input())
numbers(n)
