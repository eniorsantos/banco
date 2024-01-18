package br.com.banco;

import java.io.Serializable;

public class contaCorrente extends conta implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private double chequeEspecial;
	private String tipo;
	
	public double getChequeEspecial() {
		return chequeEspecial;
	}

	public void setChequeEspecial(double chequeEspecial) {
		this.chequeEspecial = chequeEspecial;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	@Override
	public double getSaldo() {
		return this.saldo;
	}
	
	@Override
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	@Override
	public void  setDepositar ( double valor) {
		this.saldo += valor;
	}
	
	@Override
	public void setSaque (double valor)	{
		
		if (valor > saldo) {
			System.out.println("Saldo insuficiente!");
		}else {
			this.saldo -= (valor + 10);
		}
		
		
	}
	
	@Override
	public int getNumero() {
		return this.numero;
	}		
	
	
	public double limiteDisponivel() {
		return getSaldo() + chequeEspecial;
	}
	
	@Override
	public String toString() {
		return "ContaCorrente [\tnome = " + this.cliente.getName() + "\tnumero = " + this.getNumero() + "\tsaldo = " + this.getSaldo() +" ]"; 
	}

}
