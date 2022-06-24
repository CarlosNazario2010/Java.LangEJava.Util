package br.com.dominioDaEmpresa.nomeDoProjeto.testes;

public class TesteString {

	public static void main(String[] args) {
		
			// FQN >> java.lang.String
		String nome = "Carlos"; 		
		System.out.println("Nome normal: " + nome);
		
		// -->> objetos String sao imutaveis e sempre devemos
		// 		instanciar uma nova referencia para apontar modificacoes
		
		// A classe String possui metodos de mesmo nome onde o que varia sao os 
		// 		parametros passados. Metodos desse tipo em Java sao metodos com
		//			sobrecarga
		
			// metodo replace substitui um caractere por outro
		String nomeMinusculo = nome.replace("C", "c");
		System.out.println("Nome minusculo: " + nomeMinusculo);
		
			// metodo toUpperCase converte todos os caracteres para maiusculo
		String nomeMaiusculo = nome.toUpperCase();
		System.out.println("Nome maiusculo: " + nomeMaiusculo);
		
			// metodo substring pega parte da string apartir do indice
		String substring = nome.substring(3);
		System.out.println("Substring apartir do indice 3: " + substring);
		
			// metodo charAt me da o caracter conforme o indice passado
		char nomePosicaoCaracter = nome.charAt(2);
		System.out.println("Caracter na posicao 2: " + nomePosicaoCaracter);
		
			// metodo indexOf pega o indice do primeiro caracter da substring passada
		int indiceNome = nome.indexOf("rlo");
		System.out.println("Indice do inicio da substring 'rlo': " + indiceNome);
	
			// metodo length retorna um int com o tamanho da string
		int tamanho = nome.length();
		System.out.println("Quantidade de letras	: " + tamanho);
		
			// laco para imprimir cada um dos caracteres
		for (int i = 0; i < nome.length(); i++) {
			System.out.println((i + 1) + " - letra do nome: " + nome.charAt(i));
		}
			
			// metodo isEmpty em string sem nada preenchido devolve true
		String vazio = "";
		System.out.println("String vazio esta vazia ? " + vazio.isEmpty());

			// metodoisEmpty em string com espcaos devolve false
		String vazioComEspacos = "    ";
		System.out.println("String vazioComEspacos esta vazia ? " + vazioComEspacos.isEmpty());
		
			// metodo trim remmove os espacos da string
		String vazioEspacosRemovidos = vazioComEspacos.trim();
		System.out.println("String vazioEspacosRemovidos esta vazia ? " + vazioEspacosRemovidos.isEmpty());

			// metodo trim nao remove os espacos entre os caracteres
		String nomeComEspacos = "   Carlos Eduardo      ";
		String nomeSemEspacos = nomeComEspacos.trim();
		System.out.println("Nome sem espacos removidos: " + nomeComEspacos);
		System.out.println("Nome com espacos removidos: " + nomeSemEspacos);
		
			// metodo contains informa se a string possui ou nao a substring
		System.out.println("NomeComEspacos contem 'uar'? " + nomeComEspacos.contains("uar"));
		
		// um char geralmente é representado por aspas simples
//		char a = 'a';
			
			// uma string geralmente representado por aspas duplas
//		String string = "string";
		
			// CharSequence é uma interface da Classe String
			// public class String implements CharSequence { ... }
//		CharSequence seq = "é uma sequencia de caracteres";
		
			// metodo concat concatena strings
		String texto = "Socorram";
		texto = texto.concat("-");
		texto = texto.concat("me");
		texto = texto.concat(", ");
		texto = texto.concat("subi ");
		texto = texto.concat("no ");
		texto = texto.concat("ônibus ");
		texto = texto.concat("em ");
		texto = texto.concat("Marrocos");
		System.out.println(texto); 
		
			// o mesmo efeito pode ser obtido usando a classe StringBuilder
			// os objetos instanciados pela classe StringBuilder sao mutaveis
			// diferente da classe String que sao imutaveis
		StringBuilder builder = new StringBuilder("Socorram");
		builder.append("-");
		builder.append("me");
		builder.append(", ");
		builder.append("subi ");
		builder.append("no ");
		builder.append("ônibus ");
		builder.append("em ");
		builder.append("Marrocos");
		String textoBuilder = builder.toString();
		System.out.println(textoBuilder);
		
		// A classe StringBuilder tambem implementa a interface CharSequence
		// public class StringBuilder implements CharSequence { ... }
		
//		CharSequence cSeq = new StringBuilder("também é uma sequencia de caracteres");
		
		String nomeCarlos = "carlos";
			
		CharSequence charSequence = new StringBuilder("CAR");

		nomeCarlos = nomeCarlos.replace("car", charSequence);

		System.out.println(nomeCarlos);
		
		// Obs - A classe String possui muitos outros metodos que podem ser
		//		consultados na documentacao
	}
}
