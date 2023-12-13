package com.tatiramos.interfaces;

/*
Interfaces: Contratos podem ser implementados nas classes para gerar comportamentos específicos.
É um contrato que dita algumas regras do que tem que acontecer.
No nosso caso, a classe investimento tem duas funções ou dois comportamentos. Nós podemos
guardar o dinheiro para que ele seja investido ou resgatar o dinheiro que guardamos para investir.
 */
public interface IInvestimento {

    void guardar(Double valor);

    Double resgatar(Double valor);
}
