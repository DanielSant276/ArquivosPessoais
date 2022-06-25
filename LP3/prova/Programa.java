public class Programa{

  public static void main(String[] args){

      Conta c = new Conta();

      c.nome = "Ana Clara";
      c.cpf = "13874793108";
      c.depositar(100.0);
      //c.Saldo = 1000.0;

      System.out.println(c.nome);
      System.out.println(c.cpf);
      System.out.println(c.getSaldo());

      try {
        c.cpf = 2;
      }
      catch (Exception erro) {
        System.out.println(erro.getMessage());
      }
  }
}