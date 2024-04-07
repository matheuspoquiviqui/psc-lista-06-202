import java.util.Scanner;
public class Ativ05 {
public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
        int soma = 0;

        System.out.println("Escreva 20 números inteiros, para descobrir qual é considerado ímpar e qual é considera par:  ");
        int [] numeros = new int[20];
        int[] pares = new int[20]; 
        int[] impares = new int[20]; 
        int contadorPares = 0; 
        int contadorImpares = 0; 

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Escreva o " + (i + 1) + "° número: ");
            numeros[i] = scanner.nextInt();
            soma += numeros[i];
            if (numeros[i] % 2 == 0) {
                pares[contadorPares] = numeros[i];
                contadorPares++;
            } else {
                impares[contadorImpares] = numeros[i];
                contadorImpares++;
            }
        }

        System.out.println("Números digitados:");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
        System.out.println();

        System.out.println("Números pares:");
        for (int j = 0; j < contadorPares; j++) {
            System.out.print(pares[j] + " ");
        }
        System.out.println();

        System.out.println("Números ímpares:");
        for (int k = 0; k < contadorImpares; k++) {
            System.out.print(impares[k] + " ");
        }
        System.out.println();

        scanner.close();
    }
}
