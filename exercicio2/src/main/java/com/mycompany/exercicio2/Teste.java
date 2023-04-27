package com.mycompany.exercicio2;

public class Teste {

    public static void main(String[] args) {
        
        Empregado a = new Empregado("Ana Cláudia", 100);
        Gerente b = new Gerente("Beatriz",200);
        Vendedor c = new Vendedor("Jéssica",300);
        
        System.out.println("===============================");
        System.out.println(a);
        System.out.println("===============================");
        System.out.println(b);
        System.out.println("===============================");
        System.out.println(c);
        System.out.println("===============================");
    }
}
