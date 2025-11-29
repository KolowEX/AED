package org.example;

// Essa classe de bolsas, teremos apenas bolsas predefinidas, por isso não vamos validar aqui.
public class Bolsa {
    private String nome;
    private int desconto;
    private boolean valida;

    public Bolsa (String nome, int desconto) {
        this.nome = nome;
        this.desconto = desconto;
    }

    public void validar() {
        valida = !valida;
    }

    public int getDesconto() {
        return desconto;
    }
}
