class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] right = new int[n];
        int pro = 1;
        
        for (int i = n - 1; i >= 0; i--) {
            pro = pro * nums[i];
            right[i] = pro;
        }
        
        int[] ans = new int[n];
        int left = 1;
        
        for (int i = 0; i < n; i++) {
            if (i + 1 < n) {
                ans[i] = left * right[i + 1];
            } else {
                ans[i] = left;
            }
            left = left * nums[i];
        }
        
        return ans;
    }
}