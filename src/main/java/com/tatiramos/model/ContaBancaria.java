package com.tatiramos.model;

import java.util.InputMismatchException;

public class ContaBancaria {

    private String agencia;
    private String conta;
    private Integer digito;
    private Double saldo;
    private final Double VALOR_MINIMO_DEPOSITO = 10.0;

    public ContaBancaria(String agencia, String conta, Integer digito, Double saldoInicial) {
        this.agencia = agencia;
        this.conta = conta;
        this.digito = digito;
        this.saldo = saldoInicial;
    }

    // Getter and Setters
    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public Integer getDigito() {
        return digito;
    }

    public void setDigito(Integer digito) {
        this.digito = digito;
    }

    public Double getSaldo() {
        return saldo;
    }

    // Métodos
    public void depositar(Double valor) {
        // Verifica se o valor de depósito é menor que o valor mínimo
        // se for... não pode acontecer o depósito
        if (valor < VALOR_MINIMO_DEPOSITO) {
            throw new InputMismatchException("O valor mínimo de depósito é R$" + VALOR_MINIMO_DEPOSITO);
        }
        saldo += valor;
    }

    public Double sacar(Double valor) {
        // verifica se o valor é maior que o saldo da conta
        // se for manda mensagem de saldo insuficiente
        if (valor > saldo){
            throw new InputMismatchException("O saldo é insuficiente");
        }
        saldo -= valor;
        return valor;
    }

    public void tranferir(Double valor, ContaBancaria contaDestino){
        // Efetua um saque na conta atual
        this.sacar(valor);

        // Efetua o depósito na conta de destino
        contaDestino.depositar(valor);
    }
}
