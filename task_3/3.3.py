def clock(n):
    h = n % (60 * 24) // 60
    n = n % 60
    print(h, ':', n)


n = int(input('Введите количество минут:'))
clock(n)
