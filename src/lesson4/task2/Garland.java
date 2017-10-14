package lesson4.task2;

public class Garland {

    public static void main(String[] args) {
        int a = 10000001;
        System.out.println("a = " + Integer.toBinaryString(a));
        tilda(a);
        and(a);
        less(a);
    }

    public static void tilda(int s) {
        int f = ~s;
        System.out.println("~ a = " + Integer.toBinaryString(f));

    }

    public static void less(int c) {
        int d = c << 3;
        for (int i = 0; i < 10; i++) {
            System.out.println("a << 3 = " + Integer.toBinaryString(d++));
        }
    }

    public static void and(int n) {
        int t = n & 1;
        if (t == 1) {
            System.out.println("a & 1 = " + Integer.toBinaryString(t) + " - лампочка включена");
        }
        if (t == 0) {
            System.out.println("a & 1 = " + Integer.toBinaryString(t) + " - лампочка выключена");
        }
    }
}