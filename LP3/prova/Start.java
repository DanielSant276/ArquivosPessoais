public class Start {
  public static void main(String[] args) {
    // Apenas para exemplicar, não é possível fazer isso pois a classe animal foi definida como abstract, não podendo ser instanciada.
    // Animal meuAnimal = new Animal("lobo", "branco", 4, 10);

    // Criando um objeto da classe Cachorro
    Cachorro meuCachorro = new Cachorro("Luna", "Preta", 4, 7, "vira-lata");

    // Método criado na classe mãe animal
    meuCachorro.acao();
    // Métodos da classe cachorro sobrescritos na classe animal
    meuCachorro.come();
    meuCachorro.dorme();
    // Método criado na classe Cachorro
    meuCachorro.vigia();

    // Como a variável não é definida como private, é possível modificá-la
    System.out.println(meuCachorro.getNome());
    meuCachorro.nome = "Benjamin";
    System.out.println(meuCachorro.getNome());
    
    // Não pode ser realizado pois raça é privado
    //System.out.println(meuCachorro.raca);

    // Apesar da variável ser privado, é possível modificá-la através de um método
    System.out.println(meuCachorro.getRaca());
    meuCachorro.trocarRaca("Yorkshire");
    System.out.println(meuCachorro.getRaca());

    // Utilizando o Método da interface Dono implementada na classe Cachorro
    meuCachorro.brincar();
    meuCachorro.daComida();
  }
}