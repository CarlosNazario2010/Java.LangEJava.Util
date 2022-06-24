package br.com.dominioDaEmpresa.nomeDoProjeto.testes;

import br.com.dominioDaEmpresa.nomeDoProjeto.modelos.ArquivadorDeContas;
import br.com.dominioDaEmpresa.nomeDoProjeto.modelos.Conta;
import br.com.dominioDaEmpresa.nomeDoProjeto.modelos.ContaCorrente;
import br.com.dominioDaEmpresa.nomeDoProjeto.modelos.ContaPoupanca;

public class TesteArquivador {

	public static void main(String[] args) {
		
		// criando uma classe separada para os objetos tipo Array
		// como eles possuem uma sintaxe propria, é uma boa pratica
		// fazer isso para manter o padrao OO do Java
		ArquivadorDeContas arquivador = new ArquivadorDeContas();
		
		ContaCorrente cc = new ContaCorrente(4429, 123456);
		ContaPoupanca cp = new ContaPoupanca(3240, 654321);
		
		arquivador.adicionaConta(cc);
		arquivador.adicionaConta(cp);
		
		int quantidadeContas = arquivador.getQuantidade();	
		System.out.println("Total de contas: " + quantidadeContas);
		
		Conta conta1 = arquivador.buscaConta(0);
		Conta conta2 = arquivador.buscaConta(1);
		System.out.println(conta1 + " << >> " + conta2);
		System.out.println("Numero da conta1: " + conta1.getNumero());
		System.out.println("Agencia da conta2: " + conta2.getAgencia());
	}
}
