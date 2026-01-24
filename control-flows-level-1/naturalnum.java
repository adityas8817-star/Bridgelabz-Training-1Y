import java.util.Scanner;
class Natural_Number{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Number:- ");
		int number = sc.nextInt();
		int sum = number * (number + 1) / 2;
		if(number > 0){
			System.out.println("The sum of " + number + " natural number is " + sum);
			}
		else{
			System.out.println("The number" + number + " is not a natural number");
		}
	}
}