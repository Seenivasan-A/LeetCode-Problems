class Solution {
    public int maximumCount(int[] nums) {
        int countn=0;      
        int countp=0;
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                countn++;

            }
            else if(nums[i]<0){
                countp++;
            }
        }
        max=Math.max(countn,countp);
       // System.out.println(max);
       return max;
        
    }
}