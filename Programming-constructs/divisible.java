import java.util.Scanner;
class DivisibilityCheck_5
{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Your num");
	int num = sc.nextInt();
	if(num % 5 == 0){
		System.out.println(num + " is Divisible by 5");
	}
	else{
		System.out.println(num + " is not Divisible by 5");
	}
}
}