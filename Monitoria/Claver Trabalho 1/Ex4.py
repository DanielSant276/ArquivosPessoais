tabela = [[0,0,0,0,0],[0,0,0,0,0],[0,0,0,0,0],[0,0,0,0,0]]

for i in range(4):
  for j in range(5):
    tabela[i][j] = (i + 1) + (j * 2)

for i in range(4):
  for j in range(5):
    print(f"{tabela[i][j]:>3}",end=' ')
  print() 