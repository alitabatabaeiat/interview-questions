class Solution {
    public int removeDuplicates(int[] nums) {
        int index = 0, i = 1;
        boolean newNumber = true;
        for (; i < nums.length; i++) {
            if (nums[index] != nums[i]) {
                nums[++index] = nums[i];
                newNumber = true;
            }
            else if (newNumber) {
                nums[++index] = nums[i];
                newNumber = false;
            }   
        }

        return index + 1;
    }
}
