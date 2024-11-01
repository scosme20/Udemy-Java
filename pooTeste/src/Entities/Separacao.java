package Entities;

public class Separacao {
    private double precoRoupas;
    private int quantidade;
    private String tipo;

    public Separacao(double precoRoupas, int quantidade, String tipo) {
        this.precoRoupas = precoRoupas;
        this.quantidade = quantidade;
        this.tipo = tipo;
    }


    public double getPrecoRoupas() {
        return precoRoupas;
    }

    public void setPrecoRoupas(double precoRoupas) {
        this.precoRoupas = precoRoupas;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void comprouRoupas(int quantidade) {
        this.quantidade += quantidade;
    }

    public void doouRoupas(int quantidade) {
        if (this.quantidade >= quantidade) {
            this.quantidade -= quantidade;
        } else {
            System.out.println("Quantidade insuficiente para doação!");
        }
    }

    public void classificarRoupa() {
        switch (tipo.toLowerCase()) {
            case "c":
                System.out.println("Comprou camisa");
                break;
            case "j":
                System.out.println("Comprou jeans");
                break;
            case "b":
                System.out.println("Comprou bermuda");
                break;
            default:
                System.out.println("Tipo de roupa desconhecido");
                break;
        }
    }

    public void verificarPrecoRoupa() {
        if (precoRoupas > 100.0) {
            System.out.println("Roupa cara");
        } else {
            System.out.println("Roupa barata");
        }
    }
}
