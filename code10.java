import java.util.Scanner;
public class code10{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter kilometers");
		double kilometer =sc.nextInt();
		double miles = kilometer * (0.621371);
		System.out.println(miles);
	}
}