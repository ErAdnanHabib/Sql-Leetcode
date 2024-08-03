class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> triplets = new ArrayList<>();
        Map<Integer, Integer> numToIndex = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            numToIndex.put(nums[i], i);
        }

        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            for (int j = i + 1; j < nums.length - 1; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) continue;

                int target = -nums[i] - nums[j];
                if (numToIndex.containsKey(target) && numToIndex.get(target) > j) {
                    triplets.add(Arrays.asList(nums[i], nums[j], target));
                }
            }
        }

        return triplets;
    }
}