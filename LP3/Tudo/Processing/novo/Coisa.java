import processing.core.PApplet;

// Coisa não se mexe
public class Coisa implements Desenhável {
	protected float tamanho;
	protected float posx;
	protected float posy;

	protected PApplet lugar;

	public Coisa(float tamanho, float posx, float posy, PApplet lugar) {
		this.tamanho = tamanho;
		this.posx = posx;
		this.posy = posy;
		this.lugar = lugar;
	}

	//Implementa o único método da interface Desenhável
	public void desenha() {
		this.lugar.circle(posx, posy, tamanho);
	}


	public void setaTamanho(float tamanho) {
		this.tamanho = tamanho;
	}

	public void setaX(float posx) {
		this.posx = posx;
	}

	public void setaY(float posy) {
		this.posy = posy;
	}

	public float pegaTamanho() {
		return this.tamanho;
	}

	public float pegaX() {
		return this.posx;
	}

	public float pegaY() {
		return this.posy;
	}

	public String toString() {
		return "Uma coisa em " + this.posx + "," + this.posy + ".";
	}

}
