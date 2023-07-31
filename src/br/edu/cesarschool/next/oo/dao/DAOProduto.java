package br.edu.cesarschool.next.oo.dao;

import java.io.Serializable;

import br.edu.cesarschool.next.oo.entidade.Produto;
import br.edu.cesarschool.next.oo.persistenciaobjetos.CadastroObjetos;

public class DAOProduto {
	private CadastroObjetos cadastro = new CadastroObjetos();
	public boolean incluir(Produto prod) {
		Produto prodBusca = buscar(prod.getCodigo());
		if (prodBusca != null) {
			return false;
		} else {
			cadastro.incluir(prod, prod.getCodigo());
			return true;
		}		
	}
	public boolean alterar(Produto prod) {
		Produto prodBusca = buscar(prod.getCodigo());
		if (prodBusca == null) {
			return false;
		} else {
			cadastro.alterar(prod, prod.getCodigo());
			return true;
		}		
	}
	public Produto buscar(String codigo) {
		return (Produto)cadastro.buscar(Produto.class, codigo);
	}
	public Produto[] buscarTodos() {
		Serializable[] rets = cadastro.buscarTodos(Produto.class);
		Produto[] prods = new Produto[rets.length];
		for(int i=0; i<rets.length; i++) {
			prods[i] = (Produto)rets[i];
		}
		return prods;
	}
}
