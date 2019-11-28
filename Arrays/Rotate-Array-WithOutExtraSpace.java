class Solution {
    public void rotate(int[] nums, int k) {
        k = k%nums.length;
        int size = nums.length-1;
        reverse(nums, 0, size);
        reverse(nums, 0, k-1);
        reverse(nums, k, size);
        
    }
        public void reverse(int [] nums, int start, int end)
        {
            while(start<end)
            {
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                start++;end--;
            }
        }
        
}
