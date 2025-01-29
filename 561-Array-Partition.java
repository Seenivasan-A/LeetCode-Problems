class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int ans = 0;
        for(int i = 0; i < n; i += 2)
            ans += nums[i];
        return ans;
    }
}
//sort the array
//traverse by i=i+2 like element in odd place
//sum the values in the odd place
//print the sum 