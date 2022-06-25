import java.util.Random;

public class TestaBoneco {
    public static void main(String[] args) {
	Boneco um;
	Guerreiro dois;

	Random gerador;

	um = new Boneco("João");
	dois = new Guerreiro("José");

	gerador = new Random();

	int turnos = 1500;
	int i;

	for (i = 1; i <= turnos; i++) {
	    if (gerador.nextInt(1000) < 800) {
		um.ataca(dois);
	    }
	    if (gerador.nextInt(1000) < 50) {
	        dois.ataca(um);
	    }
	}

	System.out.printf("HP de %s é %d\n", um.pegaNome(), um.pegaHP());
	System.out.printf("HP de %s é %d\n", dois.pegaNome(), dois.pegaHP());
    }
}
