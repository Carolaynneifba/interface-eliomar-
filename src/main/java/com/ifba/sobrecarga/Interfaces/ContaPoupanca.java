package com.ifba.sobrecarga.Interfaces;

public class ContaPoupanca implements ContaInterface {
    String numero;
    double saldo;
    double juros;
    @Override
    public void sacar(double valor) {
        System.out.println("Sacando da poupança...");
        this.saldo = this.saldo - valor;
    }
    @Override
    public void depositar(double valor) {
        System.out.println("Depositando na pupança...");
        this.saldo = this.saldo - valor;
    }
    @Override
    public double ConsultarSaldo() {
        return this.juros;
    }

   
}
