import java.util.*;
class Main{
	public static void main(String[] args){
		int[] array = new int[5];
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
			System.out.print("Enter the "+i+"th element : ");
			int a = sc.nextInt();
			array[i] = a;
		}
		for(int i=0;i<5;i++)
		{
			System.out.println("The "+i+"th element : "+array[i]);
		}
		Arrays.sort(array);
		System.out.println("The array is : "+(Arrays.toString(array)));
		int[] arr = new int[10];
		Arrays.fill(arr,7);
		int[] arr1 = new int[4];
		arr1 = Arrays.copyOfRange(array,0,3);
		System.out.println("The array is : "+(Arrays.toString(arr)));
		System.out.println("The array is : "+(Arrays.toString(arr1)));
		System.out.println(Arrays.equals(arr,arr1));
		int sum = Arrays.stream(array).sum();
		System.out.println("The sum of "+(Arrays.toString(array))+" is "+sum);
	}
}
		
			
