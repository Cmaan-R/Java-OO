
public abstract class Conta {

	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total = 0;

	public Conta(int agencia, int numero) {
		total++; // Conta.total++;
//		System.out.println("O Total de Contas é : " + total);
		this.numero = numero;
		this.agencia = agencia;
//		System.out.println("Estou criando uma conta " + this.numero);

	}

	public abstract void deposita(double valor);

	public void saca(double valor) {

		if (saldo < valor) { // Tem um problema?
			throw new SaldoInsuficienteException("Saldo: " + this.saldo + ", Valor Desejado: " + valor);
		}

		this.saldo -= valor;

	}

	public void transfere(double valor, Conta destino) {
		this.saca(valor);
		destino.deposita(valor);
	}

	public double getSaldo() {
		return this.saldo;

	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		if (numero <= 0) {
			System.out.println("Valor Inválido");
			return;
		}
		this.numero = numero;
	}

	public int getAgencia() {
		return this.agencia;
	}

	public void setAgencia(int agencia) {
		if (agencia <= 0) {
			System.out.println("Valor Inválido");
			return;
		}
		this.agencia = agencia;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public static int getTotal() {
		return Conta.total;
	}

}
