package br.com.dominioDaEmpresa.nomeDoProjeto.modelos;

/**
 * classe que lanca uma execessao de saldo insuficiente nas tentativas de
 * realizar um saque ou uma transferencia
 * @author carlos
 */

public class SaldoInsuficienteException extends Throwable{
	private static final long serialVersionUID = 1L;
	
/**
 * exception que lanca a mensagem de saldo insuficiente
 * @param msg
 */
	public SaldoInsuficienteException(String msg) {
		super(msg);
	} 
}
