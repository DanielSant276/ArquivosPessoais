import random

maximo_consultas = int(input("Insira o número máximo de consultas (número maior que 2): "))
pre_agendados = 2
gerar_pacientes = 0

for i in range(5):
  pacientes_consultador = random.randrange(pre_agendados, maximo_consultas + 1)
  print(pacientes_consultador)
  gerar_pacientes = gerar_pacientes + pacientes_consultador
  

media_pacientes = gerar_pacientes / 5
print("média de consultas no dia = " + str(media_pacientes))