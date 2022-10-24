a = [int(input()) for i in range(5)]
print(a)
b = []


def get_array(a):
    for c in a:
        if c % 2 != 0:
            b.append(c)
    if len(b) == 0:
        print('Нечётных чисел нет')

    print(sorted(b, reverse=True))


get_array(a)
