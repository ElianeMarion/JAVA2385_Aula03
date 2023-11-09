import java.util.Scanner;

public class DiaSemana {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int diaSemana;

        System.out.println("Digite um número de 1 a 7:");
        diaSemana = leitor.nextInt();
        switch (diaSemana){
            case 1: System.out.println("Domingo");
                    System.out.println("teste");
                break;
            case 2: System.out.println("Segunda");
                    System.out.println("teste2");
                break;
            case 3: System.out.println("Terça");
                break;
            case 4: System.out.println("Quarta");
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }

        String texto = "asa";
        char letra = 'b';
        switch (texto){
            case "a":
                System.out.println("vogal");
                break;
            case "b":
                System.out.println("consoante");
                break;
            case "asa":
                System.out.println("texto");
                break;
        }
/*
        if(diaSemana == 1 ) {
            System.out.println("Domingo");
        }
        else if(diaSemana == 2) {
            System.out.println("Segunda");
        }else if(diaSemana == 3)
            System.out.println("Terça");
        else if(diaSemana == 4)
            System.out.println("Quarta");
        else if(diaSemana == 5)
            System.out.println("Quinta");
        else if(diaSemana == 6)
            System.out.println("Sexta");
        else if(diaSemana == 7)
            System.out.println("Sabado");
        else
            System.out.println("Dia inválido");
*/
    }
}
