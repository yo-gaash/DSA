class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        if (nums.length == 0) return result;

        int start = nums[0];

        for (int i = 0; i < nums.length; i++) {
            // Check if it's the end of a range
            if (i == nums.length - 1 || nums[i] + 1 != nums[i + 1]) {
                if (start == nums[i]) {
                    result.add(String.valueOf(start)); // single number
                } else {
                    result.add(start + "->" + nums[i]); // range
                }

                // If not at the last element, update start for next range
                if (i != nums.length - 1) {
                    start = nums[i + 1];
                }
            }
        }

        return result;
    }
}