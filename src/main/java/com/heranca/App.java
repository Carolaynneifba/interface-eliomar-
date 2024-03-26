package com.heranca;

public class App {
    public static void main(String[] args) {
        Pessoa a = new Aluno(); //Exemplo de polimorfismo
        a.nomePrincipal = "Bob Esponja";
        a.sobrenome = "Calca quadrada";
       // a.matricula = "2024.1";
        a.cpf = "111.111.111-12";

        System.out.println(a);

        System.out.println("Instancia de Aluno: " + (a instanceof Aluno));
        System.out.println("Instancia de Professor: " + (a instanceof Professor));

        a = new Pessoa();
        a.nomePrincipal = "Eliomar";
        
        System.out.println("Nome Pessoa:" + a.nomePrincipal);
        System.out.println("Sobrenome:" + a.sobrenome);
        //System.out.println("Matricula:" + a.matricula);
        System.out.println("Cpf:" + a.cpf);
    }
}
