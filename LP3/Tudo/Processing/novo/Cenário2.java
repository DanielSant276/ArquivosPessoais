import processing.core.PApplet;
import java.util.ArrayList;
import java.util.Random;

public class Cenário2 extends PApplet {
	private ArrayList<Desenhável> lista;
	private Random r;
	private int qtdCoisa = 0;
	private Fábrica fábrica;

	//Inicialização
	public void settings() {
		size(1000, 1000);
		lista = new ArrayList<Desenhável>();
		r = new Random();
		fábrica = new Fábrica();
	}

	//A cada instante é chamado para redesenhar tudo
	public void draw(){
		background(64);
		int i = 0;
		for (i = 0; i < lista.size(); i++) {
			Desenhável elemento = lista.get(i);
			elemento.desenha();
		}
	}

	//Rotina que é chama quando o mouse é pressionado
	public void mousePressed() {
		int x = r.nextInt(1000);
		if (x < 500) {
			if (mouseButton == LEFT) {
				CoisaMais coisa = new CoisaMais(50, mouseX, mouseY, this);
				lista.add(coisa);
				fábrica.defineMolde(coisa);
				qtdCoisa += 1;
			} else if (mouseButton == RIGHT) {
				int qtd = r.nextInt(5);
				int i;
				ArrayList<Criadora> l = fábrica.fabrica(qtd);
				for (i = 0; i < qtd; i++) {
					lista.add((CoisaMais)l.get(i));
				}
			}



		} else {
			Bicho bicho = new Bicho(20, mouseX, mouseY, this);
			lista.add(bicho);
		}
	}

	public static void main(String[] passedArgs) {
		String[] appletArgs = new String[] { "Cenário2" };
		PApplet.main(appletArgs);
    }
}
