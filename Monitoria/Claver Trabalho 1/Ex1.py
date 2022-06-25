f = float(input("Insira o quanto você quer de valor futuro: "))
r = float(input("Insira a taxa de juros anual: "))
n = float(input("Insira o número de anos que o dinheiro permanecerá na conta: "))

p = f / ((1 + r)**n)

print("Você precisa depositar atualmente: " + str(p) + ", para conseguir depois de " + str(int(n)) + " anos, receber " + str(f))