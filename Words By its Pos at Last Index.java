import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();                                     // am1 akash2 i0 (input)
        String[] array = str.split(" ");                                // i am akash (OUTPUT);
        int n = array.length;
        String[] ans = new String[n];
        for(int i=0;i<array.length;i++)
        {
            String temp = array[i];
            int lastPos = temp.length() - 1;
            int num = (int)temp.charAt(lastPos) - (int)'0';
            String temp1 = "";
            for(int j=0;j<temp.length()-1;j++)
            {
                temp1 = temp1 + temp.charAt(j);
            }
            ans[num] = temp1;
        }
        for(int i=0;i<ans.length;i++)
        {
            System.out.print(ans[i]+" ");
        }
        sc.close();
    }
}
