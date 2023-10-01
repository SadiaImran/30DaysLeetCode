class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] arr = new int[nums.length];
        for(int i = 0 , j = n , p= 0 ; i<=nums.length-1 ; i = i+2  , j++ , p++){
            arr[i] = nums[p] ;
            arr[i+1] = nums[j];
        }
        return arr ; 
    }
}