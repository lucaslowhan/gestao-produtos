package edu.lucaslowhan.project.domain;

import java.util.Objects;

public class Produto implements Comparable<Produto> {
    private String nome;
    private Double preco;
    private String categoria;

    public Produto(String nome, Double preco, String categoria) {
        this.nome = nome;
        this.preco = preco;
        this.categoria = categoria;
    }

    public String getNome() {
        return nome;
    }

    public Double getPreco() {
        return preco;
    }

    public String getCategoria() {
        return categoria;
    }

    @Override
    public int compareTo(Produto o) {
        return Double.compare(this.getPreco(),o.getPreco());
    }

    @Override
    public String toString() {
        return "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", categoria='" + categoria + '\'';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return Objects.equals(nome, produto.nome) && Objects.equals(preco, produto.preco);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, preco);
    }
}
