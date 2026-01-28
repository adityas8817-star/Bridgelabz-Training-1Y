import java.util.Scanner;
class PositiveNegativeZero_Check{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Number:- ");
		int number = sc.nextInt();
		if(number > 0){
			System.out.println("The number is Positive");
		}
		else if(number < 0){
			System.out.println("The number is Negative");
		}
		else{
			System.out.println("The number is Zero");
		}
	}
}