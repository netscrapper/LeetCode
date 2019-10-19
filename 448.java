// class Solution {
//     public List<Integer> findDisappearedNumbers(int[] nums) {
//         for(int num: nums) {
//             int index = Math.abs(num)-1;
//             if(nums[index] > 0) nums[index]*= -1; 
//         }
//         List<Integer> ret = new ArrayList<>();
//         for(int i = 0; i < nums.length; i++) {
//             if(nums[i] > 0) ret.add(i+1);
//         }
//         return ret;
//     }
// }

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != 0) {
                rec(nums, nums[i]-1);
            }
        }
        List<Integer> ret = new ArrayList<>();
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != 0) ret.add(i+1);
        }
        return ret;
    }

    public void rec(int[] nums, int index) {
        if(nums[index] != 0) {
            int temp = nums[index];
            nums[index] = 0;
            rec(nums, temp-1);
        }
    }
}