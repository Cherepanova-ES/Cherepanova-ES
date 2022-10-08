def numbers(n):
    m = n - 1
    while n % m != 0:
        m = m - 1
    if n % m == 0:
        m = n // m
        print(m)