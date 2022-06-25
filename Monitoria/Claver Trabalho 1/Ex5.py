# Questão a
print("Questão a:")
veloc_ini_y = 25
t = [0.0, 1.2, 2.4, 3.6, 4.8, 6.0]
g = 9.8
h = []

for i in range(len(t)):
  altura = round(veloc_ini_y * t[i] - ((g * (t[i] * t[i])) / 2), 2)
  h.append(altura)
  print("Aos " + str(t[i]) + " segundos, a altura será de: " + str(altura) + " metros.")

#Questão b
print("\n\n\nQuestão b:")
altura_max = h[0]
tempo_altura_max = t[0]
for i in range(1, 6):
  if altura_max < h[i]:
    altura_max = h[i]
    tempo_altura_max = t[i]

print("\nA maior altura é de em " + str(altura_max) + " aos " + str(tempo_altura_max) + " segundos")

#Questão c
print("\n\n\nQuestão c:")
primeiro_ponto = float(input("Insira o primeiro ponto: "))
ultimo_ponto = float(input("Insira o último ponto: "))
numero_de_pontos = int(input("Insira a quantidade de pontos: ")) - 1
pontos = []
espaço_entre_pontos = ((ultimo_ponto - primeiro_ponto) / numero_de_pontos)

pontos.append(primeiro_ponto)
for i in range(1, numero_de_pontos + 1):
  primeiro_ponto = primeiro_ponto + espaço_entre_pontos
  pontos.append(primeiro_ponto)

print("Os pontos encontrados foram: ")
for i in pontos:
  print(round(i, 2))

#Questão d
print("\n\n\nQuestão d:")
primeiro_ponto = 0.0
ultimo_ponto = 6.0
numero_de_pontos = 10
pontos = []
espaço_entre_pontos = ((ultimo_ponto - primeiro_ponto) / numero_de_pontos)

pontos.append(primeiro_ponto)
for i in range(1, numero_de_pontos + 1):
  primeiro_ponto = primeiro_ponto + espaço_entre_pontos
  pontos.append(primeiro_ponto)

print("Os pontos encontrados foram: ")
for i in pontos:
  print(round(i, 2))

#Questão e
print("\n\n\nQuestão e:")
h = []
t = pontos

for i in range(len(t)):
  altura = round(veloc_ini_y * t[i] - ((g * (t[i] * t[i])) / 2), 2)
  h.append(altura)
  print("Aos " + str(round(t[i], 2)) + " segundos, a altura será de: " + str(altura) + " metros.")

altura_max = h[0]
tempo_altura_max = t[0]
for i in range(1, len(h) - 1):
  if altura_max < h[i]:
    altura_max = h[i]
    tempo_altura_max = t[i]

print("\nA maior altura é de em " + str(altura_max) + " aos " + str(tempo_altura_max) + " segundos")

#Questão f
print("\n\n\nQuestão f:")
primeiro_ponto = 0.0
ultimo_ponto = 6.0
numero_de_pontos = 1000
pontos = []
espaço_entre_pontos = ((ultimo_ponto - primeiro_ponto) / numero_de_pontos)

pontos.append(primeiro_ponto)
for i in range(1, numero_de_pontos + 1):
  primeiro_ponto = primeiro_ponto + espaço_entre_pontos
  pontos.append(primeiro_ponto)

print("Os pontos encontrados foram: ")
for i in pontos:
  print(round(i, 2))

h = []
t = pontos

for i in range(len(t)):
  altura = round(veloc_ini_y * t[i] - ((g * (t[i] * t[i])) / 2), 2)
  h.append(altura)
  print("Aos " + str(round(t[i], 2)) + " segundos, a altura será de: " + str(altura) + " metros.")

altura_max = h[0]
tempo_altura_max = t[0]
for i in range(1, len(h) - 1):
  if altura_max < h[i]:
    altura_max = h[i]
    tempo_altura_max = t[i]

print("\nA maior altura é de em " + str(altura_max) + " aos " + str(round(tempo_altura_max), 2) + " segundos")
