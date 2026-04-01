package WrapperClasses;

import java.util.*;
public class WrapperToPrimitive{
    public static void wrapperToPrimitiveConversion(){
        Scanner sc = new Scanner(System.in);
        Double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        int num3 = (int) num2;
        System.out.println("Double object: " + num1);
        System.out.println("double Primitive: " + num2);
        System.out.println("Integer primitive: " + num3);
    }

    static void main(String[] args) {
        wrapperToPrimitiveConversion();
    }
}
