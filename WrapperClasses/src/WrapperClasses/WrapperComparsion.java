package WrapperClasses;

import java.util.*;
public class WrapperComparsion{
    public static void wrapperComparsion(){
        Integer a = 100;
        Integer b = 100;
        Integer c = 200;
        Integer d = 200;
        System.out.println("Comeparsion b/w A & B is:" + (a==b));
        System.out.println("Comeparsion b/w C & D is:" + (c==d));
    }

    static void main(String[] args) {
        wrapperComparsion();
    }
}