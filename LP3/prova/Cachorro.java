public class Cachorro extends Animal implements Dono{
  private String raca;

  public Cachorro(String nome, String cor, int qtdPatas, int idade, String raça) {
    super(nome, cor, qtdPatas, idade);
    this.raca = raça;
  }

  public void trocarRaca(String raça) {
    this.raca = raça;
  }

  public String getRaca() {
    return raca;
  }

  @Override
  public void come(){
    System.out.println("Come ração.");
  }

  @Override
  public void dorme() {
    System.out.println(this.nome + " dorme no seu cantinho da casa.");
  }

  public void vigia() {
    System.out.println("Dorme no seu canto da casa");
  }

  public void brincar() {
    System.out.println("O dono brinca com o seu animal de pegar bola.");
  };

  public void daComida() {
    System.out.println("O dono coloca comida no pote do seu animal");
  }
}
