package br.com.dominioDaEmpresa.nomeDoProjeto.testes;

import br.com.dominioDaEmpresa.nomeDoProjeto.modelos.*;

public class TesteObject {

	public static void main(String[] args) {
		System.out.println("string");
		System.out.println(123);
		
		ContaCorrente cc = new ContaCorrente(4429, 123456);
		ContaPoupanca cp = new ContaPoupanca(4429, 456123);
		Cliente cliente = new Cliente();
		cc.setTitular(cliente);
		cc.getTitular().setNome("Carlos");
		
		System.out.println(cc.getNumero());
		System.out.println(cp.getNumero());
	
		println(cliente.getNome());			// mesma referencia
		println(cc.getTitular().getNome());	// mesma referencia
		
			// como tudo é um object podemos usar esse tipo para referenciar qualquer objeto
		Object cc2 = new ContaCorrente(123, 456);
		Object cp2 = new ContaPoupanca(654, 321);
		
			// mas como Object nao possui os metodos implementados na classe
			// ContaCorrente nao podemos passar os seus atributos ou metodos
		
//		cc2.deposita(100);	// nao compila...
		
//		println(cc2);	// mas cc2 é uma referencia na memoria
						// obs - se sobrescrito o metodo toString herdado
						// da classe object, metodo retorna a implementacao
						// do metodo, ao inves de somente o endereco de memoria
		
			// metodo toString da classe Object, sobrescrito
			// com ele é possivel personalizar a impressao do objeto

//		cc2.toString();  	// nao desse forma
//		cp2.toString();  	// este tambem nao
		
							// mas desta forma >>>
		println(cc2);		// chamando o metodo da classe ContaCorrente
		println(cp2);		// chamando o metodo da SuperClasse Conta
	}

			// dentro do atributo de referencia out teria o metodo
			// println com essas e mais sobrecarga
//	static void println() {
//		
//	}
//	static void println(String string) {
//		
//	}
//	static void println(int numeroInteiro) {
//		
//	}
	
		// como cc e cp sao filhas da classe Conta, devido ao polimorfismo, 
		// serve para ambos, passar uma referencia do tipo Conta
		// no caso o tipo Conta é mais generico e aceita mais tipos de 
		//referencia
//	static void println(Conta conta) {
//		
//	}
	
		// nao mais necessario e nao foi preciso criar um metodo println que
		// recebe um objeto conta poupanca como parametro
//	static void println(ContaCorrente contaCorrente) {
//		
//	}

	
	// para passar os tipos de referencias para os parametros, o tipo de
	// classe mais generico que se tem é a classe Object, cujos filhos
	// sao todas as classes criadas. Toda classe extends Object por 
	// debaixo dos panos
	
	static void println(Object referencia) {
		System.out.println(referencia);
	}
}
