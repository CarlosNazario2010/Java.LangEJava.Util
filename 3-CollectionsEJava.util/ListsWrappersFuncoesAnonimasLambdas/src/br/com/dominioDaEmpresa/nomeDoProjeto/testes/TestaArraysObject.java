package br.com.dominioDaEmpresa.nomeDoProjeto.testes;

import br.com.dominioDaEmpresa.nomeDoProjeto.modelos.Cliente;
import br.com.dominioDaEmpresa.nomeDoProjeto.modelos.Conta;
import br.com.dominioDaEmpresa.nomeDoProjeto.modelos.ContaCorrente;
import br.com.dominioDaEmpresa.nomeDoProjeto.modelos.ContaPoupanca;

public class TestaArraysObject {

	public static void main(String[] args) {
		
			// array do tipo object é o tipo mais generico possivel
			// aceita objetos de qualquer tipo
		Object[] lista = new Object[5];
		
		ContaCorrente cc = new ContaCorrente(4429, 123456);
		ContaPoupanca cp = new ContaPoupanca(3240, 654321);
		
		Cliente cliente = new Cliente();
		cliente.setNome("Carlos");
		
		lista[0] = cc;
		lista[1] = cp;
		lista[2] = "Outra conta qualquer";
		lista[3] = 5555;
		lista[4] = cliente.getNome();
		
		System.out.println("Conta Corrente: " + lista[0]);
		System.out.println("Conta Poupanca: " + lista[1]);
		System.out.println("Objeto String: " + lista[2]);
		System.out.println("Tipo primitivo int: " + lista[3]);
		System.out.println("Nome Cliente: " + lista[4]);

		// esse codigo nao compila, visto que o tipo da referencia ContaPoupanca
		// é mais especifico que os tipos do array, que sao do tipo Object
		
//		ContaPoupanca cpRef = contas[1]; 	// contas[1] é realmente um ContaPoupanca
											// mas o compilador apenas aceita referencias
											// de um tipo mais generico para mais especifico
		
		// para conseguirmos referencia-la devemos fazer um CAST ou TYPE CAST
		// informa o compilador que sabemos realmente que a referencia do array
		// mais generico é do tipo especifico que queremos
		ContaPoupanca cpRef = (ContaPoupanca) lista[1];
		System.out.println(cpRef);

		// caso se tente realizar um cast em um tipo diferente de objeto (no caso
		// uma cast de ContaCorrente em um objeto ContaPoupanca), sera lancado
		// a excessao:
		// Exception in thread "main" java.lang.ClassCastException
//		ContaCorrente cpRef = (ContaCorrente) contas[1];
		
		// o cast ocorre implicitamente se a a nova referencia for mais generica,
		// isto é, se o tipo da nova referencia estende o tipo da referencia do
		// objeto que ele esta tentando apontar
		
		int numero1 = 3;
		double valor1 = (double) numero1; 	//cast explícito desnecessario, todo inteiro
										 	// é um double
		
		double valor2 = 3.56;
		int numero2 = (int) valor2; 		//cast explicito é exigido pelo compilador
		
		ContaCorrente ccRef = new ContaCorrente(22, 33);
		Conta contaImplicita = ccRef; 			// cast implicito
		Conta ContaExplicita = (Conta) ccRef; 	// cast explicito desnecessario

	}
}
