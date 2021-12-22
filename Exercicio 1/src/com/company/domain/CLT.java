package com.company.domain;

public class CLT extends Funcionario{

    private char funcao; //T - Técnicos / A - Analistas / G - Gerentes / D / Diretores
    private Double metaBatida;
    private Double lucroEmpresa;
    private Double salario;
    private Double bonificação;
    private Double participaçãoLucro;

    public CLT(String nome, Integer matricula, char funcao, Double metaBatida, Double lucroEmpresa) {
        super(nome, matricula);
        this.funcao = funcao;
        this.metaBatida = metaBatida;
        this.lucroEmpresa = lucroEmpresa;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Double getMetaBatida() {
        return metaBatida;
    }

    public void setMetaBatida(Double metaBatida) {
        this.metaBatida = metaBatida;
    }

    public Double getParticipaçãoLucro() {
        return participaçãoLucro;
    }

    public void setParticipaçãoLucro(Double participaçãoLucro) {
        this.participaçãoLucro = participaçãoLucro;
    }

    public Double getLucroEmpresa() {
        return lucroEmpresa;
    }

    public void setLucroEmpresa(Double lucroEmpresa) {
        this.lucroEmpresa = lucroEmpresa;
    }

    public char getFuncao() {
        return funcao;
    }

    public void setFuncao(char funcao) {
        this.funcao = funcao;
    }

    public Double getBonificação() {
        return bonificação;
    }

    public void setBonificação(Double bonificação) {
        this.bonificação = bonificação;
    }

    @Override
    public Double pagarSalario() {
        switch (funcao) {
            case 'T': {
                bonificação = 5.0;
                participaçãoLucro = 0.0;
                salario = ((metaBatida * bonificação) / 100) + 3200.00;
                break;
            }
            case 'A': {
                bonificação = 8.0;
                participaçãoLucro = 0.0;
                salario = ((metaBatida * bonificação) / 100) + 4000.00;
                break;
            }
            case 'G': {
                bonificação = 12.5;
                participaçãoLucro = 0.0;
                salario = ((metaBatida * bonificação) / 100) + 6000.00;
                break;
            }
            case 'D': {
                bonificação = 0.0;
                participaçãoLucro = 3.0;
                salario = ((lucroEmpresa * participaçãoLucro) / 100) + 15000.00;
                break;
            }
            default:
        }
        return salario;
    }
}
