package MultiThread;

public class MyThread1 implements Runnable{
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Aditya");
            try {
                Thread.sleep(20000);
            }catch (InterruptedException e){
                throw new RuntimeException(e);
            }
        }
    }
}
