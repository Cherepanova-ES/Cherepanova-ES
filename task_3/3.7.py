a = int(input('Введите натуральное число:'))
if (a % 4 == 0) and (a % 100 != 0) or (a % 400 == 0):
    print('ДА')
else:
    print('НЕТ')
