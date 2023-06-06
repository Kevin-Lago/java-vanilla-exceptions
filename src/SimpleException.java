public class SimpleException {
    public static void main(String[] args) {
        try {
            int anInteger = Integer.parseInt("string");
        } catch (NumberFormatException | NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }
}
