import matplotlib.pyplot as plt
import numpy as np

def checkCaminhoNaoFoiFeito(caminho):
    return caminho not in caminhosEncerrados

m = [[2,0,0,0,0],
     [0,0,1,1,0],
     [0,0,0,1,0],
     [1,0,1,0,3],
     [1,0,0,0,0]]

posI = [0,0]
posF = [3,4]
caminhosAbertos = [{'G': 0, 'pos': posI, 'caminhoFeito': [posI]}]
caminhosEncerrados = []
resultado = {}

plt.matshow(m);

while(len(caminhosAbertos) > 0):
    atual = caminhosAbertos.pop()
    if(atual['pos'] == posF):
        print("ALG FINALIZADO", atual)    
        resultado = atual
        break
    
    print("Pos Atual", atual)
    
    caminhosEncerrados.append(atual['pos'])
    
    pos = atual['pos']
    
    if(pos[0] > 0 and m[pos[0] - 1][pos[1]] != 1 and checkCaminhoNaoFoiFeito([pos[0] - 1,pos[1]])): #cima
        caminhosAbertos.append({'G': atual['G'] + 1, 'pos': [pos[0] - 1,pos[1]], 'caminhoFeito': atual['caminhoFeito'] + [[pos[0] - 1,pos[1]]]})
    
    if(pos[1] < len(m[0]) -1 and m[pos[0]][pos[1] + 1] != 1 and checkCaminhoNaoFoiFeito([pos[0], pos[1] + 1]) ): #direita
        caminhosAbertos.append({'G': atual['G'] + 1, 'pos': [pos[0], pos[1] + 1], 'caminhoFeito': atual['caminhoFeito'] + [[pos[0], pos[1] + 1]]})
        
    if(pos[0] < len(m) -1 and m[pos[0] + 1][pos[1]] != 1 and checkCaminhoNaoFoiFeito([pos[0] + 1,pos[1]])): #baixo
        caminhosAbertos.append({'G': atual['G'] + 1, 'pos': [pos[0] + 1,pos[1]], 'caminhoFeito': atual['caminhoFeito'] + [[pos[0] + 1,pos[1]]]})
    
    if(pos[1] > 0 and m[pos[0]][pos[1] - 1] != 1 and checkCaminhoNaoFoiFeito([pos[0], pos[1] - 1])): #esquerda
        caminhosAbertos.append({'G': atual['G'] + 1, 'pos': [pos[0], pos[1] - 1], 'caminhoFeito': atual['caminhoFeito'] + [[pos[0], pos[1] - 1]]})
        
    caminhosAbertos.sort(key=lambda x: x['G'], reverse = True)
            

#COLORE CAMINHO
for caminho in resultado['caminhoFeito']:
    m[caminho[0]][caminho[1]] = 2
plt.matshow(m);    