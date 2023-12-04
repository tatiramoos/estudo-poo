package com.tatiramos;

import com.tatiramos.model.ContaCorrente;
import com.tatiramos.model.ContaPoupanca;
import com.tatiramos.utils.DataUtil;

public class App {
    public static void main(String[] args) {
        System.out.println("Criando nosso Banco Digital");
        System.out.println();

        ContaCorrente contaCorrente = new ContaCorrente("0001", "7542", 5, 100.0);
        System.out.println("Saldo atual de R$" + contaCorrente.getSaldo());
        System.out.println();

        contaCorrente.depositar(250.0);
        System.out.println("Saldo atual de R$" + contaCorrente.getSaldo());
        System.out.println();

        var saque = contaCorrente.sacar(150.0);
        System.out.println("Saldo atual de R$" + contaCorrente.getSaldo());
        System.out.println();

        ContaPoupanca contaPoupanca = new ContaPoupanca("0001", "7543", 6, 200.0);

        contaPoupanca.tranferir(100.0, contaCorrente);
        System.out.println("Saldo contaCorrente destino de R$" + contaPoupanca.getSaldo());
        System.out.println();

        System.out.println("Saldo atual de R$" + contaCorrente.getSaldo());
        System.out.println();

        System.out.println(contaPoupanca.getDataAbertura());

        var f1 = DataUtil.converterDateparaDataEHora(contaPoupanca.getDataAbertura());
        var f2 = DataUtil.converterDateparaData(contaPoupanca.getDataAbertura());
        var f3 = DataUtil.converterDateparaHora(contaPoupanca.getDataAbertura());

        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f3);
    }
}
