public abstract class Animal {
  public String nome;
  private String cor;
  private int qtdPatas;
  private int idade;

  public Animal(String nome, String cor, int qtdPatas, int idade) {
    this.nome = nome;
    this.cor = cor;
    this.qtdPatas = qtdPatas;
    this.idade = idade;
  }

  public String getNome() {
    return this.nome;
  }

  public String getCor() {
    return this.cor;
  }

  public int getQtdPatas() {
    return this.qtdPatas;
  }

  public int getIdade() {
    return this.idade;
  }

  public void acao(){
    System.out.println("Corre");
  }

  public void come(){
    System.out.println("Caça");
  }

  public void dorme() {
    System.out.println("O animal procura um lugar sussegado para dormir");
  }
}