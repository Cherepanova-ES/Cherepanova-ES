import math

x = float(input('Введите переменную x:'))
y = float(input('Введите переменную y:'))
z = float(input('Введите переменную z:'))
s = (math.pow(y + math.pow(x - 1, 1 / 3), 1 / 4)) / \
    ((math.fabs(x - y)) * (math.sin(z) ** 2 + math.tan(z)))
print('s=', s)
