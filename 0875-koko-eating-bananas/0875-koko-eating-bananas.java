class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        int low = 1;
        int high = piles[0];

        // Find maximum element
        for (int i = 1; i < piles.length; i++) {
            if (piles[i] > high) {
                high = piles[i];
            }
        }
        int ans = high;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            long totalHours = 0;

            // Calculate total hours
            for (int i = 0; i < piles.length; i++) {
                totalHours += (int) Math.ceil((double) piles[i] / mid);
            }

            if (totalHours <= h) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }
}