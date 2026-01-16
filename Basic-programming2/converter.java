import java.util.Scanner;
class Number{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the kilometer : ");
	int Km=sc.nextInt();
	double miles = (Km*1.6);
	System.out.println("Enter the miles	: " +miles);
	}
}