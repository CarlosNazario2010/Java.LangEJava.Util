package br.com.dominioDaEmpresa.nomeDoProjeto.modelos;


	// toda classe em Java estende a classe Object. Entao todo referencia
	// da classe criada, tambem é uma referencia do tipo object
public class ContaCorrente extends Conta implements ObjetoTributavel {
						// extends Object (implicito)
	
	CalculadorDeImpostos calculador;	

	public ContaCorrente(int agencia, int numero) {					
		super(agencia, numero);	
		this.calculador = new CalculadorDeImpostos();
	}
	
	@Override								
	public void saca (double valor) throws SaldoInsuficienteException {		
		if (this.saldo < valor) {
			throw new SaldoInsuficienteException("Saldo Insuficiente");
		}
		this.saldo -= valor + 1;
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
	public void setValor(double valor) {
		this.calculador.setValor(valor);	
	}
												
	@Override
	public double calculaImposto(double valor, double taxa) {
		return this.calculador.calculaImposto(valor, taxa);
	}
	
		// sobrescrevendo o metodo toString da classe Object
		// semelhante ao dunder metodo __str__ do python
	@Override
	public String toString() {
		return super.toString();
	}
}
	