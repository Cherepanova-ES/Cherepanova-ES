def chocolate(n, m, k):
    if n * m / 2 == k:
        print('ДА')
    else:
        print('НЕТ')


n = int(input('Введите длину шоколадки:'))
m = int(input('Введите ширину шоколадки:'))
k = int(input('Введите количество долек:'))
chocolate(n, m, k)
