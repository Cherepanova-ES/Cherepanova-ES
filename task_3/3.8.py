a = int(input('Введите число a:'))
b = int(input('Введите число b:'))
c = int(input('Введите число c:'))
if (a==b==c):
    print('3')
elif (a==b) or (b==c) or (a==c):
    print('2')
else:
    print('0')
