package br.com.jnasports.model;

public abstract class Produto {
	private String nome;
	private double precoBase;
	
	public Produto(String nome, double preco) {
		this.nome = nome;
		this.precoBase = preco;
	}

	public String getNome() {return nome;}

	public void setNome(String nome) {this.nome = nome;}

	public double getPrecoBase() {return precoBase;}

	public void setPrecoBase(double preco) {this.precoBase = preco;}
	
	public abstract double calcularDesconto();
	
}
