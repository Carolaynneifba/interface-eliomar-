package com.ifba.sobrecarga.Interfaces;

public class App {
    public static void main(String[] args) {
        ContaCorrente corrente = new ContaCorrente();
        corrente.depositar(100);
        System.out.println("Saldo Atual:"  + corrente.ConsultarSaldo());

        ContaInterface poupanca = new ContaPoupanca();
        poupanca.depositar(50);
        System.out.println("Saldo Atual:" + poupanca.ConsultarSaldo());
    }
}
