import java.util.Scanner;

public class Função {

public static long fatorial(long x) {
    if (x == 0) {
        return 1;
    } else {
	return x*fatorial(x - 1);
    }
}

public static void main(String args[]) {
    Scanner ent = new Scanner(System.in);

    long n, r;

    System.out.println("Digite um número inteiro positivo: ");
    n = ent.nextInt();

    r = fatorial(n);

    System.out.printf("O fatorial de %d é %d\n", n, r);
}

}
