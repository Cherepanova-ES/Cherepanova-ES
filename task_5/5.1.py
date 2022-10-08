def numbers(n):
    i = 1
    x = 1
    while n != x:
        for i in range(1, n + 1):
            if n > x:
                x = i ** 2
                i = i + 1
                print(x)
            elif n <= x:
                break