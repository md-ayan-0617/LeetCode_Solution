class Solution {
    public char findTheDifference(String s, String t) {
        HashMap<Character,Integer> a=new HashMap<>();
        HashMap<Character,Integer> b=new HashMap<>();
        b.put(t.charAt(0),1);
        for(int i=0;i<s.length();i++){
                b.put(t.charAt(i+1),b.getOrDefault(t.charAt(i+1),0)+1);
                a.put(s.charAt(i),a.getOrDefault(s.charAt(i),0)+1);
        }
        for (Character key : b.keySet()) {
             if (!(a.get(key)== b.get(key))) {
                    return key;
    }
}
        System.out.println(a);
        System.out.println(b);
      
        return 'a';
    }
}