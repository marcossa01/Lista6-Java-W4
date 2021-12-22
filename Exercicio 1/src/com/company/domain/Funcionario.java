package com.company.domain;

public abstract class Funcionario {

    private String nome;
    private Integer matricula;

    public Funcionario(){

    }

    public Funcionario(String nome, Integer matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public abstract Double pagarSalario();

    @Override
    public String toString() {
        return "Funcionário: "
                + nome +
                ", Matrícula: "
                + matricula +
                ", Salário do mês: "
                + pagarSalario();
    }
}
