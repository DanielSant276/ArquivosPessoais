public class Conta {

	//Número da conta
	private String número;

	//Dono da conta
	private String titular;

	//Saldo da conta
	private float saldo;

	//Atributo qualquer
	// Esse atributo pode ser alterado por qualquer programa
	public int qualquer;

	//Construtor
	public Conta(String titular) {
		this.titular = titular;
		this.saldo = 0.0f;
	}

	//Construtor cru
	public Conta() {
		this.titular = "";
		this.saldo = 0.0f;
	}

	//Saque
	public void saca(float valor) {
		this.saldo = this.saldo - valor;
	}

	//Depósito
	public void deposita(float valor) {
		this.saldo = this.saldo + valor;
	}

	//Retorna saldo
	public float retornaSaldo() {
		return this.saldo;
	}

	public String nomeTitular() {
		return this.titular;
	}

	public void setaTitular(String titular) {
		this.titular = titular;
	}
}
