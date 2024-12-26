import java.util.*;
class patterns{
	public static void square(int a){
		for(int i=0;i<a;i++)
		{
			for(int j=0;j<a;j++)
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}
	public static void triangle(int b){
		for(int i=1;i<=b;i++)
		{
			for(int j=b-i;j>=1;j--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			for(int j=i-1;j>=1;j--)
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}
	public static void inverted_triangle(int c){
		for(int i=c;i>=1;i--)
		{
			for(int j=c-i;j>=1;j--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			for(int j=i-1;j>=1;j--)
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}
	public static void reverse_triangle(int d){
		for(int i=d;i>=1;i--)
		{
			for(int j=i;j>=1;j--)
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.println("========Pattern Menu========");
			System.out.println("1.Square Pattern.");
			System.out.println("2.Triangle Pattern.");
			System.out.println("3.Inverted Triangle Pattern.");
			System.out.println("4.Reverse Triangle Pattern.");
			System.out.println("5.Exit");
			System.out.print("Enter the Choice : ");
			int choice = sc.nextInt();
			if(choice == 1)
			{
				System.out.print("Enter the number of side you need in square : ");
				int n = sc.nextInt();
				square(n);
			}
			else if(choice == 2)
			{
				System.out.print("Enter the height of the triangle :  ");
				int n = sc.nextInt();
				triangle(n);
			}
			else if(choice == 3)
			{
				System.out.print("Enter the height of the Inverted triangle :  ");
				int n = sc.nextInt();
				inverted_triangle(n);
			}
			else if(choice == 4)
			{
				System.out.print("Enter the height of the Reverse triangle :  ");
				int n = sc.nextInt();
				reverse_triangle(n);
			}
			else if(choice == 5)
			{
				break;
			}
			else
			{
				System.out.print("Entered wrong choice!!!!...Enter the Correct choice");
			}
		}
		System.out.print("The patterns are Succesfully Executed!!!");
	}
}
		
