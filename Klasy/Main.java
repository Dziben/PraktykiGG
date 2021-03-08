import java.util.Scanner;
public class Main {
    public static void main(String[] args){

        // ZADANIE nr. 1
        System.out.println( );
        System.out.println("////////////");
        System.out.println( );
        System.out.println("Zadanie nr. 1");
        Trojkat trojkat = new Trojkat(5, 6, 8);
        System.out.print("Pole trójkąta z podstawą równą 2, z bokiem równym 6 i z wysokością równą 3 wynosi: ");
        trojkat.obliczaniePola();
        System.out.println(trojkat.getPole());
        System.out.println( );
        System.out.print("Obwód tego trójkąta wynosi: ");
        trojkat.obliczanieObwodu();
        System.out.print(trojkat.getObwod());
        System.out.println( );
        System.out.println( );
        System.out.println("////////////");

        // ZADANIE nr. 2

        System.out.println( );
        System.out.println("Zadanie nr. 2");
        System.out.println( );
        Prostokat Prostokat = new Prostokat(5, 6);
        System.out.print("Pole prostokata o boku A równym 5 i boku B równym 6 wynosi: ");
        Prostokat.obliczaniePola();
        System.out.print(Prostokat.getPoleprostokata());
        System.out.println( );
        System.out.println( );
        System.out.print("Przekątne prostokąta z bokami 5 i 6  wynoszą: ");
        Prostokat.ObliczaniePrzekatnej();
        System.out.println(Prostokat.ObliczaniePrzekatnej());
        System.out.println( );
        System.out.println("////////////");

        // ZADANIE nr. 3

        System.out.println( );
        System.out.println("Zadanie nr. 3");
        System.out.println( );

        if (Prostokat.getBokA()>trojkat.getBokA())
        {
            System.out.println("Bok A Prostokąta jest większy od boku Trójkąta.");
        }

        if(trojkat.getBokA()> Prostokat.getBokA())
        {
            System.out.println("Bok A Trójkąta jest większy od boku Prostokąta.");
        }
        System.out.println( );
        System.out.println("////////////");
        System.out.println( );

        // ZADANIE nr. 4

        System.out.println("Zadanie 4");
        System.out.println( );
        boolean dzialaProgram = true;
        Scanner scan = new Scanner(System.in);
        while (dzialaProgram) {
            Prostykalkulator kalkulator = new Prostykalkulator();
            System.out.println("Podaj odpowiednią cyfrę: 1 - dodawanie , 2 - odejmowanie, 3 - mnożenie, 4 - dzielenie, 5 - wyłącz");
            int choice = scan.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Wybrano: dodawanie. Podaj liczby: ");
                    double a = scan.nextDouble();
                    double b = scan.nextDouble();
                    System.out.println("Suma = " +kalkulator.dodawanie(a,b));
                    break;
                case 2:
                    System.out.println("Wybrano: odejmowanie. Podaj liczby: ");
                    double c = scan.nextDouble();
                    double d = scan.nextDouble();
                    System.out.println("Różnica = " +kalkulator.odejmowanie(c,d));
                    break;
                case 3:
                    System.out.println("Wybrano: mnożenie. Podaj liczby: ");
                    double e = scan.nextDouble();
                    double f = scan.nextDouble();
                    System.out.println("Iloczyn = " +kalkulator.mnozenie(e,f));
                    break;
                case 4:
                    System.out.println("Wybrano: dzielenie. Podaj liczby: ");
                    double g = scan.nextDouble();
                    double h = scan.nextDouble();
                    if(h > 0)
                    {
                        System.out.println("Iloraz = " + kalkulator.dzielenie(g, h));
                    } else {
                        System.out.println("Nie możesz dzielić przez 0!");
                    }
                    break;
                case 5:
                    System.out.println("Kalkulator wyłączony.");
                    dzialaProgram = false;
                    break;
            }
        }
        // ZADANIE nr. 4 v2
        System.out.println( );
        System.out.println("////////////");
        System.out.println( );
        System.out.println("Zadanie nr 4 v2");
        System.out.println( );
        Okrag Okrag = new Okrag(8, 4);
        System.out.println("Pole okręgu ze średnicą równą 8: " + Okrag.pole());
        System.out.println("Obwód okręgu ze średnicą równą 8 wynosi: " + Okrag.obwod());
        System.out.println( );
        System.out.println("////////////");
    }
}