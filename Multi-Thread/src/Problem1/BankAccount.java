package Problem1;

public class BankAccount implements Runnable {
        private String accountHolderName;
        private String accountType;

        public BankAccount(String name, String type) {
            this.accountHolderName = name;
            this.accountType = type;
        }

        @Override
        public void run() {
            for (int i = 1; i <= 3; i++) {
                System.out.println("User: " + accountHolderName + " | Type: " + accountType + " | Priority: " + Thread.currentThread().getPriority() + " | Checking Balance (" + i + ")");

                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }
        }
    }

