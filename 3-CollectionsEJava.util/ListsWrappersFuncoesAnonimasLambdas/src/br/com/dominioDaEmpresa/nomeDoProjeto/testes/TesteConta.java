package br.com.dominioDaEmpresa.nomeDoProjeto.testes;							// 1 package

//import br.com.dominioDaEmpresa.nomeDaEspresa.modelos.ContaCorrente;			// 2 imports
//import br.com.dominioDaEmpresa.nomeDaEspresa.modelos.ContaPoupanca;			
//import br.com.dominioDaEmpresa.nomeDaEspresa.modelos.SeguroDeVida; 			// OU...

import br.com.dominioDaEmpresa.nomeDoProjeto.modelos.*;							// 2 '*' pega todas as classes

public class TesteConta {										// 3 class

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
		
		System.out.println("Saldo contaCorrente: " + contaCorrente.getSaldo());
		System.out.println("Saldo seguroDeVida: " + seguro.getSaldo());
		
				// taxa de imposto == ultimo parametro
		System.out.println("Imposto Seguro de vida (20%): " 
				+ seguro.calculaImposto(100, 0.2)); 			
		System.out.println("Imposto Conta Corrente (10%): " 
				+ contaCorrente.calculaImposto(contaCorrente.getSaldo(), 0.1));
	}
}
