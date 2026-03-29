package MultipleCatchBlock;

public class ArrayIndexOutOfBounds extends Throwable {
    public static void main (String[] args) {
        int[] num = {1, 2, 3, 4, 5};
        String s = null;
        System.out.println(s.length());
    }
}
