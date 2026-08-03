class Solution {
    public void sortColors(int[] nums) {
//        int z=0;
// int length = nums.length;
// int c0=0;
//  int c1=0;
//   int c2=0;
// for (int j = 0; j < length; j++) { 
//     if(nums[j]==0)  
//      c0++;
//     else if(nums[j]==1)
//          c1++;
//     else if(nums[j]==2){
//          c2++;
//     }
// }
// for (int i=0; i<c0;i++){
//     nums[z++]=0;
//     }

// for (int i=0; i<c1;i++){
//     nums[z++]=1;
//     }

// for (int i=0; i<c2;i++){
//     nums[z++]=2;
//     }

// }
//     }

int mid=0;
int start=0;
int end=nums.length-1;
while(mid<=end){
    if(nums[mid]==0){
        int temp=nums[mid];
        nums[mid]=nums[start];
        nums[start]=temp;
        mid++;
        start++;
    }
    else if(nums[mid]==1){
        mid++;
    }
    else{
         int temp=nums[mid];
        nums[mid]=nums[end];
        nums[end]=temp;
        end--;

    }
}
    }
}