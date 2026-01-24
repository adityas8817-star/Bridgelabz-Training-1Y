import java.util.Scanner;
class AssignmentOperator
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of a:");
		int a = sc.nextInt();
		System.out.println("Enter the value of b:");
		int b = sc.nextInt();
		a+=b;
		System.out.println("+=:" +a);
		a-=b;
		System.out.println("-=:" +a);
		a/=b;
		System.out.println("/=:" +a);
		a%=b;
		System.out.println("%=:" +a);
		
	}
}