# вариант 15
from math import fabs

# заполнение матрицы
with open('Cherepanova_ES_U-222_vvod.txt', 'r') as f:
    R = [[int(num) for num in line.split(',')] for line in f if line.strip() != ""]

m = len(R)      # кол-во строк в матрице
n = len(R[0])   # кол-во столбцов в матрице
S = []          # матрица [номер строки с нечетными эленетами][сумма модулей элементов в строке]


def show_matrix():
    for i in R:
        print(i)


def all_row_odd(i):
    for j in range(n):
        if  R[i][j] % 2 == 0:
            return False
    return True


def calculate_mod_row(i):
    sum = 0
    for j in range(n):
        sum += fabs(R[i][j])
    return sum


def get_row_with_max_sum():
    if not S:
        return []

    row_with_max_sum = S[0]
    for i in range(len(S)):
        if S[i][1] > row_with_max_sum[1]:
            row_with_max_sum = S[i]
    return R[row_with_max_sum[0]]


def process_matrix():
    for i in range(m):
        if all_row_odd(i):
            S.append([i, calculate_mod_row(i)])
    return get_row_with_max_sum()


print('Исходная матрица:')
show_matrix()
row = process_matrix()
print('Cтрока с максимальной суммой модулей элементов:', row)