public class Main
{
    public static void main(String[] args) {

        //Zadanie nr 1

        System.out.println( );
        System.out.println("////////////");
        System.out.println( );
        System.out.println("Zadanie nr 1");
        System.out.println( );
        Pies Pies = new Pies();
        Pies.rokUrodzenia();
        Pies.wielkosc();
        Pies.rasa();
        System.out.println( );
        System.out.println( );
        System.out.println("////////////");

        //Zadanie nr 2
        System.out.println( );
        System.out.println("Zadanie nr 2");
        System.out.println( );
        Samochod Samochod = new Samochod();
        Samochod.skrecWLewo();
        System.out.println( );
        Samochod.skrecWPrawo();
        System.out.println( );
        System.out.println( );
        System.out.println("////////////");

        //Zadanie nr 3
        System.out.println( );
        System.out.println("Zadanie nr 3");
        System.out.println( );
        Komputer Komputer = new Komputer();
        System.out.println("Komputer");
        Komputer.kartasieciowa();
        Komputer.dyskSSD();
        Komputer.RokZlozenia();
        Komputer.SzklanaObudowa();
        System.out.println( );
        System.out.println( );
        System.out.println("////////////");

        //Zadanie nr 4
        System.out.println( );
        System.out.println("Zadanie nr 4");
        System.out.println( );
        Pies.badzMilutki();
        Pies.bawSie();
        System.out.println( );
        System.out.println("////////////");

        //Zadanie nr 5
        System.out.println( );
        System.out.println("Zadanie nr 5");
        System.out.println( );
        Kwadrat Kwadrat = new Kwadrat(6);
        System.out.print("Pole kwadratu z bokiem o długości równym 6 wynosi: ");
        System.out.print(Kwadrat.obliczPole());
        System.out.println( );
        System.out.print("Obwód kwadratu z bokiem o długości równym 6 wynosi: ");
        System.out.println(Kwadrat.obliczObwod());
        System.out.println( );
        System.out.println("////////////");
    }
}