package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Conta;

public class GuadadorDeContas {

	private Conta[] referencias;
	private int posicaoLivre;

	public GuadadorDeContas() {
		this.referencias = new Conta[10];
		this.posicaoLivre = 0;
	}

	public void adiciona(Conta ref) {
		this.referencias[this.posicaoLivre] = ref;
		posicaoLivre++;
	}

	public int getQuantidaDeElementos() {
		return this.posicaoLivre;
	}

	public Conta getReferencia(int pos) {
		return this.referencias[pos];
	}

}
