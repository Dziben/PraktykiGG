public class Main
{
    public static void main(String[] args)
    {
        // Zadanie nr 1
        System.out.println( );
        System.out.println("////////////");
        System.out.println( );
        System.out.println("Zadanie nr 1");
        System.out.println();
        Kwadrat Kwadrat = new Kwadrat(5);
        System.out.print( "Pole kwadratu: ");
        System.out.println(Kwadrat.policzPole());
        Prostokat prostokat = new Prostokat(3, 4);
        System.out.print("Pole prostokąta: ");
        System.out.print(prostokat.policzPole());
        System.out.println( );
        System.out.println( );
        System.out.println("////////////");

        //Zadanie nr 2
        System.out.println( );
        System.out.println("Zadanie nr 2");
        System.out.println( );
        Pies Pies = new Pies (3, 4,"Lolek", "Biała, puszysta", 15);
        Pies.dajGlos();
        System.out.println( );
        System.out.println("////////////");

        //Zadanie nr 3
        System.out.println( );
        System.out.println("ZADANIE nr 3");
        Spawacz Spawacz = new Spawacz(10000, "Pelny", true,true);
        System.out.println( );
        Spawacz.wykonujePrace();
        System.out.println( );
        System.out.println("////////////");

        //Zadanie nr 4
        System.out.println( );
        System.out.println("ZADANIE nr 4");
        System.out.println( );
        System.out.println("1. Odpowiedź: MethodTwo oraz MethodFour ");
        System.out.println( );
        System.out.println("2. Odpowiedź: MethodThree oraz MethodOne  ");
        System.out.println( );
        System.out.println("////////////");
    }
}