package br.com.dominioDaEmpresa.nomeDoProjeto.modelos;

public class CalculadorDeImpostos implements ObjetoTributavel {

	@SuppressWarnings("unused")
	private double valor;

	@Override
	public void setValor(double valor) {
		this.valor = valor;
	}

	@Override
	public double calculaImposto(double valor, double taxa) {
		double valorTaxado = valor - (valor * taxa);
		return valorTaxado;
	}
}
