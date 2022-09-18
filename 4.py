print("Введите количество секунд:")
seconds = int(input())

sec_in_day = 60 * 60 * 24
sec_in_hour = 60 * 60
sec_in_min = 60

d = seconds // sec_in_day
h = (seconds - (d * sec_in_day)) // sec_in_hour
m = (seconds - (d * sec_in_day) - (h * sec_in_hour)) // sec_in_min
s = (seconds - (d * sec_in_day) - (h * sec_in_hour) - (m * sec_in_min))
print(seconds, 'сек = ', d, 'д,', h, 'ч,', m, 'мин,', s, 'сек')
