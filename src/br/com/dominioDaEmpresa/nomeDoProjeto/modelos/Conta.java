package br.com.dominioDaEmpresa.nomeDoProjeto.modelos;

/**
 * classe Conta é uma classe abstrata que possui grande parte de seus metodos abstratos;
 * é a SuperClasse usada para criar outros tipos de conta
 * @author carlos
 */

public abstract class Conta {					
	
	private static int totalDeContas;											
	protected double saldo;			
	private int agencia;					
	private int numero;
	private Cliente titular;
	
/**
 * Contrutor da classe recebe como parametros o numero da agencia e o numero da conta
 * @param agencia
 * @param numero
 */
	public Conta(int agencia, int numero) {					
		totalDeContas++;
		System.out.println("Total de contas criadas: " + totalDeContas);
		
		if (agencia <= 0 || numero <= 0) {
			System.out.println("Agencia precisa ser um numero inteiro positivo");
			return;
		}
		this.agencia = agencia;
		this.numero = numero;
	}
	
/**
 * os metodos para movimentacao da conta como saca, deposita e transfere sao implementados
 * pelas classes filhas, visto que diferentes tipos de conta, tem diferentes formas de 
 * serem movimentadas
 * @param valor
 */
	public abstract void deposita(double valor);
	
	
	public abstract void saca (double valor) throws SaldoInsuficienteException;
	
		
	public abstract void transfere(double valor, Conta conta) throws SaldoInsuficienteException;
	
/**
 * getter estatico da classe que calcula o valor de todas as contas ja criadas
 * @return
 */
	public static int getTotalDeContas() {		
		return totalDeContas;				
	}
	
	public double getSaldo() {						
		return this.saldo;							
	}
	public int getNumero() {		
		return this.numero;
	}
	public void setNumero(int numero) { 	
		this.numero = numero;															
	}
	public int getAgencia() {		
		return this.agencia;
	}
	public void setAgencia(int agencia) {	
		this.agencia = agencia;				
	}
	
/**
 * o atributo titular é instancia da classe Cliente e faz parte da composicao da conta,
 * ja que toda conta deve ter um titular
 * @return
 */
	public Cliente getTitular() {						
		return titular;						 		
	}
	public void setTitular(Cliente titular) { 	
		this.titular = titular;
	}
}
