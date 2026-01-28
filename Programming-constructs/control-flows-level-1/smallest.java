import java.util.Scanner;
class SmallestNum{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Num:- ");
		int num1 = sc.nextInt();
		System.out.println("Enter Second Num:- ");
		int num2 = sc.nextInt();
		System.out.println("Enter Third Num:- ");
		int num3 = sc.nextInt();
		if(num2 > num3  && num1 > num3){
			System.out.println(num3 + "Is Smallest");
		}
		else if (num3 > num2  && num1 > num2){
			System.out.println(num2 + "Is Smallest");
		}
		else{
			System.out.println(num1 + "Is Smallest");
		}
	}
}