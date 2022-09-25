print('Введите ваш возраст:')
age = int(input())
print('Введите ваше имя:')
name = str(input())
if (age > 0) and (age < 70) and ("Иван" != name):
    if age >= 16:
        print("Поздравляем, вы поступили в ВГУИТ!")
    if age <= 16:
        print('Сначала нужно окончить школу!')
        print ('Вам еще учится в школе:', 16 - age, 'лет')
