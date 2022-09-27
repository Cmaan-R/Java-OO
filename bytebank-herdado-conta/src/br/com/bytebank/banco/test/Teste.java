package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class Teste {
	
	public static void main(String[] args) {
		
		GuadadorDeContas guadador = new GuadadorDeContas();
		
		Conta cc = new ContaCorrente(22, 11);
		guadador.adiciona(cc);
		
		Conta cc2 = new ContaCorrente(22, 22);
		guadador.adiciona(cc2);
		
		int tamanho = guadador.getQuantidaDeElementos();
		System.out.println(tamanho);
		
		Conta ref = guadador.getReferencia(0);
		System.out.println(ref.getNumero());
	}

}
