#Projeto de LP

A = []
B = []
C = []
for i in range (3):
    A.append(float(input(f'Digite um valor para {i+1}ª coordenada de A : ')))
    B.append(float(input(f'Digite um valor para {i+1}ª coordenada de B : ')))
    C.append(float(input(f'Digite um valor para {i+1}ª coordenada de C : '))) 

print('Os valores de A são : ', A)
print('Os valores de B são : ', B)
print('Os valores de C são : ', C)


ab = []
ac = []

for i in range(3):
    ab.append(b[i] - a[i])
    ac.append(c[i] - a[i])

print("ab", ab)
print("ac", ac)

x = [1 * ab[1] * ac[0], 1 * ab[0] * ac[1]]
y = [1 * ab[2] * ac[1], 1 * ab[2] * ac[0]]
z = [1 * ab[0] * ac[2], 1 * ab[1] * ac[2]]


print(x)
print(y)
print(z)

k = x[1] - x[0]
j = y[1] - z[0] 
i = z[1] - y[0]

print(i)
print(j)
print(k)