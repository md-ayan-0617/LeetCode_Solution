import java.util.*;
class Solution {
    public int firstUniqChar(String s) {
        int index=-1;
        
        HashMap<Character,Integer> a=new HashMap<>();
        for(int i=0;i<s.length();i++){
                a.put(s.charAt(i), a.getOrDefault(s.charAt(i), 0) + 1);}
        for(int i=0;i<s.length();i++){
            if(a.get(s.charAt(i))==1){
                return i;
            }
        }
        System.out.println(a);
        return index;
    }
}