package br.com.dominioDaEmpresa.nomeDoProjeto.modelos;

public class ArquivadorDeContas {

	private Conta[] referencias;
	private int i;
	
	public ArquivadorDeContas() {
		this.referencias = new Conta[10];	// maximo 10 contas no array
	}
	
	public void adicionaConta(Conta conta) {
		this.referencias[this.i] = conta;
		this.i++;
	}
	
	public int getQuantidade() {
		return this.i;
	}

	public Conta buscaConta(int j) {
		return this.referencias[j];
	}
}
