package com.mycompany.exercicio1;

public class IngressoVip extends Ingresso{
    
    public IngressoVip(float _valor){
        super(_valor);
    }
    private float valorAdicional = 40;

    @Override
    public String toString() {
        return "IngressoVip{" + "valorAdicional = " + valorAdicional + '}';
    }


}
