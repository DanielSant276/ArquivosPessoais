# Letra a
veloc_ini_y = 25
t = [0.0, 0.6, 1.3, 2.0, 2.6, 3.3, 3.9, 4.6, 5.3, 6.0]
g = 9.8
h = []

for i in range(6):
  altura = (veloc_ini_y * t[i]) - ((g * ((t[i])*(t[i]))) / 2)
  h.append(altura)
  print(f"Aos {str(t[i])} segundos, a altura será de: {str(h[i])} metros.")

maior_altura = h[0]

# Letra b
for i in range(1, 6):
  if maior_altura < h[i]:
    maior_altura = h[i]

print(maior_altura)

# Letra c
primeiro_ponto = 0.0
ultimo_ponto = 6.0
numero_de_pontos = 6
espaco_entre_pontos = (ultimo_ponto - primeiro_ponto) / (numero_de_pontos - 1)

print(primeiro_ponto)
for i in range(numero_de_pontos - 1):
  primeiro_ponto = primeiro_ponto + espaco_entre_pontos
  print(primeiro_ponto)

# Letra d
primeiro_ponto = 0.0
ultimo_ponto = 6.0
numero_de_pontos = 10
espaco_entre_pontos = (ultimo_ponto - primeiro_ponto) / (numero_de_pontos - 1)

print(primeiro_ponto)
for i in range(numero_de_pontos - 1):
  primeiro_ponto = primeiro_ponto + espaco_entre_pontos
  print(primeiro_ponto)
