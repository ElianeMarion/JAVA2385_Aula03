import java.util.Scanner;

public class Senha {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        String senha, usuario;
        System.out.println("Sistema acadêmico");
        System.out.println("Por favor, digite seu usuário para acessar o FIAP-ON: ");
        usuario = leitor.nextLine();
        System.out.println("Por favor, digite sua senha: ");
        senha = leitor.nextLine();
        if(usuario.equals("admin") && senha.equals("admin123"))
                System.out.println("Bem vindo ao sistema FIAP-ON");
        else
            System.out.println("Usuário e/ou senha inválidos!");

    }

}
