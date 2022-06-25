import java.util.Random;
import processing.core.PApplet;

public class CoisaMais extends Coisa implements Criadora {

	public CoisaMais(float tamanho, float posx, float posy, PApplet lugar) {
		super(tamanho, posx, posy, lugar);
	}

	public Criadora cria() {
		Random r = new Random();
		float novoX = this.posx + r.nextInt(25);
		float novoY = this.posy + r.nextInt(25);

		CoisaMais nova = new CoisaMais(this.tamanho, novoX, novoY, this.lugar);

		return nova;
	}

}
