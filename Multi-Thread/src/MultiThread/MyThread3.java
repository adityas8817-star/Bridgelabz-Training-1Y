package MultiThread;

public class MyThread3 implements Runnable{
    @Override
    public void run() {
        for(int i = 0;i<=10;i++){
            if(i%2==0){
                System.out.println(i);
                try {
                    Thread.sleep(2000);
                }catch (InterruptedException e){
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
