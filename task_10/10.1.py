# вариант 15

# заполнение матрицы
with open('Cherepanova_ES_U-222_vvod.txt', 'r') as f:
    R = [[int(num) for num in line.split(',')] for line in f if line.strip() != ""]

m = len(R)      # кол-во строк в матрице
n = len(R[0])   # кол-во столбцов в матрице
c = 1           # искомое значение
d = 2           # множитель
S = []          # массив номеров строк, с найденным значением


def show_matrix():
    for i in R:
        print(i)


def save_row_number(i):
    if not S.__contains__(i):
        S.append(i)


def transform_elements_in_row(i):
    for j in range(n):
        R[i][j] *= d


def process_matrix():
    for i in range(m):
        for j in range(n):
            if R[i][j] == c:
                save_row_number(i)
                transform_elements_in_row(i)


print('Исходная матрица:')
show_matrix()
process_matrix()
print('Измененная матрица:')
show_matrix()
print('Значение:', c, 'найдено в строках с индексом:', S)