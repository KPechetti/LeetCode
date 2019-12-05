class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
    
    if(nums.length == 0 || k<=0) return new int[]{};
        
    int [] res = new int [nums.length-k+1]; int l = 0;
        
        for(int i =0; i<nums.length-k+1; i++)
        {
            int large = nums[i];
            
            for(int j =i+1; j<i+k; j++)
            {
                if(large < nums[j]) large = nums[j];
            }
            res[l++] = large;
        }
    
        return res;
    }
}
