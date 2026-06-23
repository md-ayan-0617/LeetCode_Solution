class Solution {
    public String removeTrailingZeros(String num) {
       int i=num.length()-1;
       
       for(;i>=0;i--){
        if(num.charAt(i)!='0')break;
       }
    String k=(i!=num.length()-1)?num.substring(0,i+1):num;
       
        return k;

    }
}