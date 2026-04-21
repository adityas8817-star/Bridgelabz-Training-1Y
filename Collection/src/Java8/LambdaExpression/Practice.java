package Java8.LambdaExpression;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Practice {
    public static void main(String[] args){
        List<Integer> list = Arrays.asList(10,20,30,40,50,60);
        System.out.println("This is our List :- "+list);
        Collections.sort(list);
        Collections.shuffle(list);
        System.out.println("This is a suffled List :- "+list);
        System.out.println("This is the Max Element in List :- "+Collections.max(list));
        System.out.println("This is the Min Element in List :- "+Collections.min(list));
        Collections.reverseOrder();
        System.out.println("This is the Reversed List :- "+list);

    }
}
