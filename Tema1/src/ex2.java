import java.util.Scanner;
//Scrieți un program pentru a găsi suma tuturor numerelor naturale între 1 și n (n sa fie introdus de la tastatura)
public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Scrie N : ");
        int i, num = 10, sum = 0;
        for(i = 1; i <= num; ++i)
        {
            sum = sum + i;
        }
        String n = sc.nextLine();
        System.out.println("Suma numerelor naturale: "+ sum);


    }
}
