package byteBankRevision;

public class CriaConta {
	public static void main(String[] args) {

		Cliente paulo = new Cliente();

		Conta contaDoPaulo = new Conta(7957, 426062);
		Conta contaDoCliente = new Conta(2911, 50265);

		contaDoPaulo.deposita(500);
		contaDoCliente.deposita(100);

		System.out.println(Conta.getNumContas());
		System.out.println(contaDoPaulo.transfere(100, contaDoCliente));
		System.out.println(contaDoPaulo.getAgencia());

	}
}
