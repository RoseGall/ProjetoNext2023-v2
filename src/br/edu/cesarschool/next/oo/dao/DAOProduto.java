package br.edu.cesarschool.next.oo.dao;

import java.io.Serializable;

import br.edu.cesarschool.next.oo.entidade.Produto;
import br.edu.cesarschool.next.oo.persistenciaobjetos.CadastroObjetos;

public class DAOProduto {
	//private CadastroObjetos cadastro = new CadastroObjetos(Produto.class);

	private DAOGenerico daoGen = new DAOGenerico(Produto.class);
	public boolean incluir(Produto prod) {
//		Produto prodBusca = buscar(prod.getCodigo());
//		if (prodBusca != null) {
//			return false;
//		} else {
//			cadastro.incluir(prod, prod.getCodigo());
//			return true;
//		}
		return daoGen.incluir(prod);
	}
	public boolean alterar(Produto prod) {
//		Produto prodBusca = buscar(prod.getCodigo());
//		if (prodBusca == null) {
//			return false;
//		} else {
//			cadastro.alterar(prod, prod.getCodigo());
//			return true;
//		}
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
