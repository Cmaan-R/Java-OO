package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteTributaveis {

	public static void main(String[] args) {

		ContaCorrente cc = new ContaCorrente(222, 333);

		cc.deposita(100);

		br.com.bytebank.banco.modelo.SeguroDeVida sd = new br.com.bytebank.banco.modelo.SeguroDeVida();

		br.com.bytebank.banco.modelo.CalculadorImposto cal = new br.com.bytebank.banco.modelo.CalculadorImposto();
		cal.registra(cc);
		cal.registra(sd);

		System.out.println(cal.getTotalImposto());

	}

}
