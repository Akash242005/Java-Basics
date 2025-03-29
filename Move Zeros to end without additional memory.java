import java.util.*;
public class chatGpt{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array : ");
        int size = sc.nextInt();
        if(size<2){
            System.out.println("No sec_max Element");
            return;
        }
        int[] ans = new int[size];
        int zero = 0;
        for(int i=0;i<size;i++){
            ans[i] = sc.nextInt();
            if(ans[i] == 0){
                zero++;
            }
        }
        int j = 0;
        for(int i=0;i<size;i++){
            if(ans[i]!=0){
                ans[j] = ans[i];
                j++;
            }
        }
        while(zero != 0){
            ans[j++] = 0;
            zero--;
        }
        System.out.println(Arrays.toString(ans));
    }
}
