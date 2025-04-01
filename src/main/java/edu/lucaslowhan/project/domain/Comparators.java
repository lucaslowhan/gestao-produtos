package edu.lucaslowhan.project.domain;

import java.util.Comparator;

public class Comparators {
    public static class ComparadorPorNome implements Comparator<Produto>{
        @Override
        public int compare(Produto o1, Produto o2) {
            return o1.getNome().compareToIgnoreCase(o2.getNome());
        }
    }
    public static class ComparadorPorCategoria implements Comparator<Produto>{
        @Override
        public int compare(Produto o1, Produto o2) {
            return o1.getCategoria().compareToIgnoreCase(o2.getCategoria());
        }
    }
}
