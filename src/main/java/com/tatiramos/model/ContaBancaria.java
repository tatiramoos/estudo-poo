package com.tatiramos.model;
import com.tatiramos.utils.DataUtil;

import java.util.ArrayList;
import java.util.Date;
import java.util.InputMismatchException;

/*
Uma classe abstrata é uma classe que não pode ser instanciada diretamente.
Ela é usada para fornecer uma estrutura ou um modelo para outras classes.
 */

public abstract class ContaBancaria {

    private String agencia;
    private String conta;
    private Integer digito;
    protected Double saldo;
    private Date dataAbertura;
    protected ArrayList<Movimentacao> movimentacoes;

    private final Double VALOR_MINIMO_DEPOSITO = 10.0;

    public ContaBancaria(String agencia, String conta, Integer digito, Double saldoInicial) {
        this.agencia = agencia;
        this.conta = conta;
        this.digito = digito;
        this.saldo = saldoInicial;
        this.dataAbertura = new Date();

        // Instancio o array de movimentações.
        // Se não instanciar o array, vai dar uma exception de NullPointerException.
        this.movimentacoes = new ArrayList<Movimentacao>();

        // Crio uma movimentação para a abertura de conta.
        Movimentacao movimentacao = new Movimentacao("Abertura de conta", saldoInicial);

        // Adiciono a primeira movimentação no meu array de movimentações.
        movimentacoes.add(movimentacao);
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

    public Date getDataAbertura() {
        return dataAbertura;
    }

    // Métodos
    public void depositar(Double valor) {
        // Verifica se o valor de depósito é menor que o valor mínimo
        // se for... não pode acontecer o depósito
        if (valor < VALOR_MINIMO_DEPOSITO) {
            throw new InputMismatchException("O valor mínimo de depósito é R$" + VALOR_MINIMO_DEPOSITO);
        }
        //efetua o deposito somando o valor ao saldo
        saldo += valor;

        // aqui faco uma movimentacao no extrato
        Movimentacao movimentacao = new Movimentacao("Deposito", valor);
        movimentacoes.add(movimentacao);
    }

    public Double sacar(Double valor) {
        // verifica se o valor é maior que o saldo da conta
        // se for manda mensagem de saldo insuficiente
        if (valor > saldo){
            throw new InputMismatchException("O saldo é insuficiente");
        }
        saldo -= valor;

        // aqui faco uma movimentacao no extrato
        Movimentacao movimentacao = new Movimentacao("Saque", valor);
        movimentacoes.add(movimentacao);

        return valor;
    }

    public void tranferir(Double valor, ContaBancaria contaDestino){
        // Efetua um saque na conta atual
        this.sacar(valor);

        // Efetua o depósito na conta de destino
        contaDestino.depositar(valor);
    }

    public void imprimirExtrato(){

        System.out.println("*********************************");
        System.out.println("******* Extrato Bancário ********");
        System.out.println("*********************************");
        System.out.println();

        System.out.println("Gerado em: " + DataUtil.converterDateparaData(new Date()));
        System.out.println();

        for(Movimentacao movimentacao : this.movimentacoes){
            System.out.println(movimentacao);
        }
        System.out.println();
        System.out.println("Saldo de R$" + this.saldo);

        System.out.println();
        System.out.println("*********************************");
        System.out.println("*********************************");
        System.out.println("*********************************");
        System.out.println();
    }
}
