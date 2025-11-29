package org.example;

public class PlanoDeEnsino {
    private Professor responsavel;
    private String descricao;

    public PlanoDeEnsino(Professor responsavel, String descricao) {
        this.responsavel = responsavel;
        this.descricao = descricao;
    }

    public Professor getResponsavel() {
        return responsavel;
    }

    public String getDescricao() {
        return descricao;
    }
}
