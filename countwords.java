import java.util.*;
class words{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Sentence : ");
		String str = sc.nextLine();
		int word = 0;
		for(char u:str.toCharArray())
		{
			if(u == ' ')
			{
				word++;
			}
		}
		System.out.print("The Total number of Words in "+str+" is " +(word+1));
	}
}
		
