package Java8;

public class Main {
    static void main(String[] args) {
        Demo d1=new Demo() {
            @Override
            public void info() {
                System.out.println("This is my First Anonymous Class");
            }
        };

        d1.info();

        Demo d2 = new Demo() {
            @Override
            public void info() {
                System.out.println("This is my Second Anonymous Class");
            }
        };

        d2.info();
    }
}
