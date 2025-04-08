import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str = sc.nextLine();
        int n = str.length();
        int num = 0;
        for(int i=0;i<n-1;i++){
            num = num*10 + ((int)str.charAt(i) - (int)'0');
            char c = str.charAt(i+1);
            if("0123456789".indexOf(c)==-1){                                                                   // 2a3b -> aabbb
                String temp = "";                                                                              //  10a3b -> aaaaaaaaaabbb
                for(int j=0;j<num;j++){
                    temp += c;
                }
                System.out.print(temp);
                temp = "";
                num = 0;
                i++;
            }
        }
        if(num!=0){
            String temp = "";
            for(int j=0;j<num;j++){
                    temp += str.charAt(n-1);
            }
            System.out.print(temp);
        }
    }
}
