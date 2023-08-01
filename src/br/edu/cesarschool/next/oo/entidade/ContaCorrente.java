package br.edu.cesarschool.next.oo.entidade;

import java.io.Serializable;
public class ContaCorrente implements Serializable {

    private String numero;
    private double saldo;
    private String nomeCorrentista;

    public ContaCorrente() {
    }

    public ContaCorrente(String numero, double saldo, String nomeCorrentista) {
        this.numero = numero;
        this.saldo = saldo;
        this.nomeCorrentista = nomeCorrentista;
    }

    public String getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getNomeCorrentista() {
        return nomeCorrentista;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setNomeCorrentista(String nomeCorrentista) {
        this.nomeCorrentista = nomeCorrentista;
    }

    public void creditar(double valor) {

        saldo += valor;
    }

    public void debitar(double valor) {

        saldo -= valor;
    }
}
