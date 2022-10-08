def numbers(n):
    m = 2
    p = 1
    while m <= n:
        m *= 2
        p += 1

    print(p - 1, m // 2)
