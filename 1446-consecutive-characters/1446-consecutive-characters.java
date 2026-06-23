class Solution {
    public int maxPower(String s) {
        StringBuilder sb=new StringBuilder(s);
        int c=0;
        int max=0;
        int i=0;
        int j=i+1;
        for(;j<s.length() && i<s.length();j++){
            if(sb.charAt(i)==sb.charAt(j)){
                c++;
                max=Math.max(max,c);
            }
            else{
                i++;
                char tem=sb.charAt(i);
                sb.setCharAt(i,sb.charAt(j));
                sb.setCharAt(j,tem);
                c=0;
            }
    
        }return max+1;
    }
}