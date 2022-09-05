
public class Conta {

	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total;

	public Conta(int agencia, int numero) {
		total++; // Conta.total++;
//		System.out.println("O Total de Contas é : " + total);
		this.numero = numero;
		this.agencia = agencia;
//		System.out.println("Estou criando uma conta " + this.numero);

	}

	public void deposita(double valor) {
		if (valor >= 0) {
			this.saldo += valor;
		} else {
			System.out.println("O Valor Do Saldo Deve Ser Positivo!");
		}

	}

	public boolean saca(double valor) {
		if (saldo >= valor) {
			this.saldo -= valor;
			System.out.println("Operação Realizada Com Sucesso!");
			return true;
		} else {
			System.out.println("Valor Indisponível: " + valor + " \n O Seu Saldo Atual é :" + saldo);
			return false;
		}

	}

	public boolean transfere(double valor, Conta destino, Conta origem) {
		if (this.saldo >= valor) {
			origem.saca(valor);
			// Pode ser feito dessa forma = this.saldo -+ valor;
			// Pode ser feito dessa forma = destino.saldo += valor;
			destino.deposita(valor);
			return true;
		} else {
			return false;

		}
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
	
	public int getTotal() {
		return Conta.total;
	}

}
