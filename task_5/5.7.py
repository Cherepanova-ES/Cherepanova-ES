def numbers(a1,a):
    s = 0
    while a != 0:
        if a > a1:
            s += 1
        a1 = a
        a = int(input())
    print(s)
a1 = int(input())
a = int(input())
numbers(a1,a)
