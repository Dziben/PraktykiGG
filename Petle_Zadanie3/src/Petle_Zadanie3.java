import java.util.Scanner;

public class Petle_Zadanie3d
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        boolean programIsRunning = true;

        while(programIsRunning)
        {
            System.out.print("Podaj numer drzwi: ");
            String userInput = sc.next();

            switch (userInput)
            {
                case "1": {
                    System.out.println("Niestety, wybrałeś złe  drzwi.");
                    break;
                }
                case "2": {
                    System.out.println("Niestety, wybrałeś złe  drzwi.");
                    break;
                }
                case "3": {
                    System.out.println("Niestety, wybrałeś złe  drzwi.");
                    break;
                }
                case "4": {
                    programIsRunning = false;
                    break;
                }
                case "5": {
                    System.out.println("Niestety, wybrałeś złe  drzwi.");
                    break;
                }
                default: {
                    System.out.println("Niestety, podałeś niepoprawne dane!");
                }
            }
        }

        System.out.println("Brawo skończyłeś lochy!");
    }
}