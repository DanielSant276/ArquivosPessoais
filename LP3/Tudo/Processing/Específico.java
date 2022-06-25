public class Específico<B extends Animável> {

	private B objetoInterno;

	public void setaObjeto(B o) {
		this.objetoInterno = o;
	}

	public B pegaObjeto() {
		return this.objetoInterno;
	}

	public void usa() {
		objetoInterno.move();
		System.out.println(objetoInterno.toString());
	}

}
