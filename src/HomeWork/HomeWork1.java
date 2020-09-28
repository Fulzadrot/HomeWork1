package HomeWork;

public class HomeWork1 {
    public static void main(String[] args) {
        byte a = 1;
        short b = 10;
        int c = 100;
        long d = 1000;
        float i = 10.10f;
        double f = 10.1010;
        char g = 'a';
        boolean h = true;
        String j = "переменная";
        System.out.println(expression(5, 6, 7, 8));
        System.out.println(chek((byte)5,(byte)5));
        positive(-5);
        negative(-1);
        HelloName("Alexsey");
        LeapYear(2000);
    }

    static int expression(int a, int b, int c, int d) {
        return a * (b + (c / d));
    }

    static boolean chek(byte a, byte b) {
        boolean d = false;
        byte c = (byte) (a + b);
        if (c <= 20) {
            d = true;
        }
        return d;
    }
    static void positive(int a){
        if (a >=0){
            System.out.println("Число " + a + " положительное");
        } else
            System.out.println("Число " + a + " отрицательное");
    }
    static int negative (int a){
        boolean b = true;
        if (a < 0){
            System.out.println(b);
        } else
            b = false;
        return a;
    }
    static void HelloName(String name){
        System.out.println("Привет, " + name);
    }
    static void LeapYear(int a){
        int b = 0;
        if (b == a % 4){
            System.out.println("Год " + a + " высокосный");
        } else if (b == a % 100){
            System.out.println("Год " + a + " высокосный");
        } else if (b == a % 400){
            System.out.println("Год " + a + " высокосный");
        } else
            System.out.println("Год " + a + " не высокосный");
    }
}