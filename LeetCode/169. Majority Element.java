class Solution {
    public int majorityElement(int[] nums) {
        int counter = 0, res = 0;
        for (int num : nums) {
            if (counter == 0) {
                res = num;
            }

            if (res == num) {
                counter++;
            } else {
                counter--;
            }
        }

        return res;
    }
}
