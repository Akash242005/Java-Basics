import java.util.*;
class palindrom{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Sentence : ");
		String str = sc.nextLine();
		String temp = str;
		int n = str.length();
		int s = str.length()/2;
		for(int i=0;i<s;i++)
		{
			char a = str.charAt(i)Gowtham;
			str.replace(str.charAt(i),str.charAt(n-1-i));
			str.replace(str.charAt(n-1-i),a);
		}
		if(str.equals(temp))
		{
			System.out.print("The given String is Palindrom!!! ans the string is : "+str);
		}
		else
		{
			System.out.print("The given String is Not Palindrom!!!");	
		}
	}
}
