import processing.core.PApplet;
import java.util.ArrayList; // Um classe do Java que representa um vetor genérico

public class TesteProcessing extends PApplet {

	public class Ponto {
		public int x;
		public int y;

		public Ponto(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

	//ArrayList precisa de um parâmetro que representa o tipo dos elementos do vetor
	private ArrayList<Ponto> pontos;

	public void settings() {
		size(500, 500);
		pontos = new ArrayList<Ponto>();
	}

	public void draw(){
		background(0,0,128);
		int i;
		stroke(255,255,255);
		//Varredura explícita dos pontos no ArrayLisy pontos
		for (i = 0; i < pontos.size(); i++) {
			Ponto p = pontos.get(i);
			//point(p.x, p.y);
			ellipse(p.x, p.y, 3, 3);
		}
		//ellipse(mouseX, mouseY, 20, 20);

	}

	// Toda clique gerará um objeto do tipo Ponto com posição MouseX e MouseY
	public void mouseDragged() {
		pontos.add(new Ponto(mouseX, mouseY));
	}

	public static void main(String[] passedArgs) {
		String[] appletArgs = new String[] { "TesteProcessing" };
		PApplet.main(appletArgs);
    }
}
