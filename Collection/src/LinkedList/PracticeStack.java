package LinkedList;

import java.util.LinkedList;

public class PracticeStack {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.push("Ram");
        ll.push("Shyam");
        ll.push("Geeta");
        ll.push("Sita");
        System.out.println("This is a LinkedList Stack :- " + ll);
        String s1= ll.peek();
        System.out.println(s1);
    }
}
