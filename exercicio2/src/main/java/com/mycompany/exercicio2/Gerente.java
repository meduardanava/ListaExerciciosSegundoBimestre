package com.mycompany.exercicio2;

public class Gerente extends Empregado{
    
    public Gerente(String _nome, float _salario){
        super(_nome, _salario);
    }
    private String departamento = "Recursos Humanos";

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Gerente\n" + "Nome \t\t" + this.getNome() + "\nSalario \t" + this.getSalario()+ 
                "\nDepartamento \t" + departamento;
    }
    
}
