package br.com.dominioDaEmpresa.nomeDoProjeto.modelos;

	// Interface Comparable implementa a ordem natural desejada para os objetos
	// tambem recebe um generics do tipo Conta
public abstract class Conta implements Comparable<Conta>{					
	
	private static int totalDeContas;								
	protected double saldo;			
	private int agencia;					
	private int numero;
	private Cliente titular;
	
	public Conta(int agencia, int numero) {		
		totalDeContas++;
		
		if (agencia <= 0 || numero <= 0) {
			System.out.println("Agencia precisa ser um numero inteiro positivo");
			return;
		}
		this.agencia = agencia;
		this.numero = numero;
	}
	
	public abstract void deposita(double valor);
	
	public abstract void saca (double valor) throws SaldoInsuficienteException;
		
	public abstract void transfere(double valor, Conta conta) throws SaldoInsuficienteException;
	
	@Override
	public boolean equals(Object outra) {	// sobrescreveno o metodo equals da classe Object
		Conta conta = (Conta) outra;		// fazendo o cast da referncia generica outra para a referencia especifica conta
		
		if (this.agencia != conta.agencia) {
			return false;
		}
		if (this.numero != conta.numero) {
			return false;
		}
		return true;
	}
	
	
		// metodo toString da classe Object. Este metodo é chamado nas classes 
		// filhas. Assim cada nova personalizacao na classe conta se refletirá
		// nas conta das classes filhas
	@Override
	public String toString() {
		return "Numero: " + this.numero + " --- Agencia: " + this.agencia;
	}
	
		// metodo da interface Comparable sobrescrito
		// define a ordem natural de uma lista de contas. No caso a ordem é a numeração da conta
	@Override
	public int compareTo(Conta c) {
		return Integer.compare(this.numero, c.numero);
	}
	
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
	public Cliente getTitular() {						
		return titular;						 		
	}
	public void setTitular(Cliente titular) { 	
		this.titular = titular;
	}
}


