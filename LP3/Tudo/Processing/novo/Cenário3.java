import processing.core.PApplet;
import java.util.ArrayList;
import java.util.Random;

public class Cenário3 extends PApplet {
	private ArrayList<Opaca> lista;
	private Random r;

	//Inicialização
	public void settings() {
		size(1000, 1000);
		lista = new ArrayList<Opaca>();
		r = new Random();
	}

	//A cada instante é chamado para redesenhar tudo
	public void draw(){
		background(64);
		int i = 0, j = 0;

		for (i = 0; i < lista.size(); i++) {
			Opaca elemento = lista.get(i);
			elemento.desenha();
		}

		for (i = 0; i < lista.size(); i++) {
		    for (j = i + 1;j < lista.size(); j++) {
			Opaca o1 = lista.get(i);
			Opaca o2 = lista.get(j);
			/*Caixa c1 = o1.retornaCaixa();
			Caixa c2 = o2.retornaCaixa();
			line((c1.esq+c1.dir)/2,(c1.sup+c1.inf)/2, (c2.esq+c2.dir)/2,(c2.sup+c2.inf)/2);
		        */
			if (o1.colidiuCom(o2)) {
			    if (o1 instanceof Bicho && o2 instanceof Bicho) {
			        Bicho b1 = (Bicho)o1;
				Bicho b2 = (Bicho)o2;
				b1.setaDX(-b1.pegaDX());
				b2.setaDX(-b2.pegaDX());
				b1.setaDY(-b1.pegaDY());
				b2.setaDY(-b2.pegaDY());
			    }
			}
		    }
		}

	}

	//Rotina que é chama quando o mouse é pressionado
	public void mousePressed() {
		float dx = r.nextFloat() * 10.0f - 5.0f;
		float dy = r.nextFloat() * 10.0f - 5.0f;
		Bicho bicho = new Bicho(50, mouseX, mouseY, dx, dy, this);

		lista.add(bicho);
	}

	public static void main(String[] passedArgs) {
		String[] appletArgs = new String[] { "Cenário3" };
		PApplet.main(appletArgs);
    }
}
