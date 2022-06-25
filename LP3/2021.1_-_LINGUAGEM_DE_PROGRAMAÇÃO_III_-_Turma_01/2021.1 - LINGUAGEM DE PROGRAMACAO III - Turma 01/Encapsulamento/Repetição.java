//Classe
public class Repetição {
    //Método main
    public static void main(String args[]) {
        //declaração de variáveis
	float num = 0;
	int i;

	for (i = 0; i<10000; i++) {
	    num = num + 1.0f;
	    System.out.printf("%f\n", num);
	}
    }
}
