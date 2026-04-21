package Java8.LambdaExpression;

import Java8.Demo;

public class Run {
   public static void main(String[] args) {
        Demo d1 = ()-> {
            System.out.println("This is My First Lambda Expression");
        };
        d1.info();
    }
}
