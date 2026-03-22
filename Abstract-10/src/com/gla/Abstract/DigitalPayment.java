package com.gla.Abstract;
public class DigitalPayment {
    public static void main(String[] args) {

        Payment upi = new UPI();
        Payment card = new CreditCard();
        Payment wallet = new Wallet();

        upi.pay(500);
        card.pay(1200);
        wallet.pay(300);
    }
}
    interface Payment {
        void pay(double amount);
    }
    class UPI implements Payment {

        @Override
        public void pay(double amount) {
            System.out.println("Payment of ₹" + amount + " done using UPI.");
        }
    }
    class CreditCard implements Payment {

        @Override
        public void pay(double amount) {
            System.out.println("Payment of ₹" + amount + " done using Credit Card.");
        }
    }
    class Wallet implements Payment {

        @Override
        public void pay(double amount) {
            System.out.println("Payment of ₹" + amount + " done using Wallet.");
        }
    }

