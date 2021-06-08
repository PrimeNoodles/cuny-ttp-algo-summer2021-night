class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum = 0;
        int ans = 0;
        int temp = 0;
        
        for(int i = 0; i < nums.length; i++){
            if(sum < target){
                sum += nums[i];
            }
            while(sum >= target){
                ans = Math.min(ans, (i - temp) + 1);
                temp += 1;
                sum -= nums[temp];
            }
        }
        return ans;
    }    
}

//Not completed, still has errors