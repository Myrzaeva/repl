package practice_repl_it;

public class CastingPractice {
    public static void main(String[] args) {
        //  int i = 10;
        //  byte b = (byte) i;
        int i = 100;// 100
        double d = 123;//100.00
        float f = 300;//100.0
        // i = f;// 100 = 300
        f = i;// 300.00 = 100
        d = f;// 123 = 300
        //  f =d;// 300.00 = 123
        d = i; // 123 = 100
        //   i = d;//100 =123
        System.out.println();
        System.out.println("1+2+3+4 " + 3 + 3 );


        long a = 3_000L;
        double b  = a;
        System.out.println(b);










    }
}
