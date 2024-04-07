import java.util.Scanner;

public class Ativ06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double[] medias = new double[10];
        int contador = 0; 
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite as notas do aluno " + (i+1) + ":");
            double soma = 0;
            for (int j = 0; j < 4; j++) {
                System.out.print("Nota " + (j+1) + ": ");
                double nota = scanner.nextDouble();
                soma += nota;
            }
            double media = soma / 4;
            medias[i] = media;
            if (media >= 7.0) {
                contador++;
            }
        }
        
        System.out.println("Número de alunos com média maior ou igual a 7.0: " + contador);

        scanner.close();
    }
}