def Media_de_Todos(Mes,mat_mes,Total_Dias_Mes):
    Mes = 0
    while Mes != 12:
        Mes = Mes + 1
        arquivo = open('passos.txt', 'r') 
        linha1 = arquivo.readline()
        Mes = int(Mes)
        mat_mes = []
        Total_Dias_Mes = int

        limites = [[0, 30],
                  [31, 58],   
                  [59, 89],   
                  [90, 119],  
                  [120, 150], 
                  [151, 180], 
                  [181, 211], 
                  [212, 242], 
                  [243, 272], 
                  [273, 303], 
                  [304, 333], 
                  [334, 365]]

        if Mes == 1:
            Total_Dias_Mes = 31
        if Mes == 2:
            Total_Dias_Mes = 28
        if Mes == 3:
            Total_Dias_Mes = 31
        if Mes == 4:
            Total_Dias_Mes = 30
        if Mes == 5:
            Total_Dias_Mes = 31
        if Mes == 6:
            Total_Dias_Mes = 30
        if Mes == 7:
            Total_Dias_Mes = 31
        if Mes == 8:
            Total_Dias_Mes = 31
        if Mes == 9:
            Total_Dias_Mes = 30
        if Mes == 10:
            Total_Dias_Mes = 31
        if Mes == 11:
            Total_Dias_Mes = 30
        if Mes == 12:
            Total_Dias_Mes = 31

        for i in range(365):
            linha = arquivo.readline()
            if i >= limites[(Mes - 1)][0] and i <= limites[(Mes - 1)][1]:
                mat_mes.append(linha)

        for i in range(len(mat_mes)):
            mat_mes[i] = float(mat_mes[i])
        media = sum(mat_mes) / Total_Dias_Mes
        print(f'a media do mes {Mes} e {round(media, 2)}')

def calcular_media_dos_passos(mat_mes,Total_Dias_Mes):
    media = sum(mat_mes)/Total_Dias_Mes
    print(f'a media foi de {round(media,2)}')

    return media

arquivo = open('passos.txt', 'r')
linha1 = arquivo.readline()
print('Bom Dia Dr. Pilares')
print(f'Lendo os dados de {linha1}')
print('Para encerar o programa digite: "fim"')
print('Para todos os meses digite: "todos" ')

while True:
    arquivo = open('passos.txt', 'r')
    linha1 = arquivo.readline()
    Mes = input("Ingresse o numero do mes: ")
    mat_mes = []
    Total_Dias_Mes = int

    if Mes.lower() in ('fim', '"fim"', "'fim'"):
        break
    if Mes.lower() in ('todos','"todos"',"'todos'"):
       Mes = 1
       mat_mes = []
       Total_Dias_Mes = int
       Media_de_Todos(Mes,mat_mes,Total_Dias_Mes)
       continue

    Mes = int(Mes)

    limites = [[0, 30],
               [31, 58],   
               [59, 89],   
               [90, 119],  
               [120, 150], 
               [151, 180], 
               [181, 211], 
               [212, 242], 
               [243, 272], 
               [273, 303], 
               [304, 333], 
               [334, 365]]

    if Mes == 1:
        Total_Dias_Mes = 31
    if Mes == 2:
        Total_Dias_Mes = 28
    if Mes == 3:
        Total_Dias_Mes = 31
    if Mes == 4:
        Total_Dias_Mes = 30
    if Mes == 5:
        Total_Dias_Mes = 31
    if Mes == 6:
        Total_Dias_Mes = 30
    if Mes == 7:
        Total_Dias_Mes = 31
    if Mes == 8:
        Total_Dias_Mes = 31
    if Mes == 9:
        Total_Dias_Mes = 30
    if Mes == 10:
        Total_Dias_Mes = 31
    if Mes == 11:
        Total_Dias_Mes = 30
    if Mes == 12:
        Total_Dias_Mes = 31

    
    for i in range(365):
        linha = arquivo.readline()
        if i >= limites[(Mes-1)][0] and i <= limites[(Mes-1)][1]:
            mat_mes.append(linha) 

    for i in range(len(mat_mes)):
        mat_mes[i] = float(mat_mes[i])

    calcular_media_dos_passos(mat_mes, Total_Dias_Mes)
    Mes = str(Mes) 
    arquivo.close()