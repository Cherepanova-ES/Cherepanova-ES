#Блок Б номер 2
def IsPrime(n):
    k = 2
    p = 0
    while k <= pow(n, 0.5) and k > 1:
        if n % k == 0:
            p += 1
        k += 1
    return p == 0


n = int(input())
if IsPrime(n):
    print("YES")
else:
    print("NO")
