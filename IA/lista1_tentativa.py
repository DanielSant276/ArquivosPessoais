import math

maze = [[2, 0, 0, 0, 0],
        [0, 0, 1, 1, 0],
        [0, 0, 0, 1, 0],
        [1, 0, 1, 0, 3],
        [1, 0, 0, 0, 0]]

distance = [[0, 0, 0, 0, 0],
            [0, 0, 0, 0, 0],
            [0, 0, 0, 0, 0],
            [0, 0, 0, 0, 0],
            [0, 0, 0, 0, 0]]

#[[5.0, 4.2, 3.6, 3.2, 3.0], 
# [4.5, 3.6, 9.0, 9.0, 2.0], 
# [4.1, 3.2, 2.2, 9.0, 1.0], 
# [9.0, 3.0, 9.0, 1.0, 0.0], 
# [9.0, 3.2, 2.2, 1.4, 1.0]]

posInicial = [0, 0]
posFinal = [3, 4]

caminho = [posInicial]

def distanceLength():
  for y in range(len(maze)):
    for x in range(len(maze[0])):
      if maze[y][x] != 1:
        distance[y][x] = round(math.sqrt(pow(posFinal[0] - y, 2) + pow(posFinal[1] - x, 2)), 1)
      else:
        distance[y][x] = 9.0
    
distanceLength()
cancel = False


print(distance)