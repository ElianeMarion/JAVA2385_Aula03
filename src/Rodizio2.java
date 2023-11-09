import java.util.Scanner;

public class Rodizio2 {
    public static void main(String[] args) {
        /*Ler os números referente a placa de um carro xxx-9999
         * exibir usando o switch o dia do rodizio de veículos.
         * 1 e 2 - segunda-feira
         * 3 e 4 - terça
         * 5 e 6 - quarta
         * 7 e 8 - quinta
         * 9 e 0 - sexta */

        Scanner leitor = new Scanner(System.in);
        int placa, finalPlaca;

        System.out.println("Digite os números da placa do seu automóvel:");
        placa = leitor.nextInt();
        finalPlaca = placa % 10;
        switch (finalPlaca){
            case 1, 2 -> System.out.println("Rodizio de segunda-feira");
            case 3, 4 -> System.out.println("Rodizio de terça-feira");
            case 5, 6 -> System.out.println("Rodizio de quarta-feira");
            case 7, 8 -> System.out.println("Rodizio de quinta-feira");
            case 9, 0 -> System.out.println("Rodizio de sexta-feira");
            default -> System.out.println("Final de semana não existe rodizio de veículos");
        }
    }
}
