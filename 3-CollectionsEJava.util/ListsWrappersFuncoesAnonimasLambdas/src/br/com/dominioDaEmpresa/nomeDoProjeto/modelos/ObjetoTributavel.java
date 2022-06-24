package br.com.dominioDaEmpresa.nomeDoProjeto.modelos;

public interface ObjetoTributavel {
	void setValor(double valor);
	double calculaImposto(double valor, double taxa);
	
}
