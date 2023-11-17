package com.tatiramos;


public class Carro {

    private String modelo;
    private Integer ano;
    private String cor;

    // Contrutor padrão
    public Carro(){}

    // Construtor personalizado
    public Carro(String modelo, Integer ano, String cor) {
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

}
