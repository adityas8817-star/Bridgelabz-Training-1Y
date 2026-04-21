package Queue;

import java.util.PriorityQueue;

public class QueueDemo {
    static void main() {
        PriorityQueue<String> p1 = new PriorityQueue<>();
        p1.add("KL");
        p1.add("KOHLI");
        p1.add("IYER");
        p1.add("HITMAN");
        p1.add("MSD");
        System.out.println(p1);
        String s1= p1.element();
        System.out.println("It will give the head :- " + s1);
        p1.offer("RAINA");
        System.out.println("Added RAINA into Queue :- " + p1 );
        String s2= p1.peek();
        System.out.println("Returns the HOQ :- " + s2);
        p1.remove("IYER");
        System.out.println("Removed IYER from the Queue :- " +p1);
        p1.poll();
        System.out.println("Removed the HOQ :- " +p1);

    }
}
