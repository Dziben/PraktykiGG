import java.util.Scanner;

public class Tablice1
{
    public static void main(String[] args)
    {

        System.out.println();
        Scanner scanner = new Scanner(System.in);
        String[] player = new String[4];

        System.out.println("Podaj Imię:");
        player[0] = scanner.next();
        System.out.println("Podaj Rasę:");
        player[1] = scanner.next();
        System.out.println("Podaj Klasę:");
        player[2] = scanner.next();
        System.out.println("Podaj Broń:");
        player[3] = scanner.next();
        System.out.println();
        System.out.println(player[0]);
        System.out.println(player[1]);
        System.out.println(player[2]);
        System.out.println(player[3]);
    }
}