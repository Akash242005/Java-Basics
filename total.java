import java.util.*;
class total{
	public static double find_avg(int[] arr,int sum){
		return sum/arr.length;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] array = new int[7];
		int sum = 0;
		double avg = 0;
		for(int i=0;i<7;i++)
		{
			System.out.print("Enter the "+i+"th element : ");
			int a = sc.nextInt();
			array[i] = a;
			sum = sum + a;
		}
		avg = find_avg(array,sum);
		System.out.println("The average is : "+avg);
		System.out.println("The sum is : "+sum);
	}
}
		
