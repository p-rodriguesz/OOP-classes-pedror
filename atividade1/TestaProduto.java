package org.example;


public class TestaProduto {
    public static void main(String[] args) {

        //CRIAR PRODUTOS
        Produto p1 = new Produto("Monitor Wide", 1600.0, 100);
        Produto p2 = new Produto("CPU", 2100.0, 200);
        Produto p3 = new Produto("RTX 4090", 15000.0, 50);


        //EXIBIR INFORMAÇÕES DOS PRODUTOS
        System.out.println("\n--- INFORMACOES DOS PRODUTOS ---\n");
        p1.exibirinfo();
        p2.exibirinfo();
        p3.exibirinfo();

        //TESTAR GETTERS PARA LER ATRIBUTOS INDIVIDUAIS DOS PRODUTOS
        System.out.println("\n--- TESTANDO GETTERS ---\n");
        System.out.println("Nome do produto 1: " + p1.getNome());
        System.out.println("Nome do produto 2: " + p2.getNome());
        System.out.println("Nome do produto 3: " + p3.getNome());
        System.out.println("Preço do produto 1: R$ " + p1.getPreco());
        System.out.println("Preço do produto 2: R$ " + p2.getPreco());
        System.out.println("Preço do produto 3: R$ " + p3.getPreco());
        System.out.println("Quantidade em estoque do produto 1: " + p1.getQuantidadeemestoque() + " unidades");
        System.out.println("Quantidade em estoque do produto 2: " + p2.getQuantidadeemestoque() + " unidades");
        System.out.println("Quantidade em estoque do produto 3: " + p3.getQuantidadeemestoque() + " unidades");

        //TESTAR SETTERS PARA ATUALIZAR ATRIBUTOS DOS PRODUTOS
        System.out.println("\n--- TESTANDO SETTERS ---\n");
        p1.setNome("Monitor UltraWide");
        p1.setPreco(1200.0);
        p1.setQuantidadeemestoque(80);
        p2.setNome("CPU");
        p2.setPreco(2200.0);
        p2.setQuantidadeemestoque(160);
        p3.setNome("RTX 4090");
        p3.setPreco(14000.0);
        p3.setQuantidadeemestoque(40);

        //ADICIONAR QUANTIDADE ESPECÍFICA DE ESTOQUE PARA CADA PRODUTO
        System.out.println("\n---Adicionando estoque ---\n");
        p1.adicionarEstoque(20);
        p2.adicionarEstoque(30);
        p3.adicionarEstoque(10);

        //REMOVER QUANTIDADE ESPECÍFICA DE ESTOQUE PARA CADA PRODUTO
        System.out.println("\n---Removendo estoque ---\n");
        p1.removerEstoque(45);
        p2.removerEstoque(20);
        p3.removerEstoque(10);

        //EXIBIR INFORMAÇÕES ATUALIZADAS DOS PRODUTOS
        System.out.println("\n--- EXIBINDO INFORMACOES FINAIS ---\n");
        p1.exibirinfo();
        p2.exibirinfo();
        p3.exibirinfo();


        //TESTAR SETTERS COM VALORES INVÁLIDOS
        System.out.println("\n--- TESTANDO SETTERS COM VALORES INVÁLIDOS ---\n");
        p1.setPreco(-500.0); // Preço negativo
        p2.setQuantidadeemestoque(-10); // Quantidade em estoque negativa

    }

        }