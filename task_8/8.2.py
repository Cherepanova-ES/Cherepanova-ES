# вариант 3
s = str(input('Введите строку:'))


def convert_string(s):
    s = s.lower().split(' ')
    for i in range(len(s)):
        s[i] = ''.join(sorted(s[i]))
    print(' '.join(s))


convert_string(s)
