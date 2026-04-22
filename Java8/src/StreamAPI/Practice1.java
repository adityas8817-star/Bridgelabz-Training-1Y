package StreamAPI;

import java.util.List;

public class Practice1 {
    static void main(String[] args) {
        List<Integer> list=List.of(1,2,3,5,3,3,66,33,225,541,75);
        System.out.println("This is our List :- " +list);
        list.stream().sorted().toList().forEach(System.out::println);
        System.out.println("This is our Sorted List :- "+list);
        System.out.println("Remove Duplicate Element From The List:-" );
        list.stream().sorted().distinct().toList().forEach(System.out::println);
        System.out.println("Even Numbers of the List :- ");
        list.stream().sorted().filter( X->X%2==0).toList().forEach(System.out::println);
        System.out.println("ODD Numbers of the List :- ");
        list.stream().sorted().filter( X->X%2!=0).toList().forEach(System.out::println);
        System.out.println("This is the Squ. Of EVEN Numbers");
        list.stream().sorted().filter(X->X*X%2==0).map(X->X*X).toList().forEach(System.out::println);
    }
}
