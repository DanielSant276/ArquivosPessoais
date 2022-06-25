import processing.core.PApplet;
import java.util.ArrayList;
import java.util.Random;

public class Cenário extends PApplet {
	private ArrayList<Desenhável> lista;
	private Random r;

	//Inicialização
	public void settings() {
		size(1000, 1000);
		lista = new ArrayList<Desenhável>();
		r = new Random();
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
			Coisa coisa = new Coisa(50, mouseX, mouseY, this);
			lista.add(coisa);
		} else {
			Bicho bicho = new Bicho(20, mouseX, mouseY, this);
			lista.add(bicho);
		}
	}

	public static void main(String[] passedArgs) {
		String[] appletArgs = new String[] { "Cenário" };
		PApplet.main(appletArgs);
    }
}
