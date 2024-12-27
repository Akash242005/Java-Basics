import java.util.*;
class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the array : ");
		int n = sc.nextInt();
		int[] array = new int[n];		
		for(int i=0;i<n;i++)
		{
			System.out.print("Enter the "+(i+1)+"th Element : ");
			int a = sc.nextInt();
			array[i] = a;
		}
		System.out.println("The Array before Reversing is : "+(Arrays.toString(array)));
		int mid = n/2;
		for(int i=0;i<mid;i++)
		{
			int temp = array[i];
			array[i] = array[n-1-i];
			array[n-1-i] = temp;
		}
		System.out.println("The Array after Reversing is : "+(Arrays.toString(array)));
	}
}
