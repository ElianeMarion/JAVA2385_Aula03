import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        double valorCompra, valorTotal;
        String cupom, texto;
        System.out.println("SISTEMA DE DESCONTO");
        System.out.println("Por favor, digite o valor total da sua compra: R$ ");
        texto = leitor.nextLine();
        valorCompra = Double.parseDouble(texto);
        System.out.println("Por favor, digite seu cupom de desconto: ");
        cupom = leitor.nextLine();
        if(valorCompra >= 1000 || cupom.equalsIgnoreCase("DESCONTO20"))
            valorTotal = valorCompra * 0.8;
        else
            valorTotal = valorCompra;
        System.out.println("O valor total da sua compra é R$ " + valorTotal);

    }
}