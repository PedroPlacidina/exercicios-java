import java.util.Scanner;
public class ex3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("N1:");
        int x = leitor.nextInt();
        System.out.print("N2:");
        int y = leitor.nextInt();

        System.out.println(x / y);
        leitor.close();
    }
}
