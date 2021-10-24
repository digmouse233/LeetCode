import java.util.List;
import java.util.PriorityQueue;

class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                priorityQueue.add(matrix[i][j]);
            }
        }

        while (k > 1) {
            priorityQueue.poll();
            k--;
        }

        return priorityQueue.poll();
    }
}