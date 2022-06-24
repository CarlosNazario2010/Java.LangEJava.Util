package br.com.dominioDaEmpresa.nomeDoProjeto.testes.util;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import br.com.dominioDaEmpresa.nomeDoProjeto.modelos.Conta;
import br.com.dominioDaEmpresa.nomeDoProjeto.modelos.ContaCorrente;
import br.com.dominioDaEmpresa.nomeDoProjeto.modelos.ContaPoupanca;

public class TesteLinkedList {

	public static void main(String[] args) {
		
			// LinkedList possui os mesmos metodos do ArrayList
			// LinkedList nao usa um array por debaixo dos panos, mas um memento
			// que se recorda de seu antecessor e sucessor. Isto pode deixar a 
			// lista mais performatica, pois ao se remover um objeto, os indices
			// dos outros objetos nao se alteram como ocorre no array
		LinkedList<Conta> lista = new LinkedList<Conta>(); 
		
			// List é a interface implementada tanto pelo linkedList quanto pelo
			// ArrayList. Por isso os metodos com mesmo nome
		List<ContaCorrente> listaCC = new LinkedList<ContaCorrente>();
		List<ContaPoupanca> listaCP = new ArrayList<ContaPoupanca>();
		
		ContaCorrente cc = new ContaCorrente(4429, 123456);
		ContaPoupanca cp = new ContaPoupanca(3240, 654321);

		lista.add(cc);		
		lista.add(cp);	
		
		System.out.println(lista);
		System.out.println(lista.size());	
		System.out.println(lista.get(0));	
		
		System.out.println(cp.getNumero()); 
												
		lista.remove(0);					
		System.out.println(lista.get(0));	
		System.out.println(lista.size()); 	
		
		ContaCorrente cc1 = new ContaCorrente(7894, 789456);
		ContaPoupanca cp2 = new ContaPoupanca(9876, 987654);
		
		lista.add(cc1);	
		lista.add(cp2);
		
		System.out.println(lista.size());
		
		for (int i = 0; i < lista.size(); i++) {	
			System.out.println(lista.get(i));
		}
		
		System.out.println();
	
		for (Conta conta: lista) {		
			System.out.println(conta);	
		}							
	}
}
