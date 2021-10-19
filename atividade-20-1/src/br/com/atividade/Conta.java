package br.com.atividade;

public class Conta implements Operacoes {
	// Atributos
	private String agencia;
	private String numeroConta;
	private String cpfTitular;
	private double saldo;

	// Metodos da interface - Sobrescrita
	@Override
	public double fazerDeposito(double dinheiro) {
		// TODO Auto-generated method stub
		return this.saldo = this.saldo + dinheiro;
	}

	@Override
	public double fazerSaque(double dinheiro) {
		// TODO Auto-generated method stub
		if (this.saldo > 0 && this.saldo >= dinheiro)
			this.saldo = this.saldo - dinheiro;
		return 0;
	}

	// Metodos Get e Set
	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}

	public String getCpfTitular() {
		return cpfTitular;
	}

	public void setCpfTitular(String cpfTitular) {
		this.cpfTitular = cpfTitular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

}
