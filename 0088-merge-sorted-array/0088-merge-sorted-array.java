class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int i = m - 1;        // nums1 ke actual elements ka last index
        int j = n - 1;        // nums2 ka last index
        int k = m + n - 1;    // nums1 ka last position


        while (i >= 0 && j >= 0) {

            if (nums2[j] > nums1[i]) {
                nums1[k] = nums2[j];
                j--;
            } 
            else {
                nums1[k] = nums1[i];
                i--;
            }

            k--;
        }


        // Agar nums2 ke elements bach gaye
        while (j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }
    }
}