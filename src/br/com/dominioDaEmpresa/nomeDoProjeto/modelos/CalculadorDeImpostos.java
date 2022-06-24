package br.com.dominioDaEmpresa.nomeDoProjeto.modelos;

/**
 * classe que calcula os impostos a pagar na contas
 * @author carlos
 */

// nome FQN da classe ==> br.com.dominioDaEmpresa.nomeDaEspresa.modelos.CalculadorDeImpostos 
public class CalculadorDeImpostos implements ObjetoTributavel {

	@SuppressWarnings("unused")
	private double valor;

	@Override
	public void setValor(double valor) {
		this.valor = valor;
	}

/**
 * metodo que realiza o calculo dos impostos, recebe o valor a ser tributado
 * e a taxa a ser cobrada em percentual
 */
	@Override
	public double calculaImposto(double valor, double taxa) {
		double valorTaxado = valor - (valor * taxa);
		return valorTaxado;
	}
}
