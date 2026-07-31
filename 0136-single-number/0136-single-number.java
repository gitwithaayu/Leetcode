class Solution {
    public int singleNumber(int[] nums) {
//         int i=0,c=0,j=0;
//         for(i=0;i<nums.length;i++){
//             c=0;
//             for(j=0;j<nums.length;j++){
//                 if(nums[i]==nums[j]){
//                     c++;
//                 }
            
//             }
//             if(c==1)
//             return nums[i] ;


//         }
//         return -1;
//     }
// }

HashMap<Integer,Integer>map=new HashMap<>();
for(int num:nums){
    map.put(num,map.getOrDefault(num,0)+1);
}
for(int key:map.keySet()){
if(map.get(key)==1)
   return key;
}
return -1;
    }
}
