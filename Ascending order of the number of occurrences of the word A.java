import java.util.*;
class zoho{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String summa = sc.nextLine();                //Leave empty space in the Input!!!
        String search_word = sc.nextLine();
        TreeMap<Integer,List<String>> mp = new TreeMap<>();
        for(int i=0;i<n;i++){
            String str = sc.nextLine();                                  //Input: 2
            String[] arr = str.split(" ");                                //Java
            int count = 0;                                                // I hate java
            for(int j=0;j<arr.length;j++){                                //Python is a good programming language
                if(arr[j].equals(search_word)){                           //Output: Python is a good programming language
                    count++;                                              //I hate java
                }
            }
            mp.computeIfAbsent(count,k -> new ArrayList<>()).add(str);
        }
        for (Map.Entry<Integer,List<String>> u : mp.entrySet()) {
            for(String to_print : u.getValue()){
                System.out.println(to_print);
            }
        }

    }
}
