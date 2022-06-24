package br.com.dominioDaEmpresa.nomeDoProjeto.modelos;

/**
 * classe que cria as contas poupanca dos clientes
 * @author carlos

 */
public class ContaPoupanca extends Conta {

/**
 * construtor da classe poupanca recebe o numero da agencia e o numero da conta como
 * paramentros
 * @param agencia
 * @param numero
 */
	public ContaPoupanca(int agencia, int numero) {
		super(agencia, numero);
	}
	
/**
 * metodo que realiza o saque da conta; lanca um SaldoInsuficienteException caso
 * o saldo seja menor que o valor do saque
 */
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
	
/**
 * metodo que transfere valores entre contas; recebe o valor a ser transferido e 
 * a conta de destino do valor como paramentros; lanca um SaldoInsuficienteException
 * caso o saldo em conta seja menor que o valor da transferencia
 */
	public void transfere(double valor, Conta conta) throws SaldoInsuficienteException {
		this.saldo -= valor;
		conta.deposita(valor);
	}
	
	@Override
	public double getSaldo() {
		return super.getSaldo();
	}
}
