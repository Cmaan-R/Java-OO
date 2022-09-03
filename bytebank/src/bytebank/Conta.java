package bytebank;

public class Conta {

	double saldo;
	int agencia;
	int numero;
	String titular;

	public void deposita(double valor) {
		this.saldo = saldo + valor;
	}

	public void saca(double valor) {
		if (saldo > valor) {
			this.saldo = saldo - valor;
			System.out.println("Operação Realizada Com Sucesso!");
		} else {
			System.out.println("Valor Indisponível: " + valor + " \n O Seu Saldo Atual é :" + saldo);
		}

	}

}
