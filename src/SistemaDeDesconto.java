import java.util.Scanner;

public class SistemaDeDesconto {
    public static void main(String[] args) {
        /*Solicitar para o usuário o valor da compra e um cupom de desconto
        * valor >= 1000  ou cupom = DESCONTO20 vamos aplicar desconto de 20%
        * exibir o valor final da compra*/

        Scanner leitor = new Scanner(System.in);
        Scanner leitorTexto = new Scanner(System.in);
        double valorCompra, valorTotal;
        String cupom;
        System.out.println("SISTEMA DE DESCONTO");
        System.out.println("Por favor, digite o valor total da sua compra: R$ ");
        valorCompra = leitor.nextDouble();
        System.out.println("Por favor, digite seu cupom de desconto: ");
        cupom = leitorTexto.nextLine();
        if(valorCompra >= 1000 || cupom.equalsIgnoreCase("DESCONTO20"))
            valorTotal = valorCompra * 0.8;
        else
            valorTotal = valorCompra;
        System.out.println("O valor total da sua compra é R$ " + valorTotal);



    }
}
