package ExFix;

public class Banco {
    private int number;
    private String name;
    private double saldo;

    public Banco(double saldo){
        this.saldo = saldo;
    }

    public Banco(int number, String name, double saldo){
        this.number = number;
        this.name = name;
        this.saldo = saldo;
    }

    public Banco(int number, String name){
        this.number = number;
        this.name = name;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    public double getSaldo(){
        return saldo;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public int getNumber(){
        return this.number;
    }

    public double deposito(double deposit){
        return this.saldo += deposit;
    }
    public double saque(double s){
        return this.saldo -= s + 5;
    }
}
