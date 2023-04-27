package com.mycompany.exercicio3;

import java.util.Scanner;

public class ContaEspecial extends ContaBancaria{
    
    public ContaEspecial(String _cliente, int _numConta, float _saldo){
        super(_cliente, _numConta,_saldo);
    }
    public float limite;

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }
    
    public float sacarNegativo(){
        
        float valorSaque;
        float resto;
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Informe quando deseja sacar: ");
        valorSaque = ler.nextFloat();
        
        if(valorSaque <= this.limite){
            resto = saldo - valorSaque;
            return resto;
        }else{
            return this.getSaldo();
        }
    }
}
