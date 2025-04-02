package edu.lucaslowhan.project.domain;

import java.util.*;

public class GestorProdutos {
    private List<Produto> produtoList = new ArrayList<>();
    private Map<String, List<Produto>> produtosPorCategoria = new HashMap<>();
    private PriorityQueue<Produto> filaDePedidos = new PriorityQueue<>(Comparator.reverseOrder());

    public void adicionarProduto(String nome, Double preco, String categoria){
        Produto produto = new Produto(nome,preco,categoria);
        produtoList.add(produto);


        produtosPorCategoria.computeIfAbsent(categoria, k -> new ArrayList<>()).add(produto);

        filaDePedidos.offer(produto);

        System.out.println("Produto adicionado com sucesso");
    }

    public void listarProdutos(){
        if(produtoList.isEmpty()){
            System.out.println("Nenhum produto cadastrado");
            return;
        }
        produtoList.forEach(System.out::println);
    }

    public void buscarProduto(String nome){
        produtoList.stream()
                .filter(p -> p.getNome().equalsIgnoreCase(nome))
                .findFirst()
                .ifPresentOrElse(
                        System.out::println,
                        () -> System.out.println("Produto não encontrado")
                );
    }

    public void ordenarPorNome(){
        produtoList.sort(new Comparators.ComparadorPorNome());
    }

    public void ordenarPorCategoria(){
        produtoList.sort(new Comparators.ComparadorPorCategoria());
    }

    public void exibirFilaDePedidos(){
        System.out.println("Pedidos por prioridade de preços");
        while (!filaDePedidos.isEmpty()){
            System.out.println(filaDePedidos.poll());
        }
    }
}
