class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);
        List<List<Integer>> matrix = new ArrayList<>();
        
        for(int i =0; i<nums.length && nums[i]<=0; i++){
            if (i == 0 || nums[i]!=nums[i-1]){
                twoSum(nums, i, matrix);
            }
        }
       
       return matrix;
    }
    void twoSum(int[]nums, int i, List<List<Integer>> matrix) {
        int left =i+1;
        int right = (nums.length) -1;
        while(left<right){
            int sum = nums[i] + nums[left] + nums[right];
            if(sum == 0) {
                matrix.add(Arrays.asList(nums[i], nums[left++], nums[right--]));
                while(left<right && nums[left]==nums[left-1]){
                    left++;
                }
            }
            if(sum>0){
                right--;
            }
            if(sum<0){
                left++;
            }



        }
    }
}