def sport(x, y):
    i = 1
    while x < y:
        x *= 1.1
        i += 1
    print(i)


x = int(input())
y = int(input())
sport(x, y)
