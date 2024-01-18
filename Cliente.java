package br.com.banco;

import java.io.Serializable;

public class Cliente implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int cpf;
	private String nome;	
	
	public Cliente() {

	}
	
	public Cliente(String nome, int cpf) {
		this.cpf = cpf;
		this.nome = nome;
	}
	
	
	public void setName(String nome) {
		this.nome = nome;
	}
	
	public String getName() {
		return this.nome;
	}
	
	
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	
	public int getCpf() {
		return this.cpf;
	}
	
}
