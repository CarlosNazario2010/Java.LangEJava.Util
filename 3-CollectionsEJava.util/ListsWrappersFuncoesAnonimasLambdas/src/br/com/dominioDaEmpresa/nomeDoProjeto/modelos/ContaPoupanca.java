package br.com.dominioDaEmpresa.nomeDoProjeto.modelos;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override								
	public void saca (double valor) throws SaldoInsuficienteException {		
		
		if (this.saldo >= valor) {
			throw new SaldoInsuficienteException("Saldo Insuficiente");
		}
		this.saldo -= valor;
	}

	@Override
	public void deposita(double valor) {		 
		super.saldo += valor;	
	}
	
	public void transfere(double valor, Conta conta) throws SaldoInsuficienteException {
		this.saldo -= valor;
		conta.deposita(valor);
	}
	
	@Override
	public double getSaldo() {
		return super.getSaldo();
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
}

