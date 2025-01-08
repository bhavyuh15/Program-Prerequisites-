import java.util.Scanner;
public class code6{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int Principal = sc.nextInt();
		int Rate = sc.nextInt();
		int Time = sc.nextInt();
		
		int simpleIntrest = (Principal*Rate*Time)/100;
		System.out.println(simpleIntrest);
	}
}