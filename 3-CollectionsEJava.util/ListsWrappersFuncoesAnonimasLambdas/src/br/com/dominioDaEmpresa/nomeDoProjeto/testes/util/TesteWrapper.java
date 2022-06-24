package br.com.dominioDaEmpresa.nomeDoProjeto.testes.util;

import java.util.ArrayList;
import java.util.List;

public class TesteWrapper {

	public static void main(String[] args) {

			// nao compila com os generics com tipos primitivos
//		List<int> valores = new ArrayList<int>();
		
		// uma lista guarda apenas referencias e nao tipos primitivos como o int
		List<Integer> numeros = new ArrayList<Integer>();
		
		int numero = 30;
		
		// por debaixo dos panos o Java converte o tipo primitivo para um objetos
		// da classe Integer	<< WRAPPER >>
		@SuppressWarnings("removal")
		Integer numeroRef = new Integer(40);
		
		// delegando a criacao do objeto ao metodo valueOf da classe Integer
		Integer numeroRef2 = Integer.valueOf(50);	// autoboxing
		
		// metodo intValue devolve o tipo primitivo do objeto Integer
		// o oposto do que faz o wrapper
		int numeroRef3 = numeroRef2.intValue();		// inboxing
		
		// Interger.valueOf converte o objeto para uma referncia do tipo Integer
		// << PARSING >>
		String numeroString = "70";
		Integer numeroRef4 = Integer.valueOf(numeroString);
		
		// Integer.parseInt converte para o tipo primitivo inteiro
		int numeroRef5 = Integer.parseInt(numeroString);
		
		numeros.add(numero);	// permite adicionar tipo primitivo
		numeros.add(numeroRef);	// por baixo dos panos adiciona uma referencia
		numeros.add(numeroRef2);
		numeros.add(numeroRef3);
		numeros.add(60);		// todos os metodos acima o Java executa por 
								// debaixo dos panos
		numeros.add(numeroRef4);
		numeros.add(numeroRef5);
		
		System.out.println(numeros);
		
		double doublePrim = 3.1;					// tipo primitivo 
		Double doubleRef = 3.2;						// Referencia de objeto
		Double doubleConstr = new Double(3.3);		// Usando o construtor (java faz por baixo dos panos)
		// << UNBOXING >>
		Double doubleObj = Double.valueOf(3.4);		// Usando o metodo de atribuir valor (java faz por debaixo dos panos) 
		
		// << OUTBOXING >>
		System.out.println(doublePrim + ", " + doubleRef + ", " + 
							doubleConstr + ", " +  doubleObj);
		
		Boolean booleanRef = Boolean.valueOf(false);	// unboxing
		System.out.println(booleanRef.booleanValue());	// outboxing
		
		// superClasse Number  << POLIMORFISMO >>
		Number refInteiro = Integer.valueOf(100);
		Number refDouble = Double.valueOf(100.5);
		Number refFloat = Float.valueOf(100.54f);
		
		List<Number> listaNumber = new ArrayList<Number>();
		
		listaNumber.add(refInteiro);
		listaNumber.add(refDouble);
		listaNumber.add(refFloat);
		
		System.out.println(listaNumber);	
	}
}
