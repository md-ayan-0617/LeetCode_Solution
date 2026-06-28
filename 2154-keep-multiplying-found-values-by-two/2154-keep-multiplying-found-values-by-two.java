class Solution {
    public int findFinalValue(int[] nums, int n) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(n==(nums[i])){
                n*=2;
            }
        }
        return n;
    }
}
