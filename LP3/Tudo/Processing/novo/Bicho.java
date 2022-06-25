import processing.core.PApplet;

public class Bicho implements Opaca {
	private float tamanho;
	private float posx;
	private float posy;
	private float dx;
	private float dy;

	private PApplet lugar;

	public Bicho(float tamanho, float posx, float posy, PApplet lugar) {
		this.tamanho = tamanho;
		this.posx = posx;
		this.posy = posy;
		this.lugar = lugar;
		this.dx = 1.0f;
		this.dy = 1.0f;
	}

	public Bicho(float tamanho, float posx, float posy, float dx, float dy ,PApplet lugar) {
		this.tamanho = tamanho;
		this.posx = posx;
		this.posy = posy;
		this.lugar = lugar;
		this.dx = dx;
		this.dy = dy;
	}

	//Implementa o único método da interface Desenhável
	public void desenha() {
		this.lugar.square(posx, posy, tamanho);
		this.move();
	}

	public void move() {
		this.posx += this.dx;
		this.posy += this.dy;
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

	public void setaDX(float dx) {
		this.dx = dx;
	}

	public void setaDY(float dy) {
		this.dy = dy;
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

	public float pegaDX() {
		return this.dx;
	}

	public float pegaDY() {
		return this.dy;
	}
	public String toString() {
		return "Um bicho em " + this.posx + "," + this.posy + ".";
	}

	public Caixa retornaCaixa() {
		return new Caixa(posy, posy + tamanho, posx, posx + tamanho);
	}

	public Velocidade retornaVelocidade() {
		return new Velocidade(dx, dy);
	}

	// Partindo do princípio que eles não ocupam o mesmo lugar
	public boolean colidiuCom(Colidível outro) {
		Caixa c1 = this.retornaCaixa();
		Caixa c2 = outro.retornaCaixa();

		Velocidade d1 = this.retornaVelocidade();
		Velocidade d2 = outro.retornaVelocidade();
		boolean colidiu = false;

		float velApX = Math.abs(d1.dx - d2.dx);
		float velApY = Math.abs(d1.dy - d2.dy);

		float distY = Math.min(Math.abs(c1.inf - c2.sup),Math.abs(c1.sup - c2.inf));
		float distX = Math.min(Math.abs(c1.esq - c2.dir),Math.abs(c1.esq - c2.dir));

		if ( (distY <= velApY) && ((c2.esq >= c1.esq && c2.esq <= c1.dir) || (c2.dir <= c1.dir && c2.dir >= c1.esq))) {
			colidiu = true;
		}

		if ( (distX <= velApX) && ((c2.sup >= c1.sup && c2.sup <= c1.inf) || (c2.inf <= c1.inf && c2.inf >= c1.sup))) {
			colidiu = true;
		}

		return colidiu;
	}


	public boolean interceptaCom(Colidível outro) {
		Caixa c1 = this.retornaCaixa();
		Caixa c2 = outro.retornaCaixa();

	}

}
