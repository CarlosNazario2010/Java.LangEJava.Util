package br.com.dominioDaEmpresa.nomeDoProjeto.testes.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import br.com.dominioDaEmpresa.nomeDoProjeto.modelos.Conta;
import br.com.dominioDaEmpresa.nomeDoProjeto.modelos.ContaCorrente;
import br.com.dominioDaEmpresa.nomeDoProjeto.modelos.ContaPoupanca;

public class ListaOrdenadaIntegers {

	public static void main(String[] args) {
		
		Conta cc1 = new ContaCorrente(22, 33);
		cc1.deposita(333.0);

        Conta cc2 = new ContaPoupanca(22, 44);
        cc2.deposita(444.0);

        Conta cc3 = new ContaCorrente(22, 11);
        cc3.deposita(111.0);

        Conta cc4 = new ContaPoupanca(22, 22);
        cc4.deposita(222.0);

        List<Conta> lista = new ArrayList<>();
        lista.add(cc1);
        lista.add(cc2);
        lista.add(cc3);
        lista.add(cc4);
         
        for(Conta conta : lista) {
        	System.out.println(conta.getSaldo());
        }
         
//        // classe OrdenadorSaldo implementada a baixo
//        OrdenadorSaldo ordenadorSaldo = new OrdenadorSaldo();
//        
//        // metodo sort recebe um Comparator para ordenar a lista
//        lista.sort(ordenadorSaldo);
        
        lista.sort(new OrdenadorSaldo());

        for (Conta conta : lista) {
        	System.out.println(conta.getSaldo());
        }
        
        // metodo compareTo implementado da Interface Comparable define a ordem natural
        // foi definido que a ordem é a numeração da conta
        // neste caso não foi definido um comparator
        Collections.sort(lista);
        
        for (Conta conta : lista) {
        	System.out.println(conta.getNumero());
        }
	}			
}

	// Classe implementa a Interface Comparator recebendo o generics Conta
class OrdenadorSaldo implements Comparator<Conta> {

	// Metodo compare sobrescrito
	@Override
	public int compare(Conta c1, Conta c2) {

		if (c1.getSaldo() < c2.getSaldo()) {
			return -1;
		}
		if (c1.getSaldo() > c2.getSaldo()) {
			return 1;
		}
		return 0;
	}	
}

	// OBS - PODEM SER CRIADOS VARIAS CLASSES QUE IMPLEMENTAM O COMPARATOR 
	// 		 PARA CRIAR COMPARACOES COM NOVOS PARAMETROS
