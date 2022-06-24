package br.com.dominioDaEmpresa.nomeDoProjeto;

import br.com.dominioDaEmpresa.nomeDoProjeto.modelos.*;

/**
 * teste para a exportacao do arquivo jar e a importacao da biblioteca
 * para outro desenvolvedor
 * @author carlos
 */
public class TesteBibliotece {

	public static void main(String[] args) {
		
		Conta conta = new ContaCorrente(4429, 123456);
		conta.deposita(100);
		System.out.println(conta.getSaldo());
	}
}
