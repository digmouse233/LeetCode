class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // DO NOT fit the requirement that the time complexity should be O(log(m+n)).

        var combinedArray = new int[nums1.length+nums2.length];

        for (int i = 0; i < nums1.length; i++) {
            combinedArray[i] = nums1[i];
        }

        for (int j = 0; j < nums2.length; j++) {
            combinedArray[nums1.length+j] = nums2[j];
        }

        Arrays.sort(combinedArray);

        int start = 0, end = combinedArray.length - 1;
        int mid = start + (end - start) / 2;
        double median = 0;

        if (combinedArray.length % 2 == 1) {
            median = combinedArray[mid];
        } else {
            median = (combinedArray[mid] + combinedArray[mid+1]) / 2;
        }

        return median;
    }
}