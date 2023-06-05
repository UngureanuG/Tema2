import java.util.Scanner;
// Scrieți un program pentru a face media aritmetică a N numere n (n sa fie introdus de la tastatura)
public class ex6 {
    public static void main(String[] args) {
        Scanner scm = new Scanner(System.in);
        int numere;
        System.out.println("Scrie numerele: ");
        numere = scm.nextInt();
        int num2;
        int suma = 0;
        float media = 0;
        for (int i = 0; i < numere; i++) {
            num2 = scm.nextInt();
            suma = suma + num2;
        }
        media = suma / numere;
        System.out.println("Suma numarelor: " + suma);
        System.out.println("Media numerelor : "+ media);
         }
    }
