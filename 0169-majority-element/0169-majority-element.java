class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int majority = nums[0];
        int freq = 0;

        for (int i = 0; i < n; i++) {
            if (freq == 0) {
                majority = nums[i];
                freq = 1;
            } else {
                if (nums[i] == majority) {
                    freq++;
                } else {
                    freq--;
                }
            }
        }
        return majority;
    }
}