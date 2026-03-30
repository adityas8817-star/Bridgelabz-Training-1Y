package Problem3;

public class Order implements Runnable {

        private int orderId;
        private String restaurantName;
        private int deliveryTime;

        public Order(int orderId, String restaurantName, int deliveryTime) {
            this.orderId = orderId;
            this.restaurantName = restaurantName;
            this.deliveryTime = deliveryTime;
        }

        @Override
        public void run() {
            String agent = Thread.currentThread().getName();
            long startTime = System.currentTimeMillis();

            System.out.println("Agent: " + agent +
                    " | Order ID: " + orderId +
                    " | Restaurant: " + restaurantName +
                    " | Status: Picked Up");

            try {
                Thread.sleep(deliveryTime * 500);

                System.out.println("Agent: " + agent +
                        " | Order ID: " + orderId +
                        " | Status: In Transit");

                Thread.sleep(deliveryTime * 500);

                long endTime = System.currentTimeMillis();

                System.out.println("Agent: " + agent +
                        " | Order ID: " + orderId +
                        " | Status: Delivered" +
                        " | Total Time: " + (endTime - startTime) / 1000 + " sec");

            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }


