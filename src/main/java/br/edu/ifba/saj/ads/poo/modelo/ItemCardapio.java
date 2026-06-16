package br.edu.ifba.saj.ads.poo.modelo;

public class ItemCardapio {

    private String nome;
    private String descricao;
    private double preco;

    public ItemCardapio(String nome, String descricao, double preco) {
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return nome + " " + descricao + " - R$ " + preco;
    }
}