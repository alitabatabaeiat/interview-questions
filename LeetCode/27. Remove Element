class Solution {
    public int removeElement(int[] nums, int val) {
        if (nums.length == 0) {
            return 0;
        }

        int i = 0, j = nums.length - 1;
        for (; i <= j; i++) {
            if (nums[i] == val) {
                while (j >= i && nums[j] == val) {
                    j--;
                }

                if (j == i - 1) {
                    break;
                }

                nums[i] = nums[j--];
            }
        }

        return i;
    }
}
