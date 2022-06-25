def ingressar_dados():
  produto               = input('Qual o produto comprado: ')
  ano_da_compra         = int(input('Qual o ano da compra? '))
  custo                 = float(input('Valor do produto: '))
  tempo_de_vida         = float(input('Tempo de vida do produto em anos: '))
  metodo_de_depreciacao = input('Qual o método de depreciação? ')
  dados                 = [produto, ano_da_compra, custo, tempo_de_vida, metodo_de_depreciacao]

  return dados

def monta_tabela_de_indormacao(produto, ano_da_compra, custo, tempo_de_vida, metodo_de_depreciacao):
  print(f'Produto              : {produto}')
  print(f'Ano da compra        : {ano_da_compra}')
  print(f'Custo                : R$ {custo}')
  print(f'Tempo de vida        : {tempo_de_vida} anos')

  if metodo_de_depreciacao == 'SL':
    print(f'Método de depreciação: Linear\n\n')
    montar_tabela_SL(ano_da_compra, custo, tempo_de_vida)
  else:
    print(f'Método de depreciação: Saldo Decrescentes Duplos\n\n')
    montar_tabela_DDB(ano_da_compra, custo, tempo_de_vida)

def montar_tabela_SL(ano_da_compra, valor, num_anos):
  print(f'         Valor no    Monto deprec.      Total deprec.')
  print(f'           inicio           no ano    no final do ano')
  matriz = [[]]
  
  while num_anos > 0:
    print(f'{ano_da_compra}')
    
    ano_da_compra = ano_da_compra + 1
    num_anos = num_anos - 1

  return matriz

def montar_tabela_DDB(ano_da_compra, valor, num_anos):
  print(f'         Valor no    Monto deprec.      Total deprec.')
  print(f'           inicio           no ano    no final do ano')
  matriz = [[]]
  
  while num_anos > 0:
    print(f'{ano_da_compra}')

    ano_da_compra = ano_da_compra + 1
    num_anos = num_anos - 1
  
  return matriz

lista_de_dados = ingressar_dados()
monta_tabela_de_indormacao(lista_de_dados[0], lista_de_dados[1], lista_de_dados[2], lista_de_dados[3], lista_de_dados[4])