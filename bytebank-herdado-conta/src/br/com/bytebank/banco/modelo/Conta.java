package br.com.bytebank.banco.modelo;

/**
 * Classe que representa a moldura de uma Conta
 * 
 * @author CmaanR
 *
 */

public abstract class Conta extends Object {

	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total = 0;

	/**
	 * 
	 * Construtor para inicializar o objeto Conta apartir da Agencia e Numero
	 * 
	 * @param agencia
	 * @param numero
	 */

	public Conta(int agencia, int numero) {
		total++; // Conta.total++;
//		System.out.println("O Total de Contas é : " + total);
		this.numero = numero;
		this.agencia = agencia;
//		System.out.println("Estou criando uma conta " + this.numero);

	}

	public abstract void deposita(double valor);

	/**
	 * Valor precisa ser maior do que o saldo
	 * 
	 * @param valor
	 * @throws SaldoInsuficienteException
	 */

	public void saca(double valor) throws SaldoInsuficienteException {

		if (saldo < valor) { // Tem um problema?
			throw new SaldoInsuficienteException("Saldo: " + this.saldo + ", Valor Desejado: " + valor);
		}

		this.saldo -= valor;

	}

	public void transfere(double valor, Conta destino) throws SaldoInsuficienteException {
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

	@Override
	public boolean equals(Object ref) {

		Conta outra = (Conta) ref;

		if (this.agencia != outra.agencia) {
			return false;
		}
		if (this.numero != outra.numero) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	public String toString() {

		return "Numero :" + this.numero + ", Agencia: " + this.agencia;
	}

}
