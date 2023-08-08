package br.edu.cesarschool.next.oo.entidade;

import java.io.Serializable;
import java.time.Duration;
import java.time.LocalDateTime;

public abstract class RegistroIdentificavel implements Serializable {

    LocalDateTime dataHoraCriacao;

    public LocalDateTime getDataHoraCriacao() {
        return dataHoraCriacao;
    }

    public void setDataHoraCriacao(LocalDateTime dataHoraCriacao) {
        this.dataHoraCriacao = dataHoraCriacao;
    }

    public long obterTempoDeCriacao() {

        LocalDateTime dataAtual = LocalDateTime.now();
        Duration duracao = Duration.between(dataHoraCriacao, dataAtual);
        return duracao.toDays();
    }

    public abstract String obterChave();
}
