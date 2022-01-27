package Nonass;
import java.util.Scanner;
public class ArithmeticCalculator {

	public static void main(String[] args) {
		int n1,n2,ch,cal;
		System.out.println("Enter the two numbers:");
		Scanner sc = new Scanner(System.in);
		n1=sc.nextInt();
		n2=sc.nextInt();
		System.out.println("Select operation:");
		ch=sc.nextInt();
		
		if(ch==1) 
		{
         cal=n1+n2;
         System.out.println("Addition=="+cal);
	    }
		else if(ch==2)
		{
			cal=n1-n2;
			System.out.println("Subtraction=="+cal);
		}
		else if(ch==3)
		{
			cal=n1*n2;
			System.out.println("Multiplication=="+cal);
		}
		else if(ch==4)
		{
		cal=n1/n2;
		System.out.println("Division=="+cal);
		}
		else if(ch==5)
		{
			cal=n1%n2;
			System.out.println("Modulas=="+cal);
		}
		else
		{
			System.out.println("invaild choice");
		}
	}
}
