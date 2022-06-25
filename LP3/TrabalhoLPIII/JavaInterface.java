import processing.core.*;
import java.util.Random;

public class JavaInterface extends PApplet {
  // Define algumas variáveis que serão utilizadas durante a aplicação
  PImage mage;
  PImage paladin;
  PImage warrior;
  int imageX, enemyImageX, imageY, imageSize;
  int rect1X, rect2X, rect3X, rectY;
  int rectWidth = 253;
  int rectHeight = 100;
  int rectColor;
  int rectHighlight;
  boolean rect1Over = false;
  boolean rect2Over = false;
  boolean rect3Over = false;
  boolean closeFight = false;
  String playerName;
  String playerClass;
  String enemyName;
  String enemyClass;
  String textLine1 = "";
  String textLine2 = "";
  String textLine3 = "";
  String textLine4 = "";

  // gera um número aleatório para ser utilizado no ataque do inimigo;
  Random attackOption = new Random();
  int saveAttackOption;

  // define o personagem do jogador e do inimigo
  Mage player = new Mage("Daniel");
  Warrior enemy = new Warrior("Ayrton");

  // define alguns valores para algumas variáveis
  public void setup() {
    // seta valores de nome e classe para jogador e oponente
    playerName = player.getName();
    playerClass = player.getClassName();
    enemyName = enemy.getName();
    enemyClass = enemy.getClassName();

    // seta valor de cor para o quadrado
    rectHighlight = color(210);
    rectColor = color(0xFFFFFFFF);

    // seta a posição inicial dos 3 botões
    rect1X = 10;
    rect2X = 274;
    rect3X = 536;
    rectY = 490;

    // carrega as imagens em cada variável
    mage = loadImage("mage.png");
    paladin = loadImage("paladin.png");
    warrior = loadImage("warrior.png");
    imageSize = 150;
    imageX = 50;
    enemyImageX = 500;
    imageY = 150;
  }

  // desenha na tela de momento em momento algumas informações
  public void draw() {
    // modifica os valores boleanos que definem se os botões terão ou não hover ao
    // colocar o mouse em cima
    update(mouseX, mouseY);
    

    // define a cor de fundo do background
    background(0xFFFFFFFF);

    // define a cor do texto
    fill(0xFF000000);
    // define o tamanho da fonte
    textSize(20);
    // escreve na tela as informações de texto referentes ao jogador
    text("nome: " + playerClass + " " + playerName, 50, 50);
    text("hp: " + Integer.toString(player.getHp()), 50, 80);
    text("mana: " + Integer.toString(player.getMana()), 50, 110);
    // escolhe a imagem do jogador dependendo da classe selecinada
    switch (playerClass) {
      case "Mago":
        image(mage, imageX, imageY, imageSize, imageSize);
        break;
      case "Guerreiro":
        image(warrior, imageX, imageY, imageSize, imageSize);
        break;
      case "Clérigo":
        image(paladin, imageX, imageY, imageSize, imageSize);
        break;
      default:
        break;
    }

    // escreve na tela as informações de texto referentes ao oponente
    text("nome: " + enemyClass + " " + enemyName, 500, 50);
    text("hp: " + Integer.toString(enemy.getHp()), 500, 80);
    text("mana: " + Integer.toString(enemy.getMana()), 500, 110);
    // escolhe a imagem do oponente dependendo da classe selecinada
    switch (enemyClass) {
      case "Mago":
        image(mage, enemyImageX, imageY, imageSize, imageSize);
        break;
      case "Guerreiro":
        image(warrior, enemyImageX, imageY, imageSize, imageSize);
        break;
      case "Clérigo":
        image(paladin, enemyImageX, imageY, imageSize, imageSize);
        break;
      default:
        break;
    }

    // bloco de log do combate
    text(textLine1, 20, 390);
    text(textLine2, 20, 410);
    text(textLine3, 20, 430);
    text(textLine4, 20, 450);

    // define o tamanho da linha
    strokeWeight(10);
    // desenha uma linha na posição e tamanho escolhido
    line(0, 480, 800, 480);
    // define a cor da linha
    stroke(0xFF000000);

    // define o tamanho da linha, agora para menos para não ficar com uma linha tão
    // grossa nos botões
    strokeWeight(4);
    // verifica o valor das variáveis para definir se o botão
    if (rect1Over) {
      fill(rectHighlight);
    } else {
      fill(rectColor);
    }
    // desenha o botão de ataque na tela
    rect(rect1X, rectY, rectWidth, rectHeight);
    // define a cor do texto
    fill(0xFF000000);
    // define o texto que ficará dentro do botão
    text("Atacar", 116, 550);

    // verifica o valor das variáveis para definir se o botão
    if (rect2Over) {
      fill(rectHighlight);
    } else {
      fill(rectColor);
    }
    // desenha o botão de ataque na tela
    rect(rect2X, rectY, rectWidth, rectHeight);
    // define a cor do texto
    fill(0xFF000000);
    // define o texto que ficará dentro do botão
    text("Defender", 370, 550);

    // verifica o valor das variáveis para definir se o botão
    if (rect3Over) {
      fill(rectHighlight);
    } else {
      fill(rectColor);
    }
    // desenha o botão de ataque na tela
    rect(rect3X, rectY, rectWidth, rectHeight);
    // define a cor do texto
    fill(0xFF000000);
    // define o texto que ficará dentro do botão
    text("Habilidade", 624, 550);
  }

  // chama a função que verifica se clicou com o mouse
  public void mousePressed() {
    if (!closeFight) {
      // gera um número entre 0, 1 e 2 para decidir se o inimigo vai atacar(0),
      // defender(1) e usar habilidade(2), o inimigo sempre tem prioridade na defesa
      saveAttackOption = attackOption.nextInt(3);
      if (saveAttackOption == 1) {
        enemyDefend();
      }

      // clicando nessa coordenada ativa o botão de ataque
      if (mouseX >= rect1X && mouseX <= rect1X + rectWidth &&
          mouseY >= rectY && mouseY <= rectY + rectHeight) {
        putTextInLog("player", player.attack(enemy));
      }
      // clicando nessa coordenada ativa o botão de defesa
      else if (mouseX >= rect2X && mouseX <= rect2X + rectWidth &&
          mouseY >= rectY && mouseY <= rectY + rectHeight) {
        putTextInLog("player", player.defend());
      }
      // clicando nessa coordenada ativa o botão de habilidade
      else if (mouseX >= rect3X && mouseX <= rect3X + rectWidth &&
          mouseY >= rectY && mouseY <= rectY + rectHeight) {
        // habilidade do mago é a única que atinge o oponente
        if (player.getClassName() == "Mago") {
          putTextInLog("player", player.ability(enemy));
        } else {
          putTextInLog("player", player.ability(player));
        }
      }

      if (saveAttackOption == 0) {
        enemyAttack();
      } else if (saveAttackOption == 2) {
        enemyAbility();
      }
      //reseta os valores de defesa e de buff de habilidade caso tenha sido utilizado
      reset();
      //verifica se um dos dois chegou a 0 de hp
      finalBattelVerify();
      //redesenha as informações na tela
      redraw();
    }
  }

  //ação de atacar do inimigo
  private void enemyAttack() {
    putTextInLog("enemy", enemy.attack(player));
  }

  //ação de defender do inimigo
  private void enemyDefend() {
    putTextInLog("enemy", enemy.defend());
  }

  //ação de utilizar habilidade do inimigo
  private void enemyAbility() {
    putTextInLog("enemy", enemy.ability(enemy));
  }

  //método para resetar as habilidade e defesa caso tenha sido utilizado
  public void reset() {
    player.revertDefense();
    player.revertAbility();
    enemy.revertDefense();
    enemy.revertAbility();
  }

  // Verifica se o combate terminou e trava a possibilidade de continuar jogando
  public void finalBattelVerify() {
    if (player.getHp() <= 0) {
      putTextInLog("enemy", "Você derrotou o jogador!!!");
      closeFight = true;
    } else if (enemy.getHp() <= 0) {
      putTextInLog("player", "Você derrotou seu inimigo!!!");
      closeFight = true;
    }
  }

  // tentei criar um combat log que vai se reescrevendo, como não tive muita
  // criativade, eu fiz assim está funcional, mas não consegui pensar em uma boa
  // solução para fazer de forma melhor
  public void putTextInLog(String side, String text) {
    if (side == "player") {
      textLine1 = textLine2;
      textLine2 = textLine3;
      textLine3 = textLine4;
      textLine4 = "";

      String label = "Jogador: ";
      int i;

      for (i = 0; i < label.length(); i++) {
        textLine4 += label.charAt(i);
        redraw();
      }

      for (i = 0; i < text.length(); i++) {
        textLine4 += text.charAt(i);
        redraw();
      }
      System.out.println(textLine4);
    } else if (side == "enemy") {
      textLine1 = textLine2;
      textLine2 = textLine3;
      textLine3 = textLine4;
      textLine4 = "";

      String label = "Inimigo: ";
      int i;

      for (i = 0; i < label.length(); i++) {
        textLine4 += label.charAt(i);
        redraw();
      }

      for (i = 0; i < text.length(); i++) {
        textLine4 += text.charAt(i);
        redraw();
      }
      System.out.println(textLine4);
    }
  }

  // função relacinada a posição do mouse sobre o primeiro botão
  public boolean overRect1(int x, int y, int width, int height) {
    if (mouseX >= x && mouseX <= x + width &&
        mouseY >= y && mouseY <= y + height) {
      return true;
    } else {
      return false;
    }
  }

  // função relacinada a posição do mouse sobre o segundo botão
  public boolean overRect2(int x, int y, int width, int height) {
    if (mouseX >= x && mouseX <= x + width &&
        mouseY >= y && mouseY <= y + height) {
      return true;
    } else {
      return false;
    }
  }

  // função relacinada a posição do mouse sobre o terceiro botão
  public boolean overRect3(int x, int y, int width, int height) {
    if (mouseX >= x && mouseX <= x + width &&
        mouseY >= y && mouseY <= y + height) {
      return true;
    } else {
      return false;
    }
  }

  // função que define que se o botão estará com o hover ativado ou não,
  // dependendo do retorno das funções acima
  public void update(int x, int y) {
    if (!closeFight) {
      if (overRect1(rect1X, rectY, rectWidth, rectHeight)) {
        rect1Over = true;
        rect2Over = false;
        rect3Over = false;
      } else if (overRect2(rect2X, rectY, rectWidth, rectHeight)) {
        rect1Over = false;
        rect2Over = true;
        rect3Over = false;
      } else if (overRect3(rect3X, rectY, rectWidth, rectHeight)) {
        rect1Over = false;
        rect2Over = false;
        rect3Over = true;
      } else {
        rect1Over = rect2Over = rect3Over = false;
      }
    } else {
      rect1Over = true;
      rect2Over = true;
      rect3Over = true;
    }
  }

  // apenas para fechar o programa ao apertar esc e me poupar tempo
  public void keyPressed() {
    if (key == ESC) {
      exit();
    }
  }

  // define o tamanho da tela, para ficar mais prático definir as posições eu
  // preferi fazer nessa resoloção e não fiz os
  // valores escalonados
  public void settings() {
    size(800, 600);
  }

  // inicializa o processing
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "JavaInterface" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}