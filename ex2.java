import java.util.Scanner;
public class ex2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int x = leitor.nextInt();

        if (x % 2 == 0){
            System.out.println("É PAR");
        }else{
            System.out.println("É IMPAR");
        }
    leitor.close();
    }
}
