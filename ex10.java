import java.util.Scanner;
import java.util.Random;

public class ex10 {
    public static void main(String[] args) {
        //Escreva um programa em java que realize a busca de um número em um
        //vetor. O vetor deve ser preenchido com valores aleatórios. Caso o valor
        //existir no vetor, apresente a sua posição. Caso contrário, informe que o
        //valor não existe no vetor.
        
        try(Scanner leitor = new Scanner(System.in)){
            System.out.print("Digite um número:");
            int n = leitor.nextInt();
            boolean existe = false;

            int vetor [] = new int [10];
            Random ale = new Random();
            
            for (int i = 0; i < vetor.length; i++){
                vetor[i] = ale.nextInt(10);
                if (vetor[i] == n) {
                    System.out.println("O valor digitado está na posição "+i+" do vetor");
                    existe = true;
                }
            }

            if (existe == false) {
                System.out.println("O valor não existe");
            }
        }
    }
}
