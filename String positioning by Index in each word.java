import java.util.*;
class zoho{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int words = 0;
        for(int i=0;i<str.length();i++){
            if("0123456789".indexOf(str.charAt(i)) !=  -1){
                words++;
            }
        }
        String[] arr = new String[words];
        int index = -1;                                                                                                       //******  INPUT :  is1 Thi0s T3est 2a  ********
        String temp = "";                                                                                                     //******  OUTPUT : This is a Test      ********  
        for(int i=0;i<str.length();i++){
            if("0123456789".indexOf(str.charAt(i)) !=  -1){
                index = str.charAt(i) - '0'; 
            }
            else if(str.charAt(i)==' '){
                arr[index] = temp;
                index = -1;
                temp = "";
            }
            else{
                temp += str.charAt(i);
            }
        }
        arr[index] = temp;
        index = -1;
        temp = "";
        for(String u:arr){
            temp += u + " ";
        }
        System.out.println(temp);
    }
}
