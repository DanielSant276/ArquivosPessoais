public class ForaDosLimitesException extends Exception {
	public int superior;
	public int inferior;

	public ForaDosLimitesException(int inf, int sup) {
		superior = sup;
		inferior = inf;
	}

	public String toString() {
		return "Fora do intervalo [" + inferior + " , " + superior + "].";
	}
}
