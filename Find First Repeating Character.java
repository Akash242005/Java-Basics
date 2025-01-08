import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String p = sc.nextLine();
        for(int k=0;k<n;k++)
        {
            String str = sc.nextLine();
            Map<Character,Integer> mp = new LinkedHashMap<>();
            for(int  i=0;i<str.length();i++)
            {
                mp.put(str.charAt(i), mp.getOrDefault(str.charAt(i), 0)+1);
            }
            char val = '.';
            for(int i=0;i<str.length();i++)
            {
                if(mp.get(str.charAt(i)) > 1)
                {
                    val = str.charAt(i);
                    break;
                }
            }
            System.out.println(val);
        }
    }
}
