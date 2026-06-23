class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0;
        int j=1;
      
        for(;i<nums.length && j<nums.length;j++){
            if(nums[i]==nums[j]){
                continue;
            }
            i++;
            int tem=nums[i];
            nums[i]=nums[j];
            nums[j]=tem;
        }
        return i+1;
    }
}