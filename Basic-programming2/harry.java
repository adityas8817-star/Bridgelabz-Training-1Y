import java.util.Scanner;
class Harry
{
	public static void main(String args[])
	{
		Scanner year= new Scanner(System.in);
		System.out.println("Enter the birth year:");
		int a=year.nextInt();
		System.out.println("Enter current year:");
		int b=year.nextInt();
		int age = b-a;
		System.out.println("The age of the person is :" +age);
	}
}