import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        //Escreva um programa em java que calcule a média final em um bimestre.
        //O usuário deve informar quantas atividades teve no bimestre. Em seguida,
        //o programa deve solicitar as notas de cada atividade e calcular a média
        //aritmética. Apresente o resultado em tela.
        
        try(Scanner leitor = new Scanner(System.in)){
            System.out.print("Digite a quantidade de atividades do bimestre: ");
            int n = leitor.nextInt();
            double soma = 0;

            for (int i = 1; i <= n; i++){
                System.out.print("Digite a nota "+i+": ");
                soma += leitor.nextDouble();

            }
            System.out.printf("Nota Final: %.2f",soma/n);
            
        }
    }
}
