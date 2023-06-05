import java.util.Scanner;
//Scrieți un program pentru a afla valoarea unui număr ridicat la puterea altuia
public class ex3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int baza;
        int expo;
        int rezultat = 1;
        System.out.println("Scrie baza: ");
        baza = scan.nextInt();
        System.out.println("Scrie exponent: ");
        expo = scan.nextInt();
        for (int i = 1; i <= expo; i++) {
            rezultat = rezultat * baza;
        }
        System.out.println("Rezultat: " + rezultat);
        }
}



