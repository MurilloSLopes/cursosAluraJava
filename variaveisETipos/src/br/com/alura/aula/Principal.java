package br.com.alura.aula;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        //tipos primitivos!
        int quantidadePassos = 500;
        //int: o tipo da variavel(exemplos double, boolean, float etc...)
        //quantidadePassos: nome da variavel
        // = : usado para atribuir (variavel tal (recebe =)
        //500: valor atribuido.
        double alturaEmMetros = 1.70;
        String nome = "murillo";

        if (quantidadePassos < 100 ) {
            String sugestao = "Tente aumentar a meta";
            System.out.println(sugestao);
        }
        //sugestao da erro pois a variavel foi criado dentro do bloco "if"
        //fazendo com que so possa ser usada dentro do bloco
        //diferente de quantidadePassos que foi criado no main
        //sugestao = "parabens, voce conseguiu";
        //obs: colocar em comentario (sugestao) para rodar outros codigos
    }
}
