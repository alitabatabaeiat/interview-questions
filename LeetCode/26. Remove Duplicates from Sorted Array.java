class Solution {
    public int removeDuplicates(int[] nums) {
        // My Solution
      
        // if (nums.length < 2) {
        //     return nums.length;
        // }

        // int uniqueIndex = 1, i = 0, j = 1;
        // while (i < nums.length - 1) {
        //     if (j == nums.length - 1 && nums[i] == nums[j]) break;

        //     if (nums[i] != nums[j]) {
        //         nums[uniqueIndex++] = nums[j];
        //         i = j++;
        //     } else {
        //         while ((j < nums.length - 1) && nums[i] == nums[j]) j++;
        //     }
        // }

        // return uniqueIndex;

        int index = 0, i = 1;
        for (; i < nums.length; i++) {
            if (nums[index] != nums[i]) nums[++index] = nums[i];
        }

        return index + 1;
    }
}
