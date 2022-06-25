public class Limitada {
	private int inferior;
	private int superior;

	private int valor;

	public Limitada(int inferior, int superior) {
		this.inferior = inferior;
		this.superior = superior;
	}

	public void setaValor(int x) throws ForaDosLimitesException {
		if (x < inferior || x > superior) {
			ForaDosLimitesException minha = new ForaDosLimitesException(inferior, superior);
			throw(minha);
		} else {
			valor = x;
		}
	}

	public int pegaValor() {
		return valor;
	}
}
