package method;

public class MethodCasting1 {

    static void main() {
        double number = 1.5;
        //printnumber(number);
        printnumber((int) number);
    }

    public static void printnumber(int n) {
        System.out.println("숫자: " + n);
    }
}
