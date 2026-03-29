package br.com.alura.aula;

public class aula {
    public static void main(String[] args) {
        String nome = "murillo";
        double salario = 2890.00;
        int numeroDependentes = 2;
        boolean isento = true;

        if (salario > 2259.20 && !isento) {
            double irrf = salario /100 *7.5;
            System.out.println("Valor irrf: " + irrf);
        }
        else if (isento) {
            System.out.println("Contribuente isento de irrf.");
        }
        else {
            System.out.println("não ha valores de irrf");
        }

    }
}
