package com.gla.collection;

import java.util.ArrayList;
import java.util.List;

public class Practice1 {
    static void main() {
        List<String> list = new ArrayList<>();
        list.add("Banana");
        list.add("Apple");
        list.add("Papaya");
        list.add("Orange");
        list.add("Mango");
        System.out.println("list of fruits :- " + list);
        String index0= list.get(0);
        System.out.println("At index 0 :- "+ index0);
        list.set(0,"Kiwi");
        System.out.println("Updated List :-" + list);
        list.remove("Kiwi");
        System.out.println("Kiwi Removed :- " + list);
        boolean Kiwi= list.contains("Kiwi");
        System.out.println("Kiwi is Present or Not :- " + Kiwi);
        boolean isEmpty = list.isEmpty();
        System.out.println("List is Empty or Not :- " + isEmpty);
        int size = list.size();
        System.out.println("Size Of The List :- " + size);

        for (int i = size-1;i<0;i--){
            System.out.println(i);
        }
    }
}