import java.util.*;
class palindrom{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Sentence : ");
		String str = sc.nextLine();
		int n = str.length();
		int s = str.length()/2;
		char[] charector = str.toCharArray();
		for(int i=0;i<n;i++)
		{
			char a  = charector[i];
			charector[i] = charector[n-1-i];
			charector[n-1-i] = a;
		}
		String temp = new String(charector);
		if(str.equals(temp))
		{
			System.out.print("The given String is Palindrom!!! ans the string is : "+str);
		}
		else
		{
			System.out.print("The given String is Not Palindrom!!! ans the Original String is : "+str+" and the Reversed String is : "+temp);	
		}
	}
}
