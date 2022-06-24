package br.com.dominioDaEmpresa.nomeDoProjeto.modelos;

/**
 * classe que cria os seguros de vida do cliente
 * @author carlos
 */
public class SeguroDeVida implements ObjetoTributavel {
	public CalculadorDeImpostos calculador;	
	
	public SeguroDeVida(double valor) {
		this.calculador = new CalculadorDeImpostos();
	}
	
/**
 * metodo que calcula os impostos pagos em um seguro de vida;
 * recebe o valor a ser tributado e a taxa em percentual a ser aplicada;
 * retorna o valor liquido, ja com imposto aplicado
 */
	@Override
	public double calculaImposto(double valor, double taxa) {
		return this.calculador.calculaImposto(valor, taxa);
	}

	@Override
	public void setValor(double valor) {
		this.calculador.setValor(valor);;
	}
}
