class Solution {
    public boolean canJump(int[] nums) {
        // int i = nums.length - 1;
        // nums[i] = -1;
        // for (i--; i >= 0; i--) {
        // for (int j = 1; j <= nums[i]; j++) {
        // if (nums[i + j] == -1) {
        // nums[i] = -1;
        // break;
        // }
        // }
        // }

        // return nums[0] == -1;

        // int reachable = 0;
        // for (int i = 0; i < nums.length; i++) {
        // if (i > reachable) {
        // return false;
        // }
        // reachable = Math.max(reachable, i + nums[i]);
        // }
        // return true;

        int destination = nums.length - 1;
        for (int i = nums.length - 2; i >= 0; i--) {
            if (i + nums[i] >= destination) {
                destination = i;
            }
        }
        return destination == 0;
    }
}
