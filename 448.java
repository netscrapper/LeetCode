class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        for(int num: nums) {
            int index = Math.abs(num)-1;
            if(nums[index] > 0) nums[index]*= -1; 
        }
        List<Integer> ret = new ArrayList<>();
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > 0) ret.add(i+1);
        }
        return ret;
    }
}