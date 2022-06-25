public class Mage extends Character implements Action {
  //define o texto que aparecerá na tela quando realizar uma ação
  private String text;
  //define de foi utilizado a defesa ou não
  private boolean useDef = false;

  //inicia o construtor da classe
  public Mage(String name) {
    super(name, "Mago");
    this.hp += 10;
    this.mana += 10;
    this.atk += 1;
    this.def += 0;
  }

  //método de ataque
  public String attack(Character enemy) {
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
  public String ability(Character enemy) {
    if (this.mana > 0) {
      this.mana -= 5;
      this.atk += 5;
      this.attack(enemy);
      this.text = "Lança uma bola de fogo no adversário! Dando " + (this.atk - enemy.def) + " de dano!";
      this.atk -= 5;
      return this.text;
    }
    this.text = "Sem mana para usar bola de fogo!";
    return this.text;
  }
  
  //não vai fazer nada só está aqui para ficar padronizado
  public void revertAbility() {
  }
}