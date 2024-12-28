import java.util.*;
class Main{
	public static long power(long n,int p){
	if(p<=0)
	{
		return 1;
	}
	return n*power(n,p-1);
}
	public static void main(String[] args){
	System.out.print("Enter the base : ");
	long n;
	Scanner sc = new Scanner(System.in);
	n = sc.nextInt();
	System.out.print("Enter the power  : ");
	int p = sc.nextInt();
	long ans = power(n,p);
	System.out.println("The power of "+p+" to the base "+n+" is : "+ans);
	}
}
