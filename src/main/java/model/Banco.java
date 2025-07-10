package model;

public class Banco {
    private String nome;
    private int ID;
    private double saldo;

    public Banco() {
        this("", 0, 0);
    }

    public Banco(String nome, int ID, double saldoInicial) {
        this.nome = nome;
        this.ID = ID;
        this.saldo = saldoInicial;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depoistar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Depósito de R$" + String.format("%.2f", valor) + " realizado com sucesso.");

        } else {
            System.out.println("Valor de depósito inválido. Deve ser maior que zero.");
        }

    }

    public boolean sacar(double valor) {
        double taxa = 5;
        double saqueComTaxa = valor + taxa;
        if (valor <= 0) {
            System.out.println("Valor de saque inválido. Deve ser maior que zero.");
            return false;
        }

        if (saqueComTaxa > this.saldo) {
            System.out.println("Saldo insuficiente para realizar o saque de R$" + String.format("%.2f", valor) +
                    " (incluindo taxa de R$" + String.format("%.2f", taxa) + ").");
            System.out.println("Seu saldo atual é de R$" + String.format("%.2f", this.saldo) + ".");
            return false;
        } else {
            this.saldo -= saqueComTaxa;
            System.out.println("Saque de R$" + String.format("%.2f", valor) +
                    " (com taxa de R$" + String.format("%.2f", taxa) + ") efetuado com sucesso.");
            return true;
        }
    }

    public String toString() {
        return "Conta: " + getID() +
                "\nNome: " + getNome() +
                "\nSaldo atual: R$" + String.format("%.2f", getSaldo());


    }
}