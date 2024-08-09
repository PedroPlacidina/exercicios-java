import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro texto: ");
        String texto1 = scanner.nextLine();

        System.out.print("Digite o segundo texto: ");
        String texto2 = scanner.nextLine();

        if (texto1.equals(texto2)) {
            System.out.println("Os textos são iguais.");
        } else {
            System.out.println("Os textos são diferentes.");
        }

        scanner.close();
        
    }
}
