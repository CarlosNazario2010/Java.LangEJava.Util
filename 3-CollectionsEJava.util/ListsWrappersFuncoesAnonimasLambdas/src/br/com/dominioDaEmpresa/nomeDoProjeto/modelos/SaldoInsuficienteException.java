package br.com.dominioDaEmpresa.nomeDoProjeto.modelos;

public class SaldoInsuficienteException extends Throwable{
	
	private static final long serialVersionUID = 1L;

	public SaldoInsuficienteException(String msg) {
		super(msg);
	} 
}
