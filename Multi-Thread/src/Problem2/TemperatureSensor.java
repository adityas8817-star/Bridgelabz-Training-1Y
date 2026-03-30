package Problem2;
import java.time.LocalTime;
public class TemperatureSensor implements Runnable {
        @Override
        public void run() {
            for (int i = 1; i <= 5; i++) {
                System.out.println(LocalTime.now() + " | Temperature Sensor reading... Cycle " + i +
                        " | Priority: " + Thread.currentThread().getPriority());
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }
        }
    }

    class SecurityCamera extends Thread {
        @Override
        public void run() {
            for (int i = 1; i <= 5; i++) {
                System.out.println(LocalTime.now() + " | Security Camera recording... Cycle " + i +
                        " | Priority: " + this.getPriority());
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }
        }
    }


    class LightController implements Runnable {
        @Override
        public void run() {
            for (int i = 1; i <= 5; i++) {
                System.out.println(LocalTime.now() + " | Light adjusting... Cycle " + i +
                        " | Priority: " + Thread.currentThread().getPriority());
                try {
                    Thread.sleep(4000);
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }
        }
    }


    class DoorLockMonitor implements Runnable {
        @Override
        public void run() {
            for (int i = 1; i <= 5; i++) {
                System.out.println(LocalTime.now() + " | Door lock checking... Cycle " + i +
                        " | Priority: " + Thread.currentThread().getPriority());
                try {
                    Thread.sleep(6000);
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }
        }
    }

    }
