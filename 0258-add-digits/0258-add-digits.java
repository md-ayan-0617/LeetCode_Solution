class Solution {
    
    public int addDigits(int num) {
        if(num<=9)return num;
        int sum=0;
        for(;num>0;num/=10)sum+=num%10;
        return addDigits(sum);
    }
}