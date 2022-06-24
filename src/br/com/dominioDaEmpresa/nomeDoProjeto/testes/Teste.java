package br.com.dominioDaEmpresa.nomeDoProjeto.testes;							// 1 packge

//import br.com.dominioDaEmpresa.nomeDaEspresa.modelos.ContaCorrente;			// 2 imports
//import br.com.dominioDaEmpresa.nomeDaEspresa.modelos.ContaPoupanca;			
//import br.com.dominioDaEmpresa.nomeDaEspresa.modelos.SeguroDeVida; 			// OU...

import br.com.dominioDaEmpresa.nomeDoProjeto.modelos.*;							// 2 '*' pega todas as classes

/**
 * metodo main que realiza um teste em todas as classes que simulam um 
 * banco criadas
 * @author carlos
 */
public class Teste {															// 3 class

	public static void main(String[] args) {
		
		ContaCorrente contaCorrente = new ContaCorrente(4429, 12345);
		ContaPoupanca contaPoupanca = new ContaPoupanca(3240, 654321);
		
		contaCorrente.deposita(100);
		contaPoupanca.deposita(200);
		
		try {
			contaCorrente.transfere(10, contaPoupanca);
		} catch (SaldoInsuficienteException e) {
			e.printStackTrace();
		}
		
		System.out.println("Saldo contaCorrente: " + contaCorrente.getSaldo());
		System.out.println("Saldo contaPoupanca: " + contaPoupanca.getSaldo());
		
		try {
			contaCorrente.saca(10);				// taxa de saque == 1 real
		} catch (SaldoInsuficienteException e) {
			e.printStackTrace();
		}		
		
		System.out.println("Saldo contaCorrente: " + contaCorrente.getSaldo());

		SeguroDeVida seguro = new SeguroDeVida(100);
		
				// taxa de imposto == ultimo parametro
		System.out.println(seguro.calculaImposto(100, 0.2)); 			
		System.out.println(contaCorrente.calculaImposto(contaCorrente.getSaldo(), 0.1));
	}
}
