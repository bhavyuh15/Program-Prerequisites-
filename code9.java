import java.util.Scanner;
public class code9{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int no1=sc.nextInt();
		System.out.println("Enter a number");
		int no2=sc.nextInt();
		System.out.println("Enter a number");
		int no3=sc.nextInt();
		System.out.println("Enter a number");
		int average = (no1+no2+no3)/3;
		System.out.println(average);
	}
}