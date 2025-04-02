# Sistema de Gestão de Produtos

## ✨ Visão Geral
O **Sistema de Gestão de Produtos** é uma aplicação em Java para gerenciar uma lista de produtos, permitindo **adicionar, listar, buscar, ordenar e remover** produtos. O projeto utiliza conceitos de **Collections Framework, Streams API, Comparator, Comparable, PriorityQueue e Map**.

## 🌐 Tecnologias Utilizadas
- **Java 8+**
- **Collections Framework** (List, Map, PriorityQueue)
- **Comparator e Comparable**
- **Streams API**
- **Console (Scanner para entrada do usuário)**

## ⚡ Funcionalidades
- ✅ **Adicionar Produtos** (com nome, preço e categoria).
- ✅ **Listar Produtos** cadastrados.
- ✅ **Ordenar Produtos** por nome ou categoria.
- ✅ **Buscar um Produto** pelo nome.
- ✅ **Remover Produtos** da lista.
- ✅ **Gerenciar Pedidos Prioritários** (fila ordenada por preço).
- ✅ **Organizar Produtos por Categoria** usando `Map<String, List<Produto>>`.

## 📝 Estrutura do Projeto
```
📂 src/
 ├── 📄 Produto.java               # Classe do Produto (Comparable)
 ├── 📄 Comparators.java          # Comparators personalizados
 ├── 📄 GestorProdutos.java        # Classe principal para gestão de produtos
 ├── 📄 Main.java                  # Interface do usuário via Console
```

## ⛓ Como Executar
1. **Clone o repositório**:
   ```sh
   git clone https://github.com/lucaslowhan/gestao-produtos.git
   ```
2. **Acesse o diretório do projeto**:
   ```sh
   cd sistema-gestao-produtos
   ```
3. **Compile o projeto**:
   ```sh
   javac -d bin src/*.java
   ```
4. **Execute o programa**:
   ```sh
   java -cp bin Main
   ```

## 🎮 Exemplo de Uso
```sh
=== Sistema de Gestão de Produtos ===
1. Adicionar Produto
2. Listar Produtos
3. Buscar Produto
4. Ordenar por Nome
5. Ordenar por Categoria
6. Exibir Pedidos Prioritários
0. Sair
Escolha uma opção: 1
Nome: Notebook
Preço: 3500
Categoria: Eletrônicos
Produto adicionado com sucesso!
```

## 🔧 Principais Classes
### **Produto.java**
```java
public class Produto implements Comparable<Produto> {
    private String nome;
    private Double preco;
    private String categoria;
    
    @Override
    public int compareTo(Produto outro) {
        return Double.compare(this.preco, outro.preco);
    }
}
```

### **Comparators.java**
```java
public class Comparators {
    public static class ComparadorPorNome implements Comparator<Produto> {
        @Override
        public int compare(Produto p1, Produto p2) {
            return p1.getNome().compareToIgnoreCase(p2.getNome());
        }
    }
}
```

### **GestorProdutos.java**
```java
public class GestorProdutos {
    private List<Produto> produtoList = new ArrayList<>();
    
    public void adicionarProduto(String nome, double preco, String categoria) {
        produtos.add(new Produto(nome, preco, categoria));
    }
}
```

### **Main.java**
```java
public class Main {
    public static void main(String[] args) {
        GestorProdutos gestor = new GestorProdutos();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("1. Adicionar Produto");
        int opcao = scanner.nextInt();
        if (opcao == 1) {
            gestor.adicionarProduto("Notebook", 3500.00, "Eletrônicos");
        }
    }
}
```

## 🎨 Melhorias Futuras
- [ ] Criar interface gráfica (JavaFX ou Swing)
- [ ] Armazenar dados em um banco de dados
- [ ] Implementar autenticação de usuários

## 👨‍💻 Autor
Desenvolvido por **Lucas Lowhan**

---
Feito com ❤ e Java! ☕

