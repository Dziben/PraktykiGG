class TablicePoprawa {
    public static void main(String[] args) {

        // ZADANIE 5

        double[] power = {23.45, -2.22, 45.90, 67.45, -56, 234.11,-34.8, 90.4, -77};

        double max = power[0];
        double min = power[0];

        int maxA = 0;
        int minA = 0;

        System.out.println();
        System.out.println("////////////");
        System.out.println();
        System.out.println("Przed zamianą: ");
        System.out.println();
        System.out.println("////////////");
        System.out.println();

        for(int i = 0; i < 9; i++)
        {
            if(max < power[i])
            {
                max = power[i];
                maxA = i;
            }
            if(min > power[i])
            {
                min = power[i];
                minA = i;
            }

            System.out.println("Element " + "[" + i + "]" + " = " + power[i]);
        }

        power[maxA] = min;
        power[minA] = max;

        System.out.println();
        System.out.println("////////////");
        System.out.println();
        System.out.println("Po zamianie liczb największej z najmniejszą miejscami: ");
        System.out.println();
        System.out.println("////////////");
        System.out.println();

        for( int j = 0; j < 9; j++)
        {
            System.out.println("Element " + "[" + j + "]" + " = " + power[j]);
        }

        //ZADANIE 6

        System.out.println();
        System.out.println("////////////");
        System.out.println();
        System.out.println("Po odwróceniu:");
        System.out.println();
        System.out.println("////////////");
        System.out.println();

        double numberA;
        double numberB;

        for (int i = 0; i < power.length/2;i++)
        {
            numberA = (double) power[i];
            numberB = (double) power[power.length - 1 - i];
            power[i] = numberB;
            power[power.length - 1 - i] = numberA;
        }
        for (int i = 0; i < power.length; i++)
        {
            System.out.println("Element " + "[" + i + "]" + " = " + power[i]);
        }
    }
}