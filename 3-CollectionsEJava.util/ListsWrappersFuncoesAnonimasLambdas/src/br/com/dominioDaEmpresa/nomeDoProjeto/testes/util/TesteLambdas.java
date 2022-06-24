package br.com.dominioDaEmpresa.nomeDoProjeto.testes.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

import br.com.dominioDaEmpresa.nomeDoProjeto.modelos.Cliente;
import br.com.dominioDaEmpresa.nomeDoProjeto.modelos.Conta;
import br.com.dominioDaEmpresa.nomeDoProjeto.modelos.ContaCorrente;
import br.com.dominioDaEmpresa.nomeDoProjeto.modelos.ContaPoupanca;

public class TesteLambdas {

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
    
        // Um lambda recebe os parametros e uma especie de arrowFunction do
        // Node/JS 
        // Por baixo dos panos o Java cria a classe, executa a funçao e 
        // devolve o resultado
//        lista.sort( (Conta c1, Conta c2) -> {
//        	return c1.getNumero() - c2.getNumero();
//        });
        
        // OU MAIS EXUTO AINDA
        lista.sort( (c1, c2) -> c1.getNumero() - c2.getNumero());
        
        for (Conta conta : lista) {
        	System.out.println(conta.getNumero());
        }
        System.out.println();
        
        for (Conta conta : lista) {
        	System.out.println(conta.getTitular().getNome());
        }
        
//        Comparator<Conta> comp = ( (Conta c1, Conta c2) -> {
//        		String nome1 = c1.getTitular().getNome();
//        		String nome2 = c2.getTitular().getNome();
//        		
//        		return nome1.compareTo(nome2); 		
//        });
//        
//        lista.sort(comp);
        
        // OU AINDA DESSA FORMA
        lista.sort( (c1, c2) -> 
        	c1.getTitular().getNome().compareTo(c2.getTitular().getNome()));
        
        
//        // fazendo o laço com o metodo forEach
//        lista.forEach(new Consumer<Conta>() {
//
//			@Override
//			public void accept(Conta c) {
//				System.out.println(c.getTitular().getNome());
//			}
//        });
//        
        lista.forEach( (c) -> System.out.println(c.getTitular().getNome()));
	}
}


