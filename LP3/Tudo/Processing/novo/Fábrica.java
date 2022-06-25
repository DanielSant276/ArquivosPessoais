import java.util.ArrayList;

// O "T" é o tipo genérico
public class Fábrica<T extends Criadora> {

	private T molde;

	public void defineMolde(T molde) {
		this.molde = molde;
	}

	// O método fabrica retorna uma lista com "qtd" elementos do tipo T
	public ArrayList<Criadora> fabrica(int qtd) {
		//Voltar a esse código
		ArrayList<Criadora> lista = new ArrayList<Criadora>();

		int i;

		for (i = 1; i<= qtd; i++) {
			lista.add(molde.cria());
		}

		return lista;
	}
}
