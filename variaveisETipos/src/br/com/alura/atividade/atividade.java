package br.com.alura.atividade;

public class atividade {
    public static void main(String[] args) {
        //atividade01 - Mostrar informações do murillo
        String nome = "Murillo";
        int idade = 27;
        double altura = 1.71;
        boolean estudaente = true;

        //atividade02 - converter numeros decimais
        double produto = 19.5;

        //atividade03 - calcular medias
        double nota1 = 7.5;
        double nota2 = 8.0;
        double nota3 = 9.0;

        //atividade04 - conversao de temperatura
        int celsius = 20;
        double fahrenheit = (celsius * 9 / 5)+32;

        //atividade05 - cadatro de variavel + if,else
        String titulo = "O Pequeno Principe";
        String autor = "Antoine de Sanit-Exupéry";
        int numeroDePaginas = 96;
        double preco = 39.90;
        char categoria = 'F';
        //String criada para armazenar
        String categoriaDescricao;

        //atividade06 - errado
        double valor = 150.0;
        String categoriaProduto;

        //atividade07
        int numero = 7;
        String num;

        //criando o char atividade 05:
        if (categoria == 'F') {
            categoriaDescricao = "Ficção";
        } else  if (categoria == 'N') {
            categoriaDescricao = "Não_ficção";
        } else if (categoria == 'T') {
            categoriaDescricao = "Tecnologia";
        } else if (categoria == 'H') {
            categoriaDescricao = "Historia";
        } else {
            categoriaDescricao = "Categoria inválida";
        }

        //atividade06
        if (valor <= 50.00){
            categoriaProduto =  "Economico";
        } else if (valor > 50.00 && valor <= 200.00) {
            categoriaProduto =  "Intermediario";
        } else {
            categoriaProduto =  "Premium";
        }

        //atividade07
        if (numero % 2 == 0){
            num = "par.";
        } else {
            num = "impar.";
        }

        //atividade 08 - consumo medio/atual/conclusao
        double consumoMedio = 12.5;
        double capacidadeTanque = 50;
        double combustivelAtual = 20;
        double distanciaViagem = 200;
        String conclusaoViagem;
        //calcular as medias
        double autonomiaMaxima = consumoMedio * capacidadeTanque;
        double autonomiaAtual = consumoMedio * combustivelAtual;
        //if
        if (autonomiaAtual >= distanciaViagem) {
            conclusaoViagem = "Você conseguirá completar a viagem sem precisar abastecer.";
        } else {
            conclusaoViagem = "Atenção! Você precisará abastecer antes de concluir a viagem.";
        }

        //System.out.println: usado para mostrar - atividade01
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("Estudaente: " + estudaente);

        //convertendo valor decimais (double) para inteiro (int) - atividade02
        System.out.println("Valor inteiro do produto: " + (int) produto);

        //medias - atividade03
        System.out.println("Media das notas: " + (nota1 + nota2 + nota3)/3);

        //temperatura - atividade04
        System.out.println("Fahrenhei: " + fahrenheit);

        //sout do if - atividade05
        System.out.println("Livro cadastrado: " + titulo);
        System.out.println("De: " + autor);
        System.out.println("Ele possui: "  + numeroDePaginas + " páginas");
        System.out.println("Custa R$: " + preco);
        System.out.println("Percente á categoria: " + categoriaDescricao + ".");

        //atividade06
        System.out.println("categoria: " + categoriaProduto);

        //atividade 07
        System.out.println("O numero é: " + num);

        //atividade 08
        System.out.printf("Autonomia máxima do veículo: %.1f km%n", autonomiaMaxima);
        System.out.printf("Autonomia atual: %.1f km%n", autonomiaAtual);
        System.out.println(conclusaoViagem);

    }

}
