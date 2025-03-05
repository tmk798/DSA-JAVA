class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        // Sort both arrays
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        // List to store the result
        List<Integer> resultList = new ArrayList<>();

        // Two pointers to iterate through both arrays
        int i = 0, j = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                // If elements are equal, add to the result list
                resultList.add(nums1[i]);
                i++;
                j++;
            } else if (nums1[i] < nums2[j]) {
                // If nums1's element is smaller, move pointer i
                i++;
            } else {
                // If nums2's element is smaller, move pointer j
                j++;
            }
        }

        // Convert the result list to an array
        int[] result = new int[resultList.size()];
        for (int k = 0; k < resultList.size(); k++) {
            result[k] = resultList.get(k);
        }

        return result;
    }
}