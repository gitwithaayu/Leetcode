class Solution {
    public void moveZeroes(int[] nums) {

        int ptr1 = 0;

        for (int ptr2 = 0; ptr2 < nums.length; ptr2++) {

            if (nums[ptr2] != 0) {

                int temp = nums[ptr1];
                nums[ptr1] = nums[ptr2];
                nums[ptr2] = temp;

                ptr1++;
            }
        }
    }
}

