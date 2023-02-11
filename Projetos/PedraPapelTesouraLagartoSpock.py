j1 = ""
j2 = ""

while(j1 != "lagarto") or (j1 != "pedra") or (j1 != "papel") or (j1 != "tesoura") or (j1 != "spock"):
    print("1")
    j1 = input()

while(j2 != "lagarto") or (j2 != "pedra") or (j2 != "papel") or (j2 != "tesoura") or (j2 != "spock"):
    print("2")
    j2 = input()

if(j1 == "lagarto"):
    if(j2 == "pedra" or j2 == "tesoura"):
        print("Jogador 2 venceu")
    
    else:
        print("Jogador 1 venceu")
    
elif(j1 == "spock"):
    if(j2 == "papel" or j2 == "lagarto"):
        print("Jogador 2 venceu")
    
    else:
        print("Jogador 1 venceu")
    
elif(j1 == "tesoura"):
    if(j2 == "pedra" or j2 == "spock"):
        print("Jogador 2 venceu")
    
    else:
        print("Jogador 1 venceu")
    
elif(j1 == "papel"):
    if(j2 == "tesoura" or j2 == "lagarto"):
        print("Jogador 2 venceu")
    
    else:
        print("Jogador 1 venceu")
    
elif(j1 == "pedra"):
    if(j2 == "papel" or j2 == "spock"):
        print("Jogador 2 venceu")
    
    else:
        print("Jogador 1 venceu")
    

