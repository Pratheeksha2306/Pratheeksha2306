class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        int[]arr=new  int[m+n];
        int k=0;
        for(int i=0;i<m;i++){
            arr[k++]=nums1[i];
        }
        for(int j=0;j<n;j++){
            arr[k++]=nums2[j];
        }
        java.util.Arrays.sort(arr);
        int len=arr.length;
        if(len%2==1){
            return arr[len/2];
        }else{
            return(arr[len/2-1]+arr[len/2])/2.0;
        }
    }
}
