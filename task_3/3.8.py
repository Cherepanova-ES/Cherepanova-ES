def numbers(a, b, c):
    if (a == b == c):
        print('3')
    elif (a == b) or (b == c) or (a == c):
        print('2')
    else:
        print('0')