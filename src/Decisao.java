import java.util.Scanner;

public class Decisao {

    public static void main(String[] args) {
        /*Ler duas notas de um aluno, calcular a média e verificar se o aluno
        foi aprovado (media >=7), se ele foi reprovado (media < 4) e caso contrário
        o aluno está de exame. Solicitar a nota do exame e verificar se a nova media for
        >=5 aprovado em exame senão está reprovado
        * */
        Scanner leitor = new Scanner(System.in);
        double nota1, nota2, media, notaExame, novaMedia;
        System.out.println("Digite a primeira nota do aluno: ");
        nota1 = leitor.nextDouble();
        System.out.println("Digite a segunda nota do aluno: ");
        nota2 = leitor.nextDouble();
        media = (nota1 + nota2) / 2;
        if(media >= 7)
        {
            System.out.println("Aluno promovido com média " + media);
        }
        else if(media < 4)
        {
            System.out.println("Aluno reprovado com média " + media);
        }
        else{ //if(media >= 4 && media < 7)
            System.out.println("Aluno tem direito a fazer a prova de exame");
            System.out.println("Digite a nota do exame: ");
            notaExame = leitor.nextDouble();
            novaMedia = (notaExame + media)/2;
            if(novaMedia >= 5)
                System.out.println("Aluno promovido em exame com média " + novaMedia);
            else
                System.out.println("Aluno retido após exame com média " + novaMedia);
        }
    }
}
