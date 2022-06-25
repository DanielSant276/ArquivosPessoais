public class TestaConta {

	public static void main(String args[]) {
		Conta conta1, conta2;

		//Cria um novo objeto
		conta1 = new Conta("Rafael");
		System.out.println("Criando conta");

		System.out.printf("Saldo da conta de %s: %f\n", conta1.nomeTitular(), conta1.retornaSaldo());

		conta1.deposita(1000000.00f);
		System.out.println("Realizando depósito");

		System.out.printf("Saldo da conta de %s: %f\n", conta1.nomeTitular(), conta1.retornaSaldo());
	}
}
