package br.com.dominioDaEmpresa.nomeDoProjeto.modelos;

/**
 * interface responsavel por definir os metodos para o calculo dos impostos
 * @author carlos
 */
public interface ObjetoTributavel {
	void setValor(double valor);
	double calculaImposto(double valor, double taxa);
}

// como numa interface tudo é pulic e abstract e utilizacao desses
// no comeco dos metodos é opcional