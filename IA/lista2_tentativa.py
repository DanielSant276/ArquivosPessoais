# Questão 1 - utilizando roleta
import numpy as np
import random as rd

tam_cromossomo = 6
prob_cruzamento = 1
prob_mutacao = 0.1
tam_populacao = 4

# 1º passo - gerar a geração aleatória da população inicial.
pop_inicial = np.zeros((tam_populacao, tam_cromossomo))
for i in range(tam_populacao):
  for j in range(tam_cromossomo):
    random_number = rd.uniform(0, 1)
    if random_number >= 0.5:
      pop_inicial[i][j] = 1
    else:
      pop_inicial[i][j] = 0
    
# 2º passo - verificar o valor de x
val_x = np.zeros(tam_populacao)
for i in range(tam_populacao):
  for j in range(tam_cromossomo):
    val_x[i] += (2 ** j) * pop_inicial[i][-j - 1]

# 3º passo - gerar a aptidão
aptidao = np.zeros(tam_populacao)
for i in range(tam_populacao):
    aptidao[i] = val_x[i]**2 + 5 * val_x[i] - 5

# 4º passo - define a roleta
prob_roleta = [12, 37, 78, 92]
numero_sorteado = rd.randint(0,100)
pais_escolhidos = []

for i in range(tam_populacao):
    if prob_roleta[i] >= numero_sorteado:
        print() #prob_roleta[i].
    elif i == tam_populacao - 1:
        pais_escolhidos.append(val_x[i])


print(pop_inicial)
print(val_x)
print(aptidao)




# x varia de [0, 63]
# funcao = x**2 + 5 * x - 5
