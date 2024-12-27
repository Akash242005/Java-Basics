import java.util.*;
class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		StringBuilder str = new StringBuilder();
		str.append("Hello");
		str.append(" World");
		System.out.println("The String after appending is : "+str);
		str.replace(5,6," to the ");
		System.out.println("The String after Replacing is : "+str);
		str.delete(1,3);
		System.out.println("The String after Deleting is : "+str);
		str.reverse();
		System.out.println("The String after Reversing is : "+str);
		System.out.println("The String capacity is : "+(str.capacity()));
		System.out.println("==========String Builder up=======");
		System.out.println(" ");
		System.out.println("==========Strings down============");
		String str1 = "      Normal String ";
		System.out.println("The String Length is : "+(str1.length()));
		System.out.println("The indexOf operation  : "+(str1.indexOf('S')));
		System.out.println("The charAt operation  : "+(str1.charAt(4)));
		String str2 = "String";
		System.out.println("The compare operation  : "+(str2.compareTo("sTRING")));
		System.out.println("The compare without case operation  : "+(str2.compareToIgnoreCase("string")));
		System.out.println("The contains operation  : "+(str1.contains("mal ")));
		System.out.println("The  endwith operation  : "+(str1.endsWith("g ")));
		System.out.println("The replace operation  : "+(str1.replace("String ","Programming is Java")));
		System.out.println("The replaceall operation  : "+(str1.replaceAll(" ","@!")));
		System.out.println("The replace first operation  : "+(str1.replaceFirst("[N]","\\$")));
		System.out.println("The lower case operation  : "+(str1.toLowerCase()));
		System.out.println("The upper case operation  : "+(str1.toUpperCase()));
		System.out.println("The trim operation  : "+(str1.trim()));
		System.out.println("The number to string  : "+(String.valueOf(123456789)));
		char[] array = str1.toCharArray();
		System.out.println("The character array is  : "+(Arrays.toString(array)));
		System.out.print("The Number of Vowel letters are : ");
		int vow = 0;
		int con = 0;
		for(char u :str1.toCharArray())
		{
			if("AEIOUaeiou".indexOf(u) != -1)
			{
				vow++;
			}
			else if("AEIOUaeiou".indexOf(u) == -1 && u!=' ')
			{
				con++;
			}
		}
		System.out.println(vow);
		System.out.print("The Number of Consonents is : ");
		System.out.println(con);
	}
}
