package Problem1;

public class BankSimulation {
        public static void main(String[] args) {


            BankAccount premiumUser = new BankAccount("Aditya", "Premium");
            BankAccount regularUser = new BankAccount("Rahul", "Regular");
            BankAccount basicUser = new BankAccount("Aman", "Basic");


            Thread t1 = new Thread(premiumUser);
            Thread t2 = new Thread(regularUser);
            Thread t3 = new Thread(basicUser);


            t1.setPriority(10);
            t2.setPriority(5);
            t3.setPriority(1);


            t1.start();
            t2.start();
            t3.start();
        }
    }
