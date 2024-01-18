package br.com.banco;

import java.io.Serializable;

abstract class conta implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected int numero;
	protected Cliente cliente;
	protected double saldo;
	
	public conta () {
		
	}
	
	public conta (int numero, Cliente cliente, double saldo) {
		this.numero = numero;
		this.saldo = saldo;
		this.cliente = cliente;
	}	
	
	// Metodos Abstratos
	
	public abstract void setNumero(int numero);		
	
	public abstract double getSaldo(); 
	
	public abstract void  setDepositar ( double valor);
	
	public abstract void setSaque (double valor);
	
	public abstract int getNumero();

}
