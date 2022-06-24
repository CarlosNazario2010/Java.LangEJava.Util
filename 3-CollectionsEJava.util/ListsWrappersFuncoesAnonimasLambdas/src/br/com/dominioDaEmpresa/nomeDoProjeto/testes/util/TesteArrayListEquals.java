package br.com.dominioDaEmpresa.nomeDoProjeto.testes.util;

import java.util.ArrayList;

import br.com.dominioDaEmpresa.nomeDoProjeto.modelos.Conta;
import br.com.dominioDaEmpresa.nomeDoProjeto.modelos.ContaCorrente;
import br.com.dominioDaEmpresa.nomeDoProjeto.modelos.ContaPoupanca;

public class TesteArrayListEquals {

	public static void main(String[] args) {
		
		ArrayList<Conta> lista = new ArrayList<Conta>(); 
		ContaCorrente cc = new ContaCorrente(4429, 123456);
		ContaPoupanca cp = new ContaPoupanca(3240, 654321);
		
			// referencia cp1 possui o mesmo objetdo a referencia cp
		ContaPoupanca cp1 = new ContaPoupanca(3240, 654321);

		
		lista.add(cc);		// cp1 nao foi adicionado na lista
		lista.add(cp);
		
		boolean existe = lista.contains(cp1);
			// contains devolve true/ false, caso a referencia do objeto exista na lista
			// caso o metodo equals da classe object for sobrescrito na classe Conta, contains 
			// vai retornar true se o objeto for o mesmo, independentemente da referencia, visto
			// que o contains internamente roda o metedo equals
		
		System.out.println("Ja existe? " + existe);	
			// true para cp
			// false para cp1	-->> true se o metodo equals de Object for sobrescrito
		
			// metodo equals devolve true se agencia e numero das contas das referencias forem iguais
		boolean igual = cp.equals(cp1);
		System.out.println("CP é igual a CP1? " + igual);
		
			// OBS - por padrao o metodo equals compara um igualdade: Ref a == Ref b
			// se sobrescrito pode se adaptar a regra de negocios desejada
		
		for (Conta conta: lista) {		
			System.out.println(conta);	
		}								
	}
}
