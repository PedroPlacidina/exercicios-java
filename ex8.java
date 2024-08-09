import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        //Escreva um programa em java que receba um número. O programa deve
        //encerrar quando o usúario informar -1. Caso contrário o programa deverá
        //pedir novamente um número.
        
        try(Scanner leitor = new Scanner(System.in)){
            System.out.println("Digite um número inteiro: ");
            int x = leitor.nextInt();
            while (x != -1) {
                System.out.print("Digite -1 para encerrar o programa ");
                System.out.print("ou digite um número inteiro: ");
                x = leitor.nextInt();
            }
        }
    }
}
