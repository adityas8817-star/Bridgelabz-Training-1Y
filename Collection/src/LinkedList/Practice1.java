package LinkedList;

import java.util.LinkedList;
import java.util.List;

public class Practice1 {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(40);
        ll.add(50);
        ll.add(60);
        ll.add(70);
        ll.add(80);
        ll.add(90);
        System.out.println("Linked List :- " + ll);
        ll.addFirst(1);
        System.out.println("After Adding at First :-" + ll);
        ll.addLast(1000);
        System.out.println("After Adding at Last :- " + ll);
        ll.removeFirst();
        System.out.println("After Removing First :- " +ll);
        ll.removeLast();
        System.out.println("After Removing Last :- " +ll);
        System.out.println("Reversed :- " + ll.reversed());
    }
}
