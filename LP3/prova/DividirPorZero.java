public class DividirPorZero {
  public static void main(String args[]){  
    int numero = 10;
    int zero = 0;

    try {
      //Tentativa de divisão, caso não consiga realizar a dividisão ele irá para a parte de catch, onde o erro irá ser mostrado
      System.out.println(numero/zero);
    }
    catch (Exception erro) {
      // Identificação no console de qual erro ocorreu
      System.out.println(erro.getMessage());
    }
  }
}
