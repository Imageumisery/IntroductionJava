package LinearProgramms;

public class Third {
    public static void main(String[] args) {
        double x, y, answer;

        answer = (Math.sin(x = 0.6) + Math.cos(y = 0.4))/
                (Math.cos(x = 0.6)-Math.sin(y = 0.4))
                * Math.tan(x*y);
        System.out.println(answer);
    }
}
