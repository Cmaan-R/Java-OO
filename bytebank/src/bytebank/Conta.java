package bytebank;

public class Conta {

	double saldo;
	int agencia;
	int numero;
	String titular;

	public void deposita(double valor) {
		this.saldo += valor;
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
//Pode ser feito dessa forma = this.saldo -+ valor;
//Pode ser feito dessa forma = destino.saldo += valor; 
			destino.deposita(valor);
			return true;
		} else {			
			return false;

		}
	}

}
