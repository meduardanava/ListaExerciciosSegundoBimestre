package com.mycompany.exercicio2;

public class Vendedor extends Empregado{
    
    public Vendedor(String _nome, float _salario){
        super(_nome, _salario);
    }
    private float percentualComissao = (float) 0.10;

    public float getPercentualComissao() {
        return percentualComissao;
    }

    public void setPercentualComissao(float percentualComissao) {
        this.percentualComissao = percentualComissao;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }


    public float calcularSalario(){
        
        float comissao = salario * percentualComissao;//Como não tem a venda eu coloquei o percentual com base no salário
        float salarioTotal = salario + comissao;
        
        return salarioTotal;    
    }

    @Override
    public String toString() {
        return "Vendedor\n" + "Nome \t\t" + this.getNome() + "\nSalario \t" + this.getSalario()
                + "\nComissao \t" + percentualComissao + "\nSalário Final\t" + calcularSalario();
    }
    
}
