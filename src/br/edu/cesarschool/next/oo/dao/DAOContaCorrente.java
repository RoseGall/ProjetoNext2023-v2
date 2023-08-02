package br.edu.cesarschool.next.oo.dao;

import java.io.Serializable;
import br.edu.cesarschool.next.oo.entidade.ContaCorrente;
import br.edu.cesarschool.next.oo.persistenciaobjetos.CadastroObjetos;

import javax.tools.JavaCompiler;

public class DAOContaCorrente {

    private CadastroObjetos cadastro = new CadastroObjetos(ContaCorrente.class);

    public boolean incluir(ContaCorrente conta) {
        ContaCorrente contaBusca = buscar(conta.getNumero());
        if (contaBusca != null) {
            return false;
        } else {
            cadastro.incluir(conta, conta.getNumero());
            return true;
        }
    }

    public ContaCorrente buscar(String numero) {

        return (ContaCorrente) cadastro.buscar(numero);
    }

    public boolean alterar(ContaCorrente conta) {

        ContaCorrente contaBusca = buscar(conta.getNumero());
        if(contaBusca == null) {
            return false;
        } else {
            cadastro.alterar(conta, conta.getNumero());
            return true;
        }
    }

    public ContaCorrente[] buscarTodos() {

        Serializable[] rets = cadastro.buscarTodos(ContaCorrente.class);
        ContaCorrente[] contas = new ContaCorrente[rets.length];
        for (int i = 0; i < rets.length; i++) {
            contas[i] = (ContaCorrente) rets[i];
        }
        return contas;
    }

}
