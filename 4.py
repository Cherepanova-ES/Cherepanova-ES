print ("Введите количество секунд:")
seconds = int(input())
m=seconds//60
h=m//60
d=h//24
print (seconds, 'сек=', d,'д,', h, 'ч,', m,'мин,')