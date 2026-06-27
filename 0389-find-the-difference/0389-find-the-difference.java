class Solution {
    public char findTheDifference(String s, String t) {
        char x=0;
        char arr1[]=s.toCharArray();
        char arr2[]=t.toCharArray();
        for(char i:arr1){x^=i;}
        for(char i:arr2){x^=i;}
        return x;
    }
}