package edu.lucaslowhan.project.main;

import edu.lucaslowhan.project.domain.GestorProdutos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GestorProdutos gestorProdutos = new GestorProdutos();
        Scanner scanner =  new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n--- Sistema de gestão de produtos---");
            System.out.println("1- Adicionar produto");
            System.out.println("2- Listar produtos");
            System.out.println("3- Buscar produto");
            System.out.println("4- Ordenar por nome");
            System.out.println("5- Ordenar por categoria");
            System.out.println("6- Exibir pedidos prioritarios");
            System.out.println("0- Sair");
            System.out.println("Escolha uma opção");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao){
                case 1 :
                    System.out.println("Nome:");
                    String nome = scanner.nextLine();
                    System.out.println("Preço:");
                    Double preco = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println("Categoria:");
                    String categoria = scanner.nextLine();
                    gestorProdutos.adicionarProduto(nome,preco,categoria);
                    break;

                case 2 :
                    gestorProdutos.listarProdutos();
                    break;

                case 3 :
                    System.out.println("Qual produto deseja buscar?");
                    String produto = scanner.nextLine();
                    gestorProdutos.buscarProduto(produto);
                    break;

                case 4 :
                    gestorProdutos.ordenarPorNome();
                    break;

                case 5 :
                    gestorProdutos.ordenarPorCategoria();
                    break;

                case 6 :
                    gestorProdutos.exibirFilaDePedidos();
                    break;

            }
        }while (opcao!=0);
            scanner.close();
            System.out.println("Programa encerrado");

    }
}
