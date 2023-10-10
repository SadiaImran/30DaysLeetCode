class Solution {
    public int largestPerimeter(int[] nums) {
        int maxP = 0;
        
        Arrays.sort(nums);

        for(int i = nums.length-1 ; i> 1 ; --i ){
            if(nums[i] < nums[i-1]+nums[i-2]){
                maxP = nums[i] + nums[i-1] +nums[i-2];
                return maxP ; 
            }
        }

        return maxP ; 
    }
}
