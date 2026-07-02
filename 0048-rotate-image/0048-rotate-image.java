class Solution {
    public void rotate(int[][] arr) {
        int len=arr.length;
        for(int i=0;i<len;i++){
            for(int j=0;j<len;j++){
                if(i<j){
                    int tem=arr[i][j];
                    arr[i][j]=arr[j][i];
                    arr[j][i]=tem;
                }
            }
        }
        int i=0;int j=len-1;
        for(int k=0;k<len;k++){
            while(i<=j){
            int tem=arr[k][j];
            arr[k][j]=arr[k][i];
            arr[k][i]=tem;
            i++;j--;
        }
        i=0;
        j=len-1;
        }

    }
}