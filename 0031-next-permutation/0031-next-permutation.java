class Solution {
    public void nextPermutation(int[] nums) {

        int pivot = -1;

        // 1. Find pivot
        for (int i = nums.length - 1; i > 0; i--) {
            if (nums[i] > nums[i - 1]) {
                pivot = i - 1;
                break;
            }
        }

        // If no pivot, array is the largest permutation
        if (pivot == -1) {
            for (int i = 0, j = nums.length - 1; i < j; i++, j--) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
            return;
        }

        // 2. Find the smallest element greater than pivot
        int greater = -1;

        for (int i = nums.length - 1; i > pivot; i--) {
            if (nums[i] > nums[pivot]) {
                greater = i;
                break;
            }
        }

        // 3. Swap pivot and greater
        int temp = nums[pivot];
        nums[pivot] = nums[greater];
        nums[greater] = temp;

        // 4. Arrange suffix in ascending order
         for (int i = pivot + 1; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {

                if (nums[i] > nums[j]) {
                    int t = nums[i];
                    nums[i] = nums[j];
                    nums[j] = t;
                }
            }
        }
            
        
    }
}