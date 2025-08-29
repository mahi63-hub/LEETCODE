class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int[] ar:image){
            ReverseArray(ar);
        }
        for(int[] arr:image){
            for(int i=0;i<arr.length;i++){
                if(arr[i]==0){
                    arr[i]=1;
                }else{
                    arr[i]=0;
                }
            }
        }
        return image;
    }

    public int[] ReverseArray(int[] arr){
        int l=0,r=arr.length-1;
        while(l<r){
            int temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            l++;
            r--;
        }
        return arr;
    }
}