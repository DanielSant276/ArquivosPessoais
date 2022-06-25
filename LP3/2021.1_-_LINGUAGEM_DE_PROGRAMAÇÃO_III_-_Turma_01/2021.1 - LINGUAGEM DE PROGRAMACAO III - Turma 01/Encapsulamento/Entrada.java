// Biblioteca externa e uso da API são declaradas aqui
import java.util.Scanner;

public class Entrada {

//Esse programa lê dois números inteiros e escreve a soma
public static void main(String args[]) {

    //O objeto Scanner lê dados da entrada padrão
    Scanner ent = new Scanner(System.in);
    int a, b, soma; //Declaração de três números inteiros

    //System é uma classe que representa o sistema
    //out é um atributo de System que representa a saída padrão
    //print é o método de out que escreve um texto na saída padrão
    System.out.print("Digite um número: ");
    a = ent.nextInt();

    System.out.print("Digite outro número: ");
    b = ent.nextInt();

    soma = a + b;

    System.out.printf("A soma de %d e %d é %d\n", a, b, soma);
}

}
