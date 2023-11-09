import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        //atribuição => soma = 10;
        //dois valores numéricos - 4 operações
        int numero2;
        double numero1, soma, subtracao, multiplicacao, divisao;
        String operacao;
        //Entrada
        Scanner entrada = new Scanner(System.in);
        Scanner leitorTexto = new Scanner(System.in);
        System.out.println("Digite um número: ");
        numero1 = entrada.nextDouble();
        System.out.println("Digite o segundo número: ");
        numero2 = entrada.nextInt();
        System.out.println("Escolha a operação matemática desejada: " +
                "\n+  Adição" +
                "\n-  Subtração\n*  Multiplicação" +
                "\n/  Divisão" +
                "\nDigite a opção desejada");
        operacao = leitorTexto.next();
        //Operadores aritméticos + - * / %(resto da divisao)
        //Processamento
        switch (operacao){
            case "+" :
                soma = numero1 + numero2;
                System.out.println("Soma = " + soma);
                break;
            case "-":
                subtracao = numero1 - numero2;
                System.out.println("Subtração = " + subtracao);
                break;
            case "*":
            case ".":
            case "x":
                multiplicacao = numero1 * numero2;
                System.out.println("Multiplicação = " + multiplicacao);
                break;
            case "/":
                if(numero2 > 0){
                    divisao = numero1 / numero2;
                    System.out.println("Divisão = " + divisao);
                }else
                    System.out.println("Não é possivel dividir por zero.");
                break;
            default:
                System.out.println("Opção inválida");
        }

        String tipoUsuario;
        System.out.println ("Por favor , digite seu tipo de usuário");
        tipoUsuario = leitorTexto.next();
        if (!tipoUsuario.equalsIgnoreCase("administrador "))
             System.out.println("Atenção , usuário sem poderes administrativos");

    }
}
