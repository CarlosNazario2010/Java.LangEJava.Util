package br.com.dominioDaEmpresa.nomeDoProjeto.testes;

public class TestaArrays {

	public static void main(String[] args) {
		
		// Array []
		// Array sao objetos, por isso devem ser inicializados com new, e 
		// devem ser refenciado como o tipo da referencia
		// entre colchetes o tamanho do array
		String[] nomes = new String[2]; 

		String nome1 = "Carlos";
		String nome2 = "Joao";
		
		nomes[0] = nome1;
		nomes[1] = nome2;
		System.out.println("Nomes: " + nomes[0] + " e " + nomes[1]);
		
//		nomes[2] = "Marcos";			java.lang.ArrayIndexOutOfBoundsException
//		System.out.println(nomes[2]);	tamanho da lista é menor que o indice
		
			// atributo length retorna o tamanho do array 
		System.out.println("Tamanho da lista: " + nomes.length);
		
			// itera a lista nomes e imprime o nome do indice
		for (int i = 0; i < nomes.length; i++) {
			System.out.println("Nome" + i + " : " + nomes[i]);
		}
		
		// acima foi usado arrays de referencia visto que a classe String
		// é uma classe de referencia
		
			// tambem pode ser feito com tipos primitivos como o int
		int[] numeros = new int[3];
		
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = i;
			System.out.println("Numero: " + numeros[i]);
		}
		
		int[] valores = {1, 2, 3, 4, 5};
		
			// com chaves "{...}" podemos atribuir o conteudo de forma literal
		for (int i = 0; i < valores.length; i++) {
			System.out.println(valores[i]);
		}
	}
}
