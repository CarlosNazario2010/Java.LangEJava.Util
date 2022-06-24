package br.com.dominioDaEmpresa.nomeDoProjeto.testes.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import br.com.dominioDaEmpresa.nomeDoProjeto.modelos.Cliente;
import br.com.dominioDaEmpresa.nomeDoProjeto.modelos.Conta;
import br.com.dominioDaEmpresa.nomeDoProjeto.modelos.ContaCorrente;
import br.com.dominioDaEmpresa.nomeDoProjeto.modelos.ContaPoupanca;

public class ListaOrdenadaStrings {

	public static void main(String[] args) {

		Conta cc1 = new ContaCorrente(22, 33);
        Cliente clienteCC1 = new Cliente();
        clienteCC1.setNome("Nico");
        cc1.setTitular(clienteCC1);
        cc1.deposita(333.0);

        Conta cc2 = new ContaPoupanca(22, 44);
        Cliente clienteCC2 = new Cliente();
        clienteCC2.setNome("Guilherme");
        cc2.setTitular(clienteCC2);
        cc2.deposita(444.0);

        Conta cc3 = new ContaCorrente(22, 11);
        Cliente clienteCC3 = new Cliente();
        clienteCC3.setNome("Paulo");
        cc3.setTitular(clienteCC3);
        cc3.deposita(111.0);

        Conta cc4 = new ContaPoupanca(22, 22);
        Cliente clienteCC4 = new Cliente();
        clienteCC4.setNome("Ana");
        cc4.setTitular(clienteCC4);
        cc4.deposita(222.0);

        List<Conta> lista = new ArrayList<>();
        lista.add(cc1);
        lista.add(cc2);
        lista.add(cc3);
        lista.add(cc4);

        for (Conta conta : lista) {
        	System.out.println(conta.getTitular().getNome());
        }
        System.out.println();
        
//        TitularDaContaComparator comparator = new TitularDaContaComparator();
//        lista.sort(comparator);
        
        // Collections tambem possui o metodo sort
        Collections.sort(lista, new TitularDaContaComparator());
        
        for (Conta conta : lista) {
        	System.out.println(conta.getTitular().getNome());
        }
        System.out.println();
        
        // reverse inverte a ordem da lista
        Collections.reverse(lista);
        
        for (Conta conta : lista) {
        	System.out.println(conta.getTitular().getNome());
        }
        System.out.println();
        
        // shuffle embaralha os itens da lista
        Collections.shuffle(lista);
        
        for (Conta conta : lista) {
        	System.out.println(conta.getTitular().getNome());
        }
        System.out.println();
        
        // rotate rotaciona os itens da lista  // 2 posicoes
        Collections.rotate(lista, 2);
        
        for (Conta conta : lista) {
        	System.out.println(conta.getTitular().getNome());
        }
	}
}

class TitularDaContaComparator implements Comparator<Conta> {

	@Override
	public int compare(Conta c1, Conta c2) {
		String nome1 = c1.getTitular().getNome();
		String nome2 = c2.getTitular().getNome();
		
		// metodo compareTo da classe String devolve um positivo se estiver
		// primeiro na ordem alfabetica e um negativo se estiver depois
		return nome1.compareTo(nome2);
	}
}