import java.util.*;
public class ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str = sc.next();
        int count = 0;
        int max = 1;
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<str.length();i++)
        {
            if(map.containsKey(str.charAt(i)))
            {
                count = map.get(str.charAt(i))+1;
            }
            map.put(str.charAt(i), i);
            max = Math.max(max, i-count+1);
        }
        System.out.println("The Longest Unique Substring is : "+max);
    }
}
