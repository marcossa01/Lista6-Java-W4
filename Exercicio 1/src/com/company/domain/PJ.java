package com.company.domain;

public class PJ extends Funcionario{

    private Double valorHora;
    private int horasTrabalhadas;

    public PJ(String nome, Integer matricula, Double valorHora, int horasTrabalhadas) {
        super(nome, matricula);
        this.valorHora = valorHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public Double getValorHora() {
        return valorHora;
    }

    public void setValorHora(Double valorHora) {
        this.valorHora = valorHora;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    @Override
    public Double pagarSalario() {
        return horasTrabalhadas * valorHora;
    }
}
