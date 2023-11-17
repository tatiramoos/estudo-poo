package com.tatiramos;

/*
Classe = Molde, Modelo, Gabarito.
Atributos = Representam as características de um objeto.
Métodos = Representam os comportamentos de um objeto.
 */

public class Pessoa {
        private String nome;
        private Integer idade;


        // Getters
        public String getNome() {
                return nome;
        }

        public Integer getIdade() {
                return idade;
        }

        // Setters
        // Aqui nós podemos ter validações para garantir que coloquem a informação da maneira correta.
        public void setNome(String nome) {
                this.nome = nome;
        }

        public void setIdade(Integer idade) {
                this.idade = idade;
        }
}

/*
MÉTODOS ACESSORES:
- PUBLIC: Indica que qualquer um pode acesser o elemento(a classe, os atributos e o métodos).
- PRIVATE: Indica que somente a classe consegue acessar.
- PROTECTED: Indica que somente a classe e seus filhos conseguem acessar.
- DEFAULT: Indica que somente a classe, seus filhos e as classe no mesmo package conseguem acessar.

Como boa prática em Java todos os atributos devem ser private(só a própria classe consegue acessar).
 */