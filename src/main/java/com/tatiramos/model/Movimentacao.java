package com.tatiramos.model;

import com.tatiramos.utils.DataUtil;

import java.util.Date;

public class Movimentacao {

    private String descricao;
    private Date data;
    private Double valor;

    public Movimentacao(String descricao, Double valor) {
        this.descricao = descricao;
        this.data = new Date();
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getData() {
        return data;
    }

    public Double getValor() {
        return valor;
    }

    @Override  // Descricao - Data e Hora - Valor
    public String toString(){
        String dataFormatada = DataUtil.converterDateparaDataEHora(getData());
        return getDescricao() + "\n" +  dataFormatada + " - R$" + getValor();
    }

}
