import processing.core.*;

public class TestaGenérico {

	public static void main(String[] args) {
		PApplet p = new PApplet();

		Genérico<Integer> varInt = new Genérico<Integer>();
		Específico<SuperBola> varBola = new Específico<SuperBola>();

		SuperBola sb = new SuperBola(0.0f, 2.0f, 3.5f, p);


//		Específico<Double> varCoisa = new Específico<Double>();

		varInt.setaObjeto(2300);
		varInt.usa();

		varBola.setaObjeto(sb);

		varBola.usa();
		sb.setaDX(1.0f);
		varBola.usa();
	}
}
