import java.util.Arrays;

class Solution7 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m; // start inserting at index m
        for (int j = 0; j < n; j++) {
            nums1[i] = nums2[j];
            i++;
        }
        Arrays.sort(nums1); // sort the combined array
    }
}
