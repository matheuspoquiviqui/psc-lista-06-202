import java.util.Scanner;

public class Ati04 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escreva 10 letras para saber qual é vogal e qual é consoante: ");
        char[] letras = new char[10];
        char[] vogais = new char[10];
        char[] consoantes = new char[10];

        int totalConsoantes = 0;
        int nVogais = 0;
        int nConsoantes = 0;

        for (int i = 0; i < letras.length; i++) {
            System.out.print("Escreva a " + (i + 1) + "ª letra: ");
            letras[i] = scanner.next().charAt(0);

            char letraAtual = Character.toLowerCase(letras[i]);
            if (letraAtual == 'a' || letraAtual == 'e' || letraAtual == 'i' || letraAtual == 'o' || letraAtual == 'u') {
                vogais[nVogais] = letras[i];
                nVogais++;
            } else {
                consoantes[nConsoantes] = letras[i];
                nConsoantes++;
                totalConsoantes++;
            }
        }

        System.out.println("\nTodas as letras:");
        for (char letra : letras) {
            System.out.print(letra + " ");
        }
        System.out.println();

        System.out.println("Vogais:");
        for (int i = 0; i < nVogais; i++) {
            System.out.print(vogais[i] + " ");
        }
        System.out.println();

        System.out.println("Consoantes:");
        for (int i = 0; i < nConsoantes; i++) {
            System.out.print(consoantes[i] + " ");
        }
        System.out.println();

        System.out.println("Total de consoantes: " + totalConsoantes);

        scanner.close();
    }
}