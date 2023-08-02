package br.edu.cesarschool.next.oo.negocio;

import br.edu.cesarschool.next.oo.entidade.ContaCorrente;

import java.util.Comparator;

public class ComparadorContaCorrenteSaldo implements Comparator<ContaCorrente> {

    public ComparadorContaCorrenteSaldo() {
    }

    @Override
    public int compare(ContaCorrente c1, ContaCorrente c2) {

        return Double.compare(c1.getSaldo(), c2.getSaldo());
    }
}
