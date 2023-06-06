public class CallStackException {
    public static void main(String[] args) {
        try {
            System.out.println(doMath(2, 0));
        } catch (ArithmeticException e) {
            System.out.println("Can not divide by zero");
        }
    }

    public static int doMath(int a, int b) {
        return divideNumbers(a, b);
    }

    public static int divideNumbers(int a, int b) throws ArithmeticException {
        return a / b;
    }
}
