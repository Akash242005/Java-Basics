import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<Integer,Integer> mp = new LinkedHashMap<>();
        for(int k=0;k<n;k++)
        {
            mp.put(sc.nextInt(),1);
        }
        int count = 0;
        for(Map.Entry<Integer,Integer> u:mp.entrySet())
        {
            count++;
        }
        System.out.println(count);
    }
}
