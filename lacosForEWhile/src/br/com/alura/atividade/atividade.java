package br.com.alura.atividade;

import  java.util.Scanner;
import java.util.ArrayList;

public class atividade {
    public static void main(String[] args) {

        //atividade 01
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a quantidade de degraus: ");
        int degraus = scanner.nextInt();

        for (int i = 1; i <= degraus; i++) {
            System.out.println("Subindo o degrau " + i);
        }
        System.out.println("Voce chegou ao topo!");


        //atividade 02
        int[] valores = {10, 20, 30, 40, 50};
        int soma = 0;

        for (int valor : valores) {
            soma += valor;
        }
        System.out.println("A soma total das receitas é: " + soma);

        //atividade 03
        int calculo = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                calculo += i;
            }
        }
        System.out.println("O calculo dos números pares de 1 a 100 é: " + calculo);

        //atividade 03
        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = scanner2.nextInt();
        int fatorial = 1;
        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }
        System.out.println("O fatorial de " + numero + " é: " + fatorial);

        //atividade 04
        Scanner scanner3 = new Scanner(System.in);
        System.out.print("Digite os números separados por espaço: ");
        String[] numerosStr = scanner3.nextLine().split(" ");
        int maior = Integer.MIN_VALUE;

        for (String numStr : numerosStr) {
            int num = Integer.parseInt(numStr);
            if (num > maior) {
                maior = num;
            }
        }
        System.out.println("O maior número é: " + maior);

        //atividade 05
        Scanner scanner4 = new Scanner(System.in);
        final String SENHA_CORRETA = "1234";

        for (int tentativas = 3; tentativas > 0; tentativas--){
            System.out.println("Digite sua senha: ");
            String senha = scanner4.nextLine();

            if(senha.equals(SENHA_CORRETA)){
                System.out.println("Senha correta! Acesso permitido!");
                break;
            } else if (tentativas > 1){
                System.out.println("Senha incorreta. Voce tem " + (tentativas - 1) +" tentativas restantes.");
            } else {
                System.out.println("conta bloqueada temporariamente.");
            }
        }

        //atividade 05
        Scanner scanner5 = new Scanner(System.in);
        String nome;
        do {
            System.out.print("Digite seu nome: ");
            nome = scanner5.nextLine();
            if (nome.length() < 3) {
                System.out.println("Nome invalido. Digite novamente.");
            }
        } while (nome.length() < 3);
        System.out.println("nome \"" + nome + "\" Cadastrado com sucesso");

        //atividade 06
        Scanner scanner6 = new Scanner(System.in);

        ArrayList<String> convidados = new ArrayList<>();

        while (true) {
            System.out.print("Digite o nome do convidado (ou 'ver' para visualizar a lista, 'sair' para terminar): ");
            String persona = scanner6.nextLine().trim();

            if (persona.equalsIgnoreCase("sair")) {
                System.out.println("Programa finalizado.");
                break;
            }

            if (persona.equalsIgnoreCase("ver")) {
                System.out.println("Lista atualizada de convidados: " + convidados);
                continue;
            }

            boolean jaExiste = false;
            for (String convidado : convidados) {
                if (convidado.toLowerCase().equals(persona.toLowerCase())) {
                    jaExiste = true;
                    break;
                }
            }

            if (jaExiste) {
                System.out.println("O nome " + persona + " já está na lista de convidados.");
            } else {
                convidados.add(persona);
                System.out.println(persona + " foi adicionado à lista de convidados.");
            }

        }

    }

}


