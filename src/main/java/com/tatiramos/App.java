package com.tatiramos;

import com.tatiramos.model.ContaBancaria;

public class App {
    public static void main(String[] args) {
        System.out.println("Criando nosso Banco Digital");
        System.out.println();

        ContaBancaria conta = new ContaBancaria("0001", "7542", 5, 100.0);
        System.out.println("Saldo atual de R$" + conta.getSaldo());
        System.out.println();

        conta.depositar(250.0);
        System.out.println("Saldo atual de R$" + conta.getSaldo());
        System.out.println();

        var saque = conta.sacar(150.0);
        System.out.println("Saldo atual de R$" + conta.getSaldo());
        System.out.println();

        ContaBancaria conta2 = new ContaBancaria("0001", "7543", 6, 200.0);

        conta2.tranferir(100.0, conta);
        System.out.println("Saldo conta destino de R$" + conta2.getSaldo());
        System.out.println();

        System.out.println("Saldo atual de R$" + conta.getSaldo());
        System.out.println();
    }
}
