import java.util.Scanner;
public class Ativ03 {
    public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    double media, soma = 0;
        System.out.println("Escreva 04 notas para saber sua média: ");

        double[] notas = new double[4];

        for (int i = 0; i < notas.length; i++) {
            
            System.out.print("Escreva a " + (i + 1) + "° nota: ");
            notas [i] = scanner.nextDouble();
            soma += notas[i];
        }

         media = soma / notas.length;

        System.out.println("\n Suas notas: \n");
        for (int i = 0; i < notas.length; i++) {
            System.out.println( (i + 1) + "° Nota: " + notas[i]);     
        }
        System.out.println("\nSua média foi: " + media);
    }
 }

