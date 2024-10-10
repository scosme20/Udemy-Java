package Entities;

public class Register {
    private String name;
    private int  numBank;
    private double value;

    public Register(String name, int numBank, double initialDeposit) {
        this.name = name;
        this.numBank = numBank;
        deposit(initialDeposit);
    }

    public Register(String name, int numBank) {
        this.name = name;
        this.numBank = numBank;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumBank() {
        return numBank;
    }


    public double getValue() {
        return value;
    }


    public double deposit(double amount){
        return this.value += amount;
    }

    public double removeDeposit(double amount){
        return this.value -= amount + 5.0;
    }

    public String toString(){
        return "Conta "
                + numBank
                + ", nome: "
                + name
                + ", Valor: "
                + String.format("%.2f", value);
    }
}
