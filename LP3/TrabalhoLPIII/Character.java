public class Character {
  //define as informações básicas das classes herdadas
  private String name;
  private String className;
  protected int hp = 25;
  protected int mana = 10;
  protected int atk = 4;
  protected int def = 1;

  //define o construtor
  public Character(String name, String className) {
    this.name = name;
    this.className = className;
  }

  //recebe o nome
  public String getName() {
    return this.name;
  }

  //recebe o nome da classe
  public String getClassName() {
    return this.className;
  }

  //recebe o hp
  public int getHp() {
    return this.hp;
  }

  //recebe a mana
  public int getMana() {
    return this.mana;
  }
}