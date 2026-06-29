class Solution {
    public int maximumCount(int[] nums) {
        if(nums.length==1 && nums[0]!=0)return 1; 
        int s=0;
        int e=nums.length-1;
        //lower bond
        int l=-1;
       
        while(s<=e){
            int mid=s+(e-s)/2;
            if(0<=nums[mid]){
                l=mid;
                //left chalo
                e=mid-1;
            }else{
                s=mid+1;
            }
        }
        //upper bond
        int u=-1;
        s=0;
        e=nums.length-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(0<nums[mid]){
                u=mid;
                e=mid-1;
            }else{
                s=mid+1;
            }
        }
        System.out.println("UPPER BOND "+u);
         System.out.println("LOWER BOND "+(l-1));
        if((l-1)==-1 && nums[nums.length-1]==0)return 0;
        if((l-1)<0 && u<0)return nums.length;
        if(u<0 && l+1>0)return l;
        return Math.max(l,nums.length-u);
    }
}