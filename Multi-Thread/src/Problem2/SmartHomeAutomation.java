package Problem2;

public class SmartHomeAutomation {
        public static void main(String[] args) {


            TemperatureSensor temp = new TemperatureSensor();
            SecurityCamera security = new SecurityCamera();
            LightController light = new LightController();
            DoorLockMonitor door = new DoorLockMonitor();


            Thread t1 = new Thread(temp);
            Thread t2 = security; // already Thread
            Thread t3 = new Thread(light);
            Thread t4 = new Thread(door);


            t2.setPriority(10);
            t1.setPriority(7);
            t3.setPriority(5);
            t4.setPriority(5);


            t1.start();
            t2.start();
            t3.start();
            t4.start();


            try {
                t1.join();
                t2.join();
                t3.join();
                t4.join();
            } catch (InterruptedException e) {
                System.out.println(e);
            }

            System.out.println("\nAll devices completed execution. Smart Home shutting down.");
        }
    }
