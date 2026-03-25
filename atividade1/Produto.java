package org.example;

public class Produto {
    private String nome;
    private double preco;
    private int quantidadeemestoque;


    //CONSTRUTOR

    public Produto(String nome, double preco, int quantidadeemestoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeemestoque = quantidadeemestoque;
    }
    //GETTERS

    public String getNome() {
        return nome;
    }
    public double getPreco() {
        return preco;
    }
    public int getQuantidadeemestoque(){
        return quantidadeemestoque;
    }

    //SETTERS

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco){
        if (preco<0){
            System.out.println("Preço não pode ser negativo.");
            return;
        }
        this.preco = preco;
    }

    public void setQuantidadeemestoque(int quantidadeemestoque){
        if (quantidadeemestoque<0){
            System.out.println("Quantidade em estoque não pode ser negativa.");
            return;
        }
        this.quantidadeemestoque = quantidadeemestoque;
    }

    //MÉTODOS

    public void exibirinfo() {
        System.out.println("Nome do produto: " + nome);
        System.out.printf("Preco: R$ %.2f%n", preco);
        System.out.println("Quantidade em estoque: " + quantidadeemestoque + " unidades");
    }

    public void adicionarEstoque(int quantidade) {
       if (quantidade <=0){
           System.out.println("Erro: A quantidade a ser adicionada deve ser maior que zero.");
           return;
       }
       quantidadeemestoque += quantidade;
       System.out.println("Estoque atualizado: " + quantidadeemestoque + " unidades");
    }

    public void removerEstoque(int quantidade) {
        if (quantidade <= 0) {
            System.out.println("Erro: A quantidade a ser removida deve ser maior que zero.");
            return;
        }
        if (quantidade > quantidadeemestoque) {
            System.out.println("Erro: Quantidade a remover excede o estoque disponível.");
            return;
        } else {
            quantidadeemestoque -= quantidade;
            System.out.println("Estoque atualizado: " + quantidadeemestoque + " unidades");
        }
    }

public String toString(){
    return String.format("Produto: %s, Preço: R$ %.2f, Quantidade em estoque: %d unidades", nome, preco, quantidadeemestoque);}

}



