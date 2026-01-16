import java.util.Scanner;
class Number{
public static void main(String args[])
{
	Scanner Num=new Scanner(System.in);
	System.out.println("Enter the Physics marks : ");
	int phy=Num.nextInt();
	System.out.println("Enter the Chemistry marks : ");
	int chem=Num.nextInt();
	System.out.println("Enter the Maths marks : ");
	int maths =Num.nextInt();
	int avg = (phy+chem+maths)/3;
	System.out.println("Enter the average marks : "+avg);
}}