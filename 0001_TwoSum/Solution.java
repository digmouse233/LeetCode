class Solution {
    public int[] twoSum(int[] nums, int target) {
        var res = new int[2];
        var map = new HashMap(); 
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int gap = target - nums[i];
            if (map.get(gap) != null && (int) map.get(gap) != i) {
                res[0] = i;
                res[1] = (int) map.get(gap);
            }
        }
        return res;
    }
}