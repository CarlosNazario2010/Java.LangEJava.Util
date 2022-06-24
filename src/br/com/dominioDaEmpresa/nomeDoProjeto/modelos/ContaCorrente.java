package br.com.dominioDaEmpresa.nomeDoProjeto.modelos;

/**
 * classe que cria as contas correntes dos clientes
 * @author carlos
 */
public class ContaCorrente extends Conta implements ObjetoTributavel {
	
	public CalculadorDeImpostos calculador;	

/**
 * construtor da classe recebe numero da agencia e numero da conta como parametros
 * @param agencia
 * @param numero
 */
	public ContaCorrente(int agencia, int numero) {					
		super(agencia, numero);	
		this.calculador = new CalculadorDeImpostos();
	}
	
/**
 * metodo saca realiza o saque da conta do cliente; recebe o valor do saque como parametro;
 * lanca a excessao SaldoInsuficienteException caso se tente realizar o saque num valor
 * maior que o saldo em conta
 */
	@Override								
	public void saca (double valor) throws SaldoInsuficienteException {		
		if (this.saldo < valor) {
			throw new SaldoInsuficienteException("Saldo Insuficiente");
		}
		this.saldo -= valor + 1;
	}

	@Override
	public void deposita(double valor) {		// metodo abstrato da classe mae sobrescrito 
		super.saldo += valor;	
	}
	
/**
 * metodo que transfere o valor entre contas; recebe o valor a ser transferido e a 
 * agencia de destino como parametros; lanca a excessao SaldoInsuficienteException
 * caso o saldo da conta seja insuficiente para realizar a transferencia
 */
	public void transfere(double valor, Conta conta) throws SaldoInsuficienteException {
		this.saldo -= valor;
		conta.deposita(valor);
	}

	@Override
	public void setValor(double valor) {
		this.calculador.setValor(valor);	
	}										
/**
 * metodo que calcula o imposto a pagar pela conta; recebe o valor a ser tributado;
 * e o valor da taxa em percentual e retorna o valor liquido da conta, com o saldo
 * com o imposto aplicado
 */
	@Override
	public double calculaImposto(double valor, double taxa) {
		return this.calculador.calculaImposto(valor, taxa);
	}
}	