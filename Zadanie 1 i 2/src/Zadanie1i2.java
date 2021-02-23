public class Zadanie1i2 {
    public static void main(String[] args) {
        //Zadanie 1
        System.out.println("Zadanie 1:");
        char znak = 'A';
        for (int i = 0; i < 26; i++) {
            if (i % 2 == 0)
                System.out.print(znak + "\t");
            znak++;
        }
        System.out.println("");
        System.out.println("");
        System.out.println("Zadanie 2:");

        //Zadanie 2
        int a = 0, b = 1;
        int c;
        int x = 8;
        for (int i = 1; i < x; i++){
            c=a+b;
            System.out.println(c);
            a=b;
            b=c;
        }
    }
}
