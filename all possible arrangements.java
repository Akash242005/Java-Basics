import java.util.*;
public class permutation{
    public static void permute(String str,String ans){
        if(str.length()==0){
            System.out.println(ans);
        }
        else{
            for(int i=0;i<str.length();i++){
                String temp = str.substring(0, i) + str.substring(i+1);
                char c = str.charAt(i);
                permute(temp,ans+c);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str = sc.nextLine();
        permute(str,"");
    }
}

// ALL THE POSSIBLE PATTERNS WITH THE WORD - e.g "ABC" have 6 possible
