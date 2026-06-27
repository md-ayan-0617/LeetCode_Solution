class Solution {
    public boolean searchMatrix(int[][] arr, int target) {       
        for(int i=0;i<arr.length;i++){
            int s=0;
            int e=arr[0].length-1;
         while(s<=e){
             int mid=s+(e-s)/2;
             if(arr[i][mid]==target)return true;
                    else if(arr[i][mid]<target)s=mid+1;
                else e=mid-1;
        }
        }
        return false;
    }
}