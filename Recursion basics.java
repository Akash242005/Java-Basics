import java.util.*;
class Main{
	public static void displayA(int n){
	if(n<=0)
	{
		return;
	}
	System.out.println(n);
	displayB(n-1);
	}
	public static void displayB(int n){
		if(n<=0)
		{
			return;
		}
		System.out.println(n);
		displayC(n-1);
		}
	public static void displayC(int n){
		if(n<=0)
		{
			return;
		}
		System.out.println(n);
		displayA(n-2);
	}
	public static void main(String[] args){
	int n;
	Scanner sc = new Scanner(System.in);
	n = sc.nextInt();
	displayA(n);
	}
}
