import java.util.*;
class zoho{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String vowString = "aeiou";
        HashMap<Character,Integer> mp = new HashMap<>();
        for(int i=0;i<str.length();i++){
            mp.put(str.charAt(i),mp.getOrDefault(str.charAt(i),0)+1);
        }                                                                                                                 // INPUT : Compuuter
        String toRemove = "";                                                                                             // OUTPUT : Cmpuutr
        for(Map.Entry<Character,Integer> u:mp.entrySet()){
            if(vowString.indexOf(u.getKey()) != -1 && u.getValue()==1){
                toRemove += u.getKey();
            }
        }
        String ans = "";
        for(int i=0;i<str.length();i++){
            if(toRemove.indexOf(str.charAt(i)) == -1){
                ans += str.charAt(i);
            }
        }
        System.out.println(ans);
    }
}
