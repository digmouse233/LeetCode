import java.util.LinkedList;

class Solution {
    public int[] mostCompetitive(int[] nums, int k) {
        LinkedList<Integer> stack = new LinkedList<>();
        int deleteNumber = nums.length - k;

        for (int num : nums) {
            while (!stack.isEmpty() && deleteNumber > 0 && num < stack.peek()) {
                stack.pop();
                deleteNumber--;
            }
            stack.push(num);
        }

        while (deleteNumber > 0) {
            stack.pop();
            deleteNumber--;
        }

        int[] res = new int[k];
        for (int i = k - 1; i >= 0; i--) {
            res[i] = stack.pop();
        }

        return res;
    }
}