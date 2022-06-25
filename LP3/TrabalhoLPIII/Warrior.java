public class Warrior extends Character implements Action {
  //define o texto que aparecerá na tela quando realizar uma ação
  private String text;
  //define a quantidade de turnos que irá durar o buff
  private int turn = 0;
  private boolean cooldown = false;
  //define de foi utilizado a defesa ou não
  private boolean useDef = false;

  //inicia o construtor da classe
  public Warrior(String name) {
    super(name, "Guerreiro");
    this.hp += 0;
    this.mana += 0;
    this.atk += 2;
    this.def += 2;
  }

  //método de ataque
  public String attack(Character enemy) {
    //verifica se o ataque é maior do que a defesa do oponente
    if (this.atk >= enemy.def) {
      enemy.hp = enemy.hp - (this.atk - enemy.def);
      this.text = "Deu " + (this.atk - enemy.def) + " de dano!";
      return this.text;
    } 
    else {
      text = "O ataque foi suprimido pela defesa do inimigo!";
      return this.text;
    }
  }

  //aumenta a defesa
  public String defend() {
    this.def += 5;
    this.useDef = true;
    this.text = "Tenta defender o próximo ataque!";
    return this.text;
  }

  //reverte a defesa caso tenha sido defendido no último turno
  public void revertDefense() {
    if (this.useDef) {
      def -= 5;
      this.useDef = false;
    }
  }

  //utiliza a habilidade da classe
  public String ability(Character player) {
    //a habilidade do guerreiro faz ele ganhar +1 de ataque e +1 de defesa pelos 2 próximso turnos ao custo de 5 de mana
    if (this.mana > 0) {
      this.mana -= 5;
      this.turn = 2;
      this.cooldown = true;
      
      this.atk += 1;
      this.def += 1;
      
      this.text = "Utiliza a fúria do beserk!";
      return this.text;
    }
    this.text = "Sem mana para utilizar a fúria do beserk!";
    return this.text;
  }

  //reverte o buff que foi utilizado
  public void revertAbility() {
    if (this.cooldown) {
      if (this.turn <= 0) {
        this.atk -= 1;
        this.def -= 1;
        this.cooldown = false;
      }
      else {
        this.turn -= 1;
      }      
    }
  }
}