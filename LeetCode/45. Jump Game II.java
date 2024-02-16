class Solution {
    public int jump(int[] nums) {
        // int i = nums.length - 1;
        // nums[i] = 0;

        // for (i--; i >= 0; i--) {
        //     int min = Integer.MAX_VALUE;
        //     for (int j = 1; j <= nums[i] && i + j < nums.length; j++) {
        //         if (nums[i + j] >= 0 && min > nums[i + j]) {
        //             min = nums[i + j];
        //         }
        //     }
        //     nums[i] = min == Integer.MAX_VALUE ? -1 : min + 1;
        // }

        // return nums[0];

        int step = 0, currentEnd = 0, farthest = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            farthest = Math.max(farthest, i + nums[i]);

            if (i == currentEnd) {
                step++;
                currentEnd = farthest;
            }
        }

        return step;
    }
}
