import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        //Escreva um programa em java que receba um inteiro. Realize a soma do
        //número 1 até o valor informado pelo usúario. Apresente o resultado em
        //tela.
        
        try(Scanner leitor = new Scanner(System.in)){
            System.out.println("Digite um número inteiro: ");
            int x = leitor.nextInt();
            int total = 0;
            for(int i = 1; i <= x; i++){
                total += i;
            }
            System.out.println(total);
        }
    }
}
