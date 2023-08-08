package br.edu.cesarschool.next.oo.dao;

import java.io.Serializable;

import br.edu.cesarschool.next.oo.entidade.Produto;

public class DAOProduto {

	private DAOGenerico daoGen = new DAOGenerico(Produto.class);
	public boolean incluir(Produto prod) {
		return daoGen.incluir(prod);
	}
	public boolean alterar(Produto prod) {

		return daoGen.alterar(prod);
	}
	public Produto buscar(String codigo) {
		return (Produto)daoGen.buscar(codigo);
	}

	public Produto[] buscarTodos() {
		Serializable[] rets = daoGen.buscarTodos();
		Produto[] prods = new Produto[rets.length];
		for(int i=0; i<rets.length; i++) {
			prods[i] = (Produto)rets[i];
		}
		return prods;
	}
}
