import java.io.*;

public class FinallyStatement {
    public static void main(String[] args) {
        System.out.println(divideInt(4, 2));
        System.out.println(divideInt(2, 0));

        System.out.println(openTxtFile("./text.txt"));
    }

    public static int divideInt(int a, int b) {
        try {
            return a / b;
        } catch (ArithmeticException e) {
            return Integer.MAX_VALUE;
        } finally {
            return 0;
        }
    }

    public static String openTxtFile(String filepath) {
        BufferedReader br = null;

        try {
            File file = new File(filepath);
            br = new BufferedReader(new FileReader(file));

            return br.readLine();
        } catch (IOException e) {
            System.out.println(e.getMessage());

            return "";
        } finally {
            try {
                br.close();
            } catch (IOException | NullPointerException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
