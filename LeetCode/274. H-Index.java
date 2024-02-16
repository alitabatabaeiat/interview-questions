class Solution {
    public int hIndex(int[] citations) {
        // if (citations.length == 1) {
        //     return citations[0] > 0 ? 1 : 0;
        // }
        // Arrays.sort(citations);

        // int h = 0;
        // for (int i = citations.length - 1; i >= 0; i--) {
        //     if (++h > citations[i]) {
        //         h--;
        //         break;
        //     }
        // }

        // return h;

        int n = citations.length;
        int[] frequency = new int[n + 1];
        for (int num : citations) {
            frequency[Math.min(num, n)]++;
        }

        int sum = 0;
        for (int i = n; i >= 0; i--) {
            sum += frequency[i];
            if (sum >= i) return i;
        }

        return 0;
    }
}
