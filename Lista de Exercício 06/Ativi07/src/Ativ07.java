import java.util.Scanner;
public class Ativ07 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
            int soma = 0, mult = 1;

            System.out.println("Escreva 05 números inteiros, para realizar soma e multiplicação dos respectivos números: ");
            int [] numeros = new int[5];
            
            for (int i = 0; i < numeros.length; i++) {
                System.out.print("Escreva o " + (i + 1) + "° número: ");
                numeros[i] = scanner.nextInt();
                soma += numeros[i];
                mult *= numeros[i];
            }
        
        
        System.out.print("\nSoma: " );
            for (int i = 0; i < numeros.length; i++) {
                System.out.print(numeros[i]);
                    if (i < numeros.length - 1 ) {
                        System.out.print("+");                      
                    }else{
                        System.out.print(" = " + soma);
                    }                
            }        
        System.out.print("\nMultiplicação: ");   
            for (int i = 0; i < numeros.length; i++) {
                System.out.print(numeros[i]);
                    if (i < numeros.length - 1) {
                        System.out.print("x");                        
                    }else{
                        System.out.println(" = " + mult);
                    }
            }
        System.out.print("Números inseridos: ");
            for (int i = 0; i < numeros.length; i++) {
                System.out.print(numeros[i]);
                    if (i < numeros.length - 1) {
                        System.out.print(",");
            }else{
                System.out.print(".");
            }
    }
    scanner.close();
}
}