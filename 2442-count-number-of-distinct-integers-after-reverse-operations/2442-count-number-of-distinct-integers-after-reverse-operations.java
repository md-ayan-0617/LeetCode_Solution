import java.util.*;
class Solution {
   static int rev(int n){
        int rev=0;
        while(n>0){
            rev=rev*10+n%10;
            n/=10;
        }
        return rev;

    }
    public int countDistinctIntegers(int[] nums) {
        HashSet<Integer> map=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            map.add(nums[i]);
             map.add(rev(nums[i]));
        }
    

        return map.size();
    }
}