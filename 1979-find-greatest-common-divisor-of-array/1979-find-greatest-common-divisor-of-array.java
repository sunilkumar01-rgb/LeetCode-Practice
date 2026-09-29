class Solution {
    public int findGCD(int[] nums) {
        int mini = nums[0];
        int maxi = nums[0];

        for (int el : nums) {
            if (el < mini) {
                mini = el;
            }

            if (el > maxi) {
                maxi = el;
            }
        }

        int a = maxi;
        int b = mini;

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }
}