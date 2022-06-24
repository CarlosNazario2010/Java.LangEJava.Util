package br.com.dominioDaEmpresa.nomeDoProjeto.modelos;

public class SeguroDeVida implements ObjetoTributavel {
	
	public CalculadorDeImpostos calculador;	
	private double saldo;
	
	public SeguroDeVida(double valor) {
		this.calculador = new CalculadorDeImpostos();
		this.saldo = valor;
	}
	
	@Override
	public double calculaImposto(double valor, double taxa) {
		return this.calculador.calculaImposto(valor, taxa);
	}

	@Override
	public void setValor(double valor) {
		this.calculador.setValor(valor);;
	}
	
	public double getSaldo() {
		return saldo;
	}
}
