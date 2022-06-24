package br.com.dominioDaEmpresa.nomeDoProjeto.testes.util;

import java.util.ArrayList;

import br.com.dominioDaEmpresa.nomeDoProjeto.modelos.Conta;
import br.com.dominioDaEmpresa.nomeDoProjeto.modelos.ContaCorrente;
import br.com.dominioDaEmpresa.nomeDoProjeto.modelos.ContaPoupanca;

public class TesteArrayGenerics {

	public static void main(String[] args) {
		
		// os "< >" se chamam generics
		// objeto do tipo ArrayList. O generics informa o tipo de referencia que o array comporta
		ArrayList<Conta> lista = new ArrayList<Conta>(); 
		
		ContaCorrente cc = new ContaCorrente(4429, 123456);
		ContaPoupanca cp = new ContaPoupanca(3240, 654321);
//		String nome = "carlos";
		
		lista.add(cc);		// metodo add adiciona itens no array
		lista.add(cp);	
//		lista.add(nome);	// arrayList<Conta> nao comporta objetos da classe String	
		
		System.out.println(lista);
		System.out.println(lista.size());		// size informa a quantiadade de itens
		System.out.println(lista.get(0));		// get pega um item pelo indice
		
//		Conta refCP = (Conta) lista.get(1); 	// fazendo o cast para uma ref mais expecifica
//		System.out.println(refCP.getNumero());	// dessa forma podemos acessar metodos da classe
		System.out.println(cp.getNumero()); 	// nao necessario, se passado o generics no ArrayList 
												
		lista.remove(0);						// remove remove objetos dos array pelo indice
		System.out.println(lista.get(0));		// agora o indice 0 do array é a CP
		System.out.println(lista.size()); 		// e só ha a CP no array
		
		ContaCorrente cc1 = new ContaCorrente(7894, 789456);
		ContaPoupanca cp2 = new ContaPoupanca(9876, 987654);
		
		lista.add(cc1);	
		lista.add(cp2);
		System.out.println(lista.size());
		
		for (int i = 0; i < lista.size(); i++) {	// laco for padrao
			System.out.println(lista.get(i));
		}
		
//		for (Object o: lista) {			// laco for simplificado. Para cada
//			System.out.println(o);		// Object o da lista, imprima o.
//		}
	
		for (Conta conta: lista) {		// com a referencia no ArrayList podemos fazer
			System.out.println(conta);	// o for simplificado com a referencia Conta ao
		}								// inves e Object		
	}
}
