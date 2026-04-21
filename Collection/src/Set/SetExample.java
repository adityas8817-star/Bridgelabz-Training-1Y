package Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {
   public static void main(String[] args) {
       Set<Integer> s1 = new HashSet<>();
       s1.add(10);
       s1.add(20);
       s1.add(30);
       s1.add(10);
       System.out.println(s1);

       LinkedHashSet<Integer> s2 = new LinkedHashSet<>();
       s2.add(100);
       s2.add(200);
       s2.add(300);
       s2.add(200);
       System.out.println(s2);

       TreeSet<Integer> s3 = new TreeSet<>();
       s3.add(1000);
       s3.add(2000);
       s3.add(6000);
       s3.add(4000);
       s3.add(3000);
       s3.add(5000);
       s3.add(1000);
       System.out.println(s3);
    }
}
