def numbers(N):
    if N in (1, 2):
        return 1
    return numbers(N - 1) + numbers(N - 2)
N=int(input('Введите число N:'))
print (numbers(N))
numbers(N)