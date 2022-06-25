public class Genérico<T> {

	private T objetoInterno;

	public void setaObjeto(T o) {
		this.objetoInterno = o;
	}

	public T pegaObjeto() {
		return this.objetoInterno;
	}

	public void usa() {
		System.out.println(objetoInterno.toString());
	}

}
