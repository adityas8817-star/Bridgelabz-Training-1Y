package UncheckedException;

public class Airthmetic {
    public static void main(String[] args) {
        try {
            int a = 20 / 0;
            System.out.println(a);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}

