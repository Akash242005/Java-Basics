import java.util.*;
class Main{
	public static int sum(int n,int[] arr){
	if(n<0)
	{
		return 0;
	}
	return arr[n]+sum(n-1, arr);
}
	public static void main(String[] args){
	System.out.print("Enter the number of elements you need : ");
	int n;
	Scanner sc = new Scanner(System.in);
	n = sc.nextInt();
	int[] arr = new int[n];
	for(int i=0;i<n;i++)
	{
		arr[i] = sc.nextInt();
	}
	int ans = sum(n-1,arr);
	System.out.println("The sum in "+n+" is : "+ans);
	}
}
