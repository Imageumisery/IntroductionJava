package LinearProgramms;

import java.util.Random;

public class Second {
    public static void main(String[] args) {
     double a, b, c, part, answer;
        a = 2.5;
        b = 3.6;
        c = 1.2;


     part = (b + Math.sqrt(Math.pow(b,2) + 4 * a * c)* 2 * a);
     answer = part - Math.pow(a, 3) * c + Math.pow(b, -2);
        System.out.println(answer);
    }
}
