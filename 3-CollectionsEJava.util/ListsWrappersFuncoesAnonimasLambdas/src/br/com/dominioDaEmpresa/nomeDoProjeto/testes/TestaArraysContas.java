package br.com.dominioDaEmpresa.nomeDoProjeto.testes;

import br.com.dominioDaEmpresa.nomeDoProjeto.modelos.Cliente;
import br.com.dominioDaEmpresa.nomeDoProjeto.modelos.ContaCorrente;

public class TestaArraysContas {

	public static void main(String[] args) {
		
		// criando a lista de contas
		ContaCorrente[] contas = new ContaCorrente[4];
		
		// criando as contas
		ContaCorrente contaCarlos = new ContaCorrente(1234, 123456);
		ContaCorrente contaJoao = new ContaCorrente(4321, 654321);
		
		// adicionando as contas nas posicoes do array
		contas[0] = contaCarlos;
		contas[1] = contaJoao;
		
		System.out.println(contas); 	// endereco de memoria do array
		System.out.println(contas[0]);
		System.out.println(contas[1]);
		
		// intanciando o cliente e settando o nome
		Cliente clienteCarlos = new Cliente();
		clienteCarlos.setNome("Carlos");
		
		Cliente clienteJoao = new Cliente();
		clienteJoao.setNome("Joao");
		
		// settando o cliente na conta
		contaCarlos.setTitular(clienteCarlos);
		contaJoao.setTitular(clienteJoao);
		
		// acessando o getter dentro do: contas > conta > titular > nome
		System.out.println(contas[0].getTitular().getNome());
		
		String nomeClienteJoao = contas[1].getTitular().getNome();
		System.out.println(nomeClienteJoao);
		
		// neste exemplo foram criados 5 objetos (2 Contas, 1 Array de Contas
		// 		e 2 Clientes)
		// foram criadas 8 referencias inicializadas (1 para o Array, 4 para 
		//      Contas (2 para cada titular) e 3 para Clientes (1 para 
		// 		Carlos e 2 para Joao)
		// foram criadas 2 referencias nao inicializadas (os 2 ultimos espacos 
		//		nulos no Array de 4 posicoes de Contas)
	}
}
