package com.mycompany.exercicio3;

import java.util.Scanner;

public class ContaBancaria {
    
    public String cliente;
    public int numConta;
    public float saldo;

    public ContaBancaria(String cliente, int numConta, float saldo) {
        this.cliente = cliente;
        this.numConta = numConta;
        this.saldo = saldo;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public float sacar(){
        
        float valorSacar;
        float restante;
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Informe quando deseja sacar: ");
        valorSacar = ler.nextFloat();
        
        if(valorSacar <= this.getSaldo()){
            restante = saldo - valorSacar;
            return restante;
        }else{
            return this.getSaldo();
        }
    }

    public float depositar(){
        
        float valorDeposito;
        float total;
        
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe quando dejesa deposítar: ");
        valorDeposito = ler.nextFloat();
        
        total = valorDeposito + this.getSaldo();
        return total;
    }
}
