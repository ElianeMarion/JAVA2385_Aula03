public class TesteVogal {

    public static void main(String[] args) {
        char letra = '1';
        switch (letra){
            case 'a','e','i','o','u' -> System.out.println("vogal");
            case '0', '1','2' -> System.out.println("numero");
            default -> System.out.println("consoante");
        }
    }
}
