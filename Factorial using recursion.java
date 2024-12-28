import java.util.*;
class Main{
	public static long factorial(int n){
	if(n<=0)
	{
		return 1;
	}
	return n*factorial(n-1);
}
	public static void main(String[] args){
	System.out.print("Enter the number to find the factorial : ");
	int n;
	Scanner sc = new Scanner(System.in);
	n = sc.nextInt();
	long ans = factorial(n);
	System.out.println("The factorial of "+n+" is "+ans);
	}
}
