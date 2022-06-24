package br.com.dominioDaEmpresa.nomeDoProjeto.testes.util;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import br.com.dominioDaEmpresa.nomeDoProjeto.modelos.Cliente;
import br.com.dominioDaEmpresa.nomeDoProjeto.modelos.Conta;
import br.com.dominioDaEmpresa.nomeDoProjeto.modelos.ContaCorrente;
import br.com.dominioDaEmpresa.nomeDoProjeto.modelos.ContaPoupanca;

public class TesteClassesEFuncoesAnonimas {

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
        	System.out.println(conta.getNumero());
        }
        System.out.println();
        
//        // Function Object
//        NumeroDaContaComparator2 comparator = new NumeroDaContaComparator2();
//        lista.sort(comparator);
//        
//        // simplificando
//        lista.sort(new NumeroDaContaComparator2());
        
        
        // Classe Anonima (nao possui nome)
        // por debaixo dos panos o java cria o arquivo .class referente a essa
        // classe. Dessa forma nao é necessario criar a classe para encapsular
        // o metodo
        // Metodo sort recebe o objeto Comparator com gererics Conta e chama
        // o construtor sem parametros
        // No corpo do objeto é sobrescrito o metodo compare da Interface
        // Comparator
        lista.sort(new Comparator<Conta>() {
        	
        	@Override
        	public int compare(Conta c1, Conta c2) {
        		return c1.getNumero() - c2.getNumero();
        	}
        });
        
        for (Conta conta : lista) {
        	System.out.println(conta.getNumero());
        }
        System.out.println();
        
        for (Conta conta : lista) {
        	System.out.println(conta.getTitular().getNome());
        }
        System.out.println();
        
        // funcao anonima (E nao classe anonima) 
        // que ordena a lista pelo nome do titular
        Comparator<Conta> comparator = new Comparator<Conta>() {
        	@Override
        	public int compare(Conta c1, Conta c2) {
        		String nome1 = c1.getTitular().getNome();
        		String nome2 = c2.getTitular().getNome();
        		
        		return nome1.compareTo(nome2);
        	}	
        };
        
        lista.sort(comparator);
        
        for (Conta conta : lista) {
        	System.out.println(conta.getTitular().getNome());
        }
	}
}

//class NumeroDaContaComparator2 implements Comparator<Conta> {
//
//	// Classe so foi criada para encapsular o metodo compare sobrescrito da 
//	// interface Comparator. Não possui atributos ou referencias à objetos 
//	// nao possui o THIS.
//	
//	@Override
//	public int compare(Conta c1, Conta c2) {
//		return c1.getNumero() - c2.getNumero();
//	}
//}

//class TitularDaContaComparator2 implements Comparator<Conta> {
//
//	// O mesmo dito para o NumeroDaContaComparator2 vale aqui
//
//	@Override
//	public int compare(Conta c1, Conta c2) {
//		String nome1 = c1.getTitular().getNome();
//		String nome2 = c2.getTitular().getNome();
//		
//		return nome1.compareTo(nome2);
//	}	
//}
