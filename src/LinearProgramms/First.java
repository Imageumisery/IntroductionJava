package LinearProgramms;

import java.util.Random;

public class First {


    public static void main(String[] args) {

        Random random = new Random();
        double a = random.nextInt(6);
        double b = random.nextInt(5);
        double c = random.nextInt(4);

        System.out.println(First.doMath(a,b,c));
        System.out.println((a - 3) * (b / 2) + c);
    }

    public static double doMath (double a, double b, double c) {
        return  Math.fma((a - 3),b/2,c);
    }
}
