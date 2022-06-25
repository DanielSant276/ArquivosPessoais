qtd_inicio = int(input("Insira o número de mosquitos no dia 0: "))
aumento_porcentagem = int(input("Insira o aumento diário da população (em porcentagem, mas sem o símbolo %): "))
num_dias = int(input("insira o número de dias que os mosquitos terão para se reproduzir: "))

print("Número inicial de mosquitos:       " + str(qtd_inicio))
print("Aumento diário médio (%):          " + str(aumento_porcentagem))
print("Número de dias para reprodução:    " + str(num_dias))

print("\nDia       População")
print("-------------------------")
print("0         " + str(round(float(qtd_inicio), 1)))

for i in range(1, num_dias + 1):
  qtd_inicio = round(qtd_inicio * (100 + aumento_porcentagem) / 100, 1)
  print(str(i) + "         " + str(qtd_inicio))