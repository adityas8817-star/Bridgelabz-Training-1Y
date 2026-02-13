package com.gla.methods;

public class Practice {
    public static void main(String[] args) {
        String name1 = "Ram";
        String name2 = "Ram";

        System.out.println(name1 == name2);

        String name3 = new String("Ram");
        String name4 = new String("Ram");

        System.out.println(name3 == name4);

        System.out.println(name1.equals(name3));

        StringBuffer name5 = new StringBuffer("Shyam");
        name5.append("Sharma");
        System.out.println(name5);

        StringBuilder name6 = new StringBuilder("Ram");

        name1.concat("Sharma");
        System.out.println(name1);
    }
}
