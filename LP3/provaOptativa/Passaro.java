//classe filha da classe animal
public class Passaro extends Animal {
  //novo atributo da classe passaro
  private double tamanhoAsa;

  //criação do construtor da classe passaro
  public Passaro(String tamanho, String cor, String nome, int idade, double tamanhoAsa) {
    //definição dos atributos herdados da classe mãe animal
    super(tamanho, cor, nome, idade);
    //definição do atributo da classe passaro
    this.tamanhoAsa = tamanhoAsa;
  }

  //criação dos sets e gets da classe animal
  public double getTamanhoAsa() {
    return this.tamanhoAsa;
  }

  public void setTamanhoAsa(double novoTamanhoAsa) {
    this.tamanhoAsa = novoTamanhoAsa;
  }

  //utilização da polimorfia por sobreposição
  @Override
  public void comer() {
    System.out.println("Come grãos");
  }

  @Override
  public void andar() {
    System.out.println("Voa pelo céu");
  }

  @Override
  public void dormir() {
    System.out.println("Dorme na árvore");
  }
}
