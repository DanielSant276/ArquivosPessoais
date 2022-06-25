//Essa classe implementa a interface Comportamento, sendo necessário possuir os métodos: comer, anar, dormir
public class Animal implements Comportamento{
  //define os atributos utilizados pela classe animal
  private String tamanho;
  private String cor;
  private String nome;
  private int idade;

  //definição do construtor da classe animal
  public Animal(String tamanho, String cor, String nome, int idade) {
    this.tamanho = tamanho;
    this.cor = cor;
    this.nome = nome;
    this.idade = idade;
  }

  //criação dos sets e gets da classe animal
  public String getTamanho() {
    return this.tamanho;
  }

  public void setTamanho(String novoTamanho) {
    this.tamanho = novoTamanho;
  }

  public String getCor() {
    return this.cor;
  }

  public void setCor(String novaCor) {
    this.cor = novaCor;
  }

  public String getNome() {
    return this.nome;
  }

  public void setNome(String novoNome) {
    this.nome = novoNome;
  }

  public int getIdade() {
    return this.idade;
  }

  public void setIdade(int novaIdade) {
    this.idade = novaIdade;
  }

  //utilização dos métodos da interface comportamento
  public void comer() {
    System.out.println("Come algumas frutas no chão");
  }

  public void andar() {
    System.out.println("Corre por ai");
  }

  public void dormir() {
    System.out.println("Dorme no chão");
  }
}
