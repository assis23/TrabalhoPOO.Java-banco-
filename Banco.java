package assisMachado.banco;

import java.util.ArrayList;

public class Banco {
	private ArrayList<Conta> listaDeContas = new ArrayList<Conta>();
	
	
	
	public void incluir(Conta conta) {
		listaDeContas.add(conta);
		
	}
	
	public double saldo(int numConta) {
		
		for(Conta conta : listaDeContas) {
			if(conta.getNum() == numConta) {
				return conta.getSaldo();
			}
			
		}
		
		return -999999; 
	}

	public void deposito(int numConta, double valor) {
		
		for(Conta conta : listaDeContas) {
			if(conta.getNum() == numConta) {
				conta.credito(valor);
			}
		}
		
	}

	public void saque(int numConta, double valorDeSaque) {
		
		for(Conta conta : listaDeContas) {
			if(conta.getNum() == numConta) {
				conta.saque(valorDeSaque);
			}
		}
		
		
	}

	public String extrato (int numConta) {
		for(Conta conta : listaDeContas) {
			if(conta.getNum() == numConta) {
				String a = " Credito: " + conta.getCreditoConta() + "." + " Saldo: " + conta.getCreditoConta() + ".\n";
				String b = " Debito: " + conta.getDebito() + "." + " Saldo: " + conta.getSaldo() + "." + "\n";
				return a + b; 
			}
		}
		
		return ""; //Retorna como conta inesistente
	}
}
