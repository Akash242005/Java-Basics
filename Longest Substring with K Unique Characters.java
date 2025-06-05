import java.util.*;
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int k = sc.nextInt();
        int left = 0;
        int right = 0;
        String result = "";
        int maxLength = 0;
        Map<Character,Integer> map = new HashMap<>();
        while(right < str.length()){
            char ch = str.charAt(right);
            map.put(ch, map.getOrDefault(ch, 0)+1);
            while(map.size()>k){
                char lef = str.charAt(left);
                map.put(lef,map.get(lef)-1);
                if(map.get(lef) == 0){
                    map.remove(lef);
                }
                left++;
            }
            if(right-left+1 > maxLength){
                result = str.substring(left, right+1);
                maxLength = Math.max(result.length(),maxLength);
            }
            right++;
        }
        System.out.println(result+" -> "+maxLength);
    }
}
