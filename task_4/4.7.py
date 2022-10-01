def numbers(n):
    p = 1
    s = 0
    for i in range(1, n + 1):
        p *= i
        s += p
    print(s)