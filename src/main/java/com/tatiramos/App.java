package com.tatiramos;

public class App {

    public static void main(String[] args) {

        // Instanciando uma classe, construindo um objeto. A pessoa virou um objeto.
        Pessoa pessoa = new Pessoa();
        pessoa.nome = "Tatiane";
        pessoa.idade = 38;

        System.out.println(pessoa.nome);
        System.out.println(pessoa.idade);

        /*
        Com uma classe eu construo quantas pessoas eu quiser, ou seja,
        quantos objetos eu quiser.
        Um objeto é a instância (resultado) de uma classe.
         */
    }
}
