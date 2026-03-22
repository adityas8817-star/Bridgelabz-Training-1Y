package com.gla.Abstract;

public class MultiVehicle {
        public static void main(String[] args) {

            Vehicle car = new Car();
            Vehicle bike = new Bike();
            Vehicle bus = new Bus();

            car.rent();
            car.returnVehicle();

            bike.rent();
            bike.returnVehicle();

            bus.rent();
            bus.returnVehicle();
        }
    interface Vehicle {
        void rent();
        void returnVehicle();
    }
    class Car implements Vehicle {

        @Override
        public void rent() {
            System.out.println("Car has been rented.");
        }

        @Override
        public void returnVehicle() {
            System.out.println("Car has been returned.");
        }
    }
    class Bike implements Vehicle {

        @Override
        public void rent() {
            System.out.println("Bike has been rented.");
        }

        @Override
        public void returnVehicle() {
            System.out.println("Bike has been returned.");
        }
    }
    class Bus implements Vehicle {

        @Override
        public void rent() {
            System.out.println("Bus has been rented.");
        }

        @Override
        public void returnVehicle() {
            System.out.println("Bus has been returned.");
        }
    }
}

