class Solution {
    public boolean increasingTriplet(int[] nums) {
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        
        for (int ele : nums) {
            if (first >= ele) {
                first = ele;
            } else if (second >= ele) {
                second = ele;
            } else {
                return true;
            }
        }
        return false;
    }
}