import java.util.Scanner;
class Profit{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the cost price");
		int c = sc.nextInt();
		System.out.println("Enter the selling price");
		int s = sc.nextInt();
		int pro = s-c;
		double perpro = (pro/c) * 100;
		System.out.println("cost price : " +c);
		System.out.println("selling price : " +s);
		System.out.println("profit : " +pro);
		System.out.println("profit per : " +perpro);
	}
}
		