package com.mycompany.exercicio3;

import java.util.Scanner;

public class ContaPoupanca extends ContaBancaria{
    
    public ContaPoupanca(String _cliente, int _numConta, float _saldo){
        super( _cliente, _numConta, _saldo);
    }
    public int diaRendimento;

    public int getDiaRendimento() {
        return diaRendimento;
    }

    public void setDiaRendimento(int diaRendimento) {
        this.diaRendimento = diaRendimento;
    }

    public float calcularNovoSaldo(){
        
        float totalTaxa;
        float saldoAtualizado;
        
        Scanner ler = new Scanner(System.in);
        
        totalTaxa = (float) (this.diaRendimento * 0.25);      
        saldoAtualizado = totalTaxa * this.getSaldo();
        
        return saldoAtualizado;
    }
}
