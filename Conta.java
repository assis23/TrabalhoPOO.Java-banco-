package assisMachado.banco;

public class Conta {
	private int num;
	private double saldo = 0;
	private double creditoConta = 0;
	private double debito = 0;

	public void setNum(int num) {
		this.num = num;
	}

	public int getNum() {
		return num;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public double getCreditoConta() {
		return this.creditoConta;
	}
	
	public double getDebito() {
		return this.debito;
	}

	public void credito(double saldo) {
		if (saldo > 0) {
			this.saldo += saldo;
			this.creditoConta += saldo;
		}

	}
	public void saque(double saque) {
		
		if(this.saldo >= saque) {
			this.saldo -= saque;
			this.debito += saque;
		}
	}
}
