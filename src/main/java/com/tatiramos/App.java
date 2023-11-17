package com.tatiramos;

/*
Com uma classe eu construo quantas "pessoas" eu quiser, ou seja, quantos objetos eu quiser.
Um objeto é a instância (resultado) de uma classe.
*/
public class App {

    public static void main(String[] args) {

        // Instanciando uma classe, construindo um objeto. A pessoa virou um objeto.
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Tatiane");
        pessoa.setIdade(38);

        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());

        Carro meuCarro = new Carro();
        meuCarro.setModelo("Honda Civic");
        meuCarro.setAno(2019);
        meuCarro.setCor("Prata");

        System.out.println(meuCarro.getModelo());
        System.out.println(meuCarro.getAno());
        System.out.println(meuCarro.getCor());

        Carro novoCarro = new Carro("Fiat Toro", 2020, "Branco");

        System.out.println(novoCarro.getModelo());
        System.out.println(novoCarro.getAno());
        System.out.println(novoCarro.getCor());
    }
}
