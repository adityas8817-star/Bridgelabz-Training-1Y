package com.gla.Abstract;

public class SmartDevice {
    interface SmartDevic {
        void turnOn();
        void turnOff();
    }
    class Light {

        interface SmartDevic {

            @Override
            public void turnOn() {
                System.out.println("Light is ON");
            }

            @Override
            public void turnOff() {
                System.out.println("Light is OFF");
            }
        }

        static non-sealed class AC implements SmartDevic {

            @Override
            public void turnOn() {
                System.out.println("AC is ON");
            }

            @Override
            public void turnOff() {
                System.out.println("AC is OFF");
            }
        }

        static non-sealed class TV implements SmartDevic {

            @Override
            public void turnOn() {
                System.out.println("TV is ON");
            }

            @Override
            public void turnOff() {
                System.out.println("TV is OFF");
            }
        }

        public class Main {
            public static void main(String[] args) {

                SmartDevice light = new SmartDevice();
                SmartDevice ac = new SmartDevice();
                SmartDevice tv = new SmartDevice();

                light.turnOn();
                light.turnOff();

                ac.turnOn();
                ac.turnOff();

                tv.turnOn();
                tv.turnOff();
            }
        }
    }
