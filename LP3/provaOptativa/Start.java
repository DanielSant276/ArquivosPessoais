public class Start {
  public static void main(String[] args) {
    //inicia um novo objeto da classe animal
    Animal animalGeral = new Animal("Grande", "Amarelo", "Dario", 3);
    //inicia um novo objeto da classe passaro
    Passaro novoPassaro = new Passaro("Pequeno", "Azul", "Estevão", 5, 5.8);

    //como os atributos das classes estão todos como privado, é necessário utilizar os métodos get de cada objeto
    System.out.println(animalGeral.getTamanho());
    System.out.println(animalGeral.getCor());
    System.out.println(animalGeral.getNome());
    System.out.println(animalGeral.getIdade());

    System.out.println(novoPassaro.getTamanho());
    System.out.println(novoPassaro.getCor());
    System.out.println(novoPassaro.getNome());
    System.out.println(novoPassaro.getIdade());
    System.out.println(novoPassaro.getTamanhoAsa());

    //como os atributos das classes estão todos como privado, é necessário utilizar os métodos set de cada objeto
    animalGeral.setTamanho("Médio");
    animalGeral.setCor("Verde");
    animalGeral.setNome("Geraldo");
    animalGeral.setIdade(5);

    novoPassaro.setTamanho("Minúsculo");
    novoPassaro.setCor("Cinza");
    novoPassaro.setNome("Robson");
    novoPassaro.setIdade(2);
    novoPassaro.setTamanhoAsa(1.7);

    System.out.println(animalGeral.getTamanho());
    System.out.println(animalGeral.getCor());
    System.out.println(animalGeral.getNome());
    System.out.println(animalGeral.getIdade());

    System.out.println(novoPassaro.getTamanho());
    System.out.println(novoPassaro.getCor());
    System.out.println(novoPassaro.getNome());
    System.out.println(novoPassaro.getIdade());
    System.out.println(novoPassaro.getTamanhoAsa());
  }
}
