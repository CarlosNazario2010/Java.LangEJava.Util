package br.com.dominioDaEmpresa.nomeDoProjeto.testes.util;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

import br.com.dominioDaEmpresa.nomeDoProjeto.modelos.Conta;
import br.com.dominioDaEmpresa.nomeDoProjeto.modelos.ContaCorrente;
import br.com.dominioDaEmpresa.nomeDoProjeto.modelos.ContaPoupanca;

public class TesteVector {

	public static void main(String[] args) {
		
		// Um Vector seria como um ArrayList, que pode trabalhar com
		// a mesma lista em varios stacks(pilhas)
		// Ele é uma classe thread safe
		// Neste exemplo só há um stack entao é desnecessario, ainda mais
		// porque o Vector consome mais recursos da maquina
		List<Conta> listaVector = new Vector<Conta>();
		List<Conta> listaLinkedList = new LinkedList<Conta>();
		List<Conta> listaArrayList = new ArrayList<Conta>();
		
		// como List é superclasse de Vector, LinkedList e ArrayList uma
		// referencia do tipo List pode receber um objeto de cada umas
		// das classes filhas  <<< POLIMORFISMO >>>
		
		ContaCorrente cc = new ContaCorrente(4429, 123456);
		ContaPoupanca cp = new ContaPoupanca(3240, 654321);
		
		listaVector.add(cc);		
		listaVector.add(cp);	
		
		System.out.println(listaVector);
		System.out.println(listaVector.size());	
		System.out.println(listaVector.get(0));
		
		System.out.println(cp.getNumero()); 	
												
		listaVector.remove(0);					
		System.out.println(listaVector.get(0));	
		System.out.println(listaVector.size()); 	
		
		ContaCorrente cc1 = new ContaCorrente(7894, 789456);
		ContaPoupanca cp2 = new ContaPoupanca(9876, 987654);
		
		listaVector.add(cc1);	
		listaVector.add(cp2);
		
		System.out.println(listaVector.size());
		
		for (int i = 0; i < listaVector.size(); i++) {	
			System.out.println(listaVector.get(i));
		}
	
		for (Conta conta: listaVector) {		
			System.out.println(conta);	 
		}							
	}
}
