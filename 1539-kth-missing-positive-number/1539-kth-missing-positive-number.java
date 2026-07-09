class Solution {
    public int findKthPositive(int[] arr, int k) {
       

//         ArrayList<Integer> list = new ArrayList<>();
//         int j = 1;

//         for (int i = 0; i < arr.length; i++) {

//             if (j != arr[i]) {
//                 list.add(j);
//                 j++;
//                 i--;          // Same array element ko dobara check karo
//             } else {
//                 j++;
//             }
//         }

//         // Array ke baad bhi missing numbers add karo
//         while (list.size() < k) {
//             list.add(j);
//             j++;
//         }

//         return list.get(k - 1);
//     }
// }


        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            int missing = arr[mid] - (mid + 1);

            if (missing < k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return low + k;
    }
}
