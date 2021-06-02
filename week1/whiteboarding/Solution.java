class Solution {
    public int maxSubArray(int[] nums) {
        int subArr[] = new int[nums.length];
        int sum = nums[0];
        subArr[0] = nums[0];
        for(int i = 1; i < nums.length; i++){
            subArr[i] = Math.max(subArr[i - 1] + nums[i], nums[i]);
//            System.out.println("This is sum subArr of " + i + ": " + subArr[i]);
            sum = Math.max(sum, subArr[i]);            
//            System.out.println("This is the biggest value: " + sum);
        }
        return sum;
    }
}