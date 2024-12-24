import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    String name,pass;
		Scanner sc = new Scanner(System.in);
		do{
		    System.out.print("Enter the name : ");
		    name = sc.next();
		    System.out.print("Enter the password : ");
		    pass = sc.next();
		    if(!name.equals("Akash") || !pass.equals("Akash@2005"))
		    {
		        System.out.println("Please enter the credintial correctly");
		    }
		}while(!name.equals("Akash") || !pass.equals("Akash@2005"));
		System.out.println("You entered Succesfully !!!!! " + name);
	}
}
