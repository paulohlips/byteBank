package byteBankRevision;

public class Conta {
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente cliente;
	private static int numContas;
	
	public Conta(int agencia, int numero) {
		numContas++;
		this.agencia = agencia;
		this.numero = numero;
		System.out.println("Teste");
	}
	
	protected static int getNumContas() {
		return Conta.numContas;
	}

	protected double getSaldo() {
		return this.saldo;
	}

	protected int getAgencia() {
		return this.agencia;
	}

	protected void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	protected int getNumero() {
		return this.numero;
	}

	protected void setNumero(int agencia) {
		this.numero = agencia;
	}

	void deposita(double valor) {
		this.saldo += valor;
	}

	boolean saca(double valor) {
		if (valor <= this.saldo) {
			this.saldo -= valor;
			return true;
		}

		else {
			return false;
		}

	}

	boolean transfere(double valor, Conta contaDestino) {
		if (valor <= this.saldo) {
			this.saldo -= valor;
			contaDestino.saldo += valor;
			return true;
		} else {
			return false;
		}

	}
}
