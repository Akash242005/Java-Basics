import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++)
        {
            Set<Integer> set = new HashSet<>();
            Set<Integer> set1 = new HashSet<>();
            int n = sc.nextInt();
            int m = sc.nextInt();
            for(int j=0;j<n;j++)
            {
                set.add(sc.nextInt());
            }
            for(int j=0;j<m;j++)
            {
                set1.add(sc.nextInt());
            }
            set.retainAll(set1);
            System.out.println(set.size());
        }
        sc.close();
    }
}
