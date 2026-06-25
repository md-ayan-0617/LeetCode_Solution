class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int arr[]=new int[letters.length];
        int a=target;
        for(int i=0;i<letters.length;i++){
            arr[i]=letters[i]-96;
        }
        int s=0;
        int e=arr.length-1;
        char index='q';
        boolean k=false;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(arr[mid]<=(target-96)){
               
                s=mid+1;
            }else{
                e=mid-1;
                index=letters[mid];
                k=true;

            }
        }
        if(k)return index;
        return (letters[0]);
    }
}