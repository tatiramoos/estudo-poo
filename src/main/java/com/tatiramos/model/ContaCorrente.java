package com.tatiramos.model;

import com.tatiramos.interfaces.IInvestimento;
import com.tatiramos.utils.DataUtil;

import java.util.Date;

/*
A herança é um mecanismo da Orientação a Objetos que permite criar classes a partir de classes
já existentes, aproveitando-se das características e comportamentos dessas classes.

Em Java, a herança é implementada usando a palavra-chave extends. A classe que herda os atributos e métodos
de outra classe é chamada de subclasse ou classe derivada, e a classe de onde herda é chamada de classe
base ou superclasse.

Por exemplo, a classe Animal pode ser uma classe base para as classes Cachorro, Gato e Galinha.
A classe Cachorro, por sua vez, pode ser uma subclasse da classe Animal.

Neste exemplo, a classe Animal define os atributos e métodos comuns a todos os animais, como o nome,
a idade e a cor. As classes Cachorro, Gato e Galinha herdam esses atributos e métodos, mas podem
adicionar novos atributos e métodos específicos de cada animal.

A herança oferece uma série de benefícios, incluindo:

Reutilização de código: A herança permite reutilizar o código já escrito em classes existentes, o que
reduz o tempo de desenvolvimento e o custo de manutenção. Modelagem do mundo real: A herança pode ser
usada para modelar a hierarquia de classes do mundo real. Por exemplo, a classe Animal pode representar
a hierarquia de classes de todos os animais, incluindo mamíferos, aves e répteis.
Flexibilidade: A herança permite que as subclasses estendam ou modifiquem o comportamento da classe base,
o que aumenta a flexibilidade do sistema.
 */
public class ContaCorrente extends ContaBancaria implements IInvestimento {
    public ContaCorrente(String agencia, String conta, Integer digito, Double saldoInicial) {
        // por baixo ele cria uma conta bancaria
        super(agencia, conta, digito, saldoInicial);
    }

    @Override
    public void guardar(Double valor) {
        System.out.println("Guardando a 110% do CDI");
    }
    @Override
    public Double resgatar(Double valor) {
        return null;
    }
}
