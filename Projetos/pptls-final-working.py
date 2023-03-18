import random

print("""
Escolha sua jogada
1- pedra
2- papel
3- tesoura
4- lagarto
5- spock
""")

j1 = int(input("J1:"))
j2 = random.randint(1,5)


print(j1)
print(j2)

if j1 == j2:
    print("Empate")
else:
    if j1 == 1 :
        if (j2 == 2 or j2 == 5):
            print("J2 ganhou!!!")
        else:
            print("J1 ganhou!!!")

    if j1 == 2 :
        if (j2 == 3 or j2 == 4):
            print("J2 ganhou!!!")
        else:
            print("J1 ganhou!!!")

    if j1 == 3:
        if (j2 == 1 or j2 == 5):
            print("J2 ganhou!!!")
        else:
            print("J1 ganhou!!!")

    if j1 == 4:
        if (j2 == 1 or j2 == 3):
            print("J2 ganhou!!!")
        else:
            print("J1 ganhou!!!")

    if j1 == 5 :
        if (j2 == 2 or j2 == 4):
            print("J2 ganhou!!!")
        else:
            print("J1 ganhou!!!")




