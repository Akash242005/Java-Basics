import java.util.Scanner;
class Area{
	public static double area_circle(int r){
		return r*r*3.14;
	}
	public static double area_rect(int l,int b){
		return l*b;
	}
	public static double area_square(int a){
		return a*a;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the radius : ");
		int radius = sc.nextInt();
		System.out.print("Enter the length : ");
		int len = sc.nextInt();
		System.out.print("Enter the breadth : ");
		int bre = sc.nextInt();
		System.out.print("Enter the length of square : ");
		int slen = sc.nextInt();
		double ans1 = area_circle(radius);
		double ans2 = area_rect(len,bre);
		double ans3 = area_square(slen);
		System.out.println("The circle area is : "+ans1);
		System.out.println("The rectangle area is : "+ans2);
		System.out.println("The square area is : "+ans3);
	}
}
