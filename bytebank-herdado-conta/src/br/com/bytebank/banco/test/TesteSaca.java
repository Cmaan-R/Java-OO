package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteSaca {

	public static void main(String[] args) {

		Conta conta = new ContaCorrente(123, 231);

		conta.deposita(200.0);

		try {
			conta.saca(210.0);
		} catch (Exception e) {
			System.out.println("Erro: " + e.getMessage());
		}

		System.out.println(conta.getSaldo());

	}

}
