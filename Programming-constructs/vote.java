import java.util.Scanner;
class Vote
{
public static void main(String arg[])
{
  System.out.println("Enter Voter's age");
  Scanner sc = new Scanner(System.in);
  int a = sc.nextInt();
  int b = sc.nextInt();
  int c = sc.nextInt();
  int d = sc.nextInt();
  {
if(a>=18)
{
	System.out.println("a can vote");
}
else { System.out.println("a can not Vote");
}
  }
  
 {
if(b>=18)
{
	System.out.println("b can vote");
}
else { System.out.println("b can not Vote");
}
  }
   {
if(c>=18)
{
	System.out.println("c can vote");
}
else { System.out.println("c can not Vote");
}
  }
   {
if(d>=18)
{
	System.out.println("d can vote");
}
else { System.out.println("d can not Vote");
}
  }
}
}