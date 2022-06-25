// Classe representando um retangulo com vértices
// (sup, esq), (sup, dir), (inf, esq) e (inf, dir)
public class Caixa {
	public float sup;
	public float inf;
	public float esq;
	public float dir;

	public Caixa(float sup, float inf, float esq, float dir) {
		this.sup = sup;
		this.inf = inf;
		this.esq = esq;
		this.dir = dir;
	}
}
