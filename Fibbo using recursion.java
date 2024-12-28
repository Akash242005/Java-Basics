import java.util.*;
class Main{
	public static int[] fibbo(int n,int[] arr,int index){
	if(n<=index)
	{
		return arr;
	}
	int num = arr[index-1] + arr[index-2];
	arr[index] = num;
	return fibbo(n,arr,index+1);
}
	public static void main(String[] args){
	System.out.print("Enter the number of elements you need : ");
	int n;
	Scanner sc = new Scanner(System.in);
	n = sc.nextInt();
	int[] arr = new int[n];
	arr[0] = 0;
	arr[1] = 1;
	int index = 2;
	int[] ans = fibbo(n,arr,index);
	System.out.println("The Fibbo series with "+n+" elements is : "+Arrays.toString(ans));
	}
}
