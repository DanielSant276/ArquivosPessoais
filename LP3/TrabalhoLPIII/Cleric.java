public class Cleric extends Character implements Action {
  //define o texto que aparecerá na tela quando realizar uma ação
  private String text;
  //define de foi utilizado a defesa ou não
  private boolean useDef = false;

  //inicia o construtor da classe
  public Cleric(String name) {
    super(name, "Clérigo");
    this.hp += 5;
    this.mana += 5;
    this.atk += 0;
    this.def += 3;
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
      this.def -= 5;
      this.useDef = false;
    }
  }

  //utiliza a habilidade da classe
  public String ability(Character player) {
    if (this.mana > 0) {
      this.hp += 3;
      this.mana -=5;
      this.text = "Pede força para seu deus e recupera 3 de Hp!";
      return this.text;
    }
    this.text = "Sem mana parar pedir força a seu deus!";
    return this.text;
  }

  //não vai fazer nada só está aqui para ficar padronizado
  public void revertAbility() {
  }
}