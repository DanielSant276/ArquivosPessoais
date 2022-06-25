import java.util.Scanner;

public class TestaLimitada {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		Limitada v = new Limitada(-5, 5);

		Boolean ok = true;

		System.out.print("Digite um número: ");
		int k = ent.nextInt();

		try {
		//Código que dispara a exceção
			v.setaValor(k);
			ok = true;
		} catch (ForaDosLimitesException e) {
			System.out.println(e);
			ok = false;
		} finally {
			if (ok) {
				System.out.println("Valor recebido!");
			} else {
				System.out.println("Programa interrompido!");
			}
		}
	}
}
