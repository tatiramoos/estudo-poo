package com.tatiramos.model;

import com.tatiramos.utils.DataUtil;

import java.util.Date;

public class ContaPoupanca extends ContaBancaria{
    public ContaPoupanca(String agencia, String conta, Integer digito, Double saldoInicial) {
        super(agencia, conta, digito, saldoInicial);
    }
}
