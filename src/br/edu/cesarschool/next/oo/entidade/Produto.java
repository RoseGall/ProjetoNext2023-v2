package br.edu.cesarschool.next.oo.entidade;

import java.io.Serializable;

public class Produto implements Serializable {
	private static final long serialVersionUID = 1L;
	private String codigo;
	private String nome;
	private double preco;
	public Produto() {
		
	}
	public Produto(String codigo, String nome, double preco) {
		this.codigo = codigo;
		this.nome = nome;
		this.preco = preco;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCodigo() {
		return codigo;
	}
	public double getPreco() {
		return preco;
	}
	public void aumentarPreco(double percentual) {
		preco = preco * (1 + percentual/100);
	}
	@Override
	public String toString() {
		return nome + " , " + codigo + " , " + preco;
	}
}
