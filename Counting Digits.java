import java.util.*;
public class Main{
	public static int digits(long n,int count){
	if(n<=0)
	{
		return count;
	}
	count++;
	return digits(n/10,count);
}
	public static void main(String[] args){
	System.out.print("Enter the number : ");
	long n;
	Scanner sc = new Scanner(System.in);
	n = sc.nextInt();
	int count = 0;
	long ans = digits(n,count);
	System.out.println("The digits in "+n+" is : "+ans);
	}
}
