package atividade;

import java.util.Scanner;

public class atividade {
    public static void main(String[] args) {
        //atividade 01
        int valor = 7;

        //atividade 02
        double media = 9;

        //atividade 03
        String senhaCorreta = "123456";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu senha: ");
        String tentativaSenha = scanner.nextLine();

        //atividade 04
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Digite seu primeiro numero: ");
        int primeiroNumero = scanner2.nextInt();
        System.out.println("Digite seu segundo numero: ");
        int segundoNumero = scanner2.nextInt();

        //Atividade 05
        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Digite o dia da semana (em letras minusculas): ");
        String dia = scanner3.nextLine();

        //atividade 01
        if (valor % 2 == 0) {
            System.out.println("O numero " + valor + " é par");
        } else {
            System.out.println("O numero " + valor + " é impar");
        }

        //atividade 02
        if (media >= 7.0) {
            System.out.println("O estudante teve a média " + media + " e foi aprovado");
        } else if (media <= 5.0) {
            System.out.println("O estudante teve a média " + media + " e esta reprovado");
        } else {
            System.out.println("estudante teve a média " + media + " e estra de recuperação");
        }

        //atividade 03
        if (tentativaSenha.equals(senhaCorreta)) {
            System.out.println("Acesso Aprovado!");
        } else {
            System.out.println("Acesso Negado!");
        }
        scanner.close();

        //atividade 04
        if (primeiroNumero > segundoNumero) {
            System.out.println("O maior numero é " + primeiroNumero + ".");
        } else if (segundoNumero > primeiroNumero) {
            System.out.println("O maior numero é " + segundoNumero + ".");
        } else {
            System.out.println("Os numeros são iguais");
        }
        scanner2.close();

        //atividade 05
        if (dia.equals("segunda") || dia.equals("terca") || dia.equals("quarta") || dia.equals("quinta") || dia.equals("sexta")) {
            System.out.println(dia + " é um dia util.");
        } else {
            System.out.println(dia + " não é um dia util");
        }
        scanner3.close();

    }

}
