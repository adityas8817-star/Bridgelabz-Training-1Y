package MultiThread;

public class Runner {
    public static void main() {
        MyThread1 t1 = new MyThread1();
        Thread thread1 =new Thread(t1);
        thread1.start();
        MyThread2 t2 = new MyThread2();
        Thread thread2 =new Thread(t2);
        thread2.start();
        MyThread3 t3 = new MyThread3();
        Thread thread3 =new Thread(t3);
        thread3.start();
    }
}

