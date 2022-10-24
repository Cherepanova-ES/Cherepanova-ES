# вариант 15
a = [int(input()) for i in range(5)]
print(a)
c = list(set(a))

def find_duplicates(a):
    for cc in c:
        b = []
        for i in range(0, len(a)):
            if a[i] == cc:
                b.append(i)
        if len(b) > 1:
            print(cc)
find_duplicates(a)