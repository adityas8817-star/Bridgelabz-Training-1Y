package UncheckedException;

public class InputMisMatch extends Throwable {
    public static void main(String[] args) {
        int a = 22 / 2;
        System.out.println(a);
    }
}