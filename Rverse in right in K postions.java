import java.util.*;
public class chatGpt{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array : ");
        int size = sc.nextInt();
        int[] ans = new int[size];
        for(int i=0;i<size;i++){
            ans[i] = sc.nextInt();
        }
        System.out.println("Enter the K : ");
        int k = sc.nextInt();
        System.out.println(Arrays.toString(ans));
        reverse(ans, 0, size-1);
        reverse(ans, 0, k-1);
        reverse(ans, k, size-1);
        System.out.println(Arrays.toString(ans));
    }
    static void reverse(int[] ans,int start,int end){
        while(start < end){
            int temp = ans[start];
            ans[start] = ans[end];
            ans[end] = temp;
            end--;
            start++;
        }
    }
}
