public class Petle_Zadanie4 {

    public static void main (String[] args){
        int i = 0, j = 0;
        for (i = 0; i < 9; i++ )
        {
            for (j = 0; j < 9; j++){
                if ((i+1)*(j+1) % 3 == 0 && (i+1)*(j+1) % 2 == 0)
                {
                    System.out.print((i+1)*(j+1) + "\t");
                }
                else {
                    System.out.print("X" + "\t");
                }

            }
            System.out.println( );
        }
    }
}