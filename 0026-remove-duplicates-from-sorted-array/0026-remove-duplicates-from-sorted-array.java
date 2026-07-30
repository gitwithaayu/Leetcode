class Solution {
    public int removeDuplicates(int[] nums) {

        if (nums.length == 0)
            return 0;

        int ptr1 = 0;
        int ptr2 = 1;

        while (ptr2 < nums.length) {

            if (nums[ptr1] == nums[ptr2]) {
                ptr2++;
            } else {
                ptr1++;
                nums[ptr1] = nums[ptr2];
                ptr2++;
            }
        }

        return ptr1 + 1;
    }
}