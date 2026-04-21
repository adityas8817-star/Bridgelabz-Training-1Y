package Stacke;

import java.util.Stack;

public class DemoStack {
   public static void main(String[] args) {
       Stack<String> ss = new Stack<>();
       ss.push("RCB");
       ss.push("Virat");
       ss.push("ABD");
       ss.push("MSD");
       System.out.println("This is Stack :- " + ss);
       ss.pop();
       System.out.println(ss);
       String s2 = ss.peek();
       System.out.println(s2);
    }
}
