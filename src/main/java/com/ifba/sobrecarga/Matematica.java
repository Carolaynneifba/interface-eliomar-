package com.ifba.sobrecarga;

public class Matematica {
    public static  void somar(double n1, double n2){
        System.out.println("Resultado:" + (n1+n2));
    }
    public static  void somar(double n1, double n2, double n3){
        System.out.println("Resultado:" + (n1+n2+n3));
}
public static  void somar(double n1, double n2, String texto){
    System.out.println("Resultado:" + (n1+n2));
    System.out.println("Texto");
}
}
