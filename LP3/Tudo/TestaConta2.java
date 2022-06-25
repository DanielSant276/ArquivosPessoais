public class TestaConta2 {

	public static void main(String args[]) {
		Conta conta1, conta2;

		//Cria um novo objeto
		conta1 = new Conta("Rafael");

		System.out.printf("O saldo na conta é: %f\n", conta1.retornaSaldo());

		conta1.deposita(1000000.00f);

		conta1.qualquer = 1000;

		System.out.printf("Qualquer valor é: %d\n", conta1.qualquer);

	}
}
