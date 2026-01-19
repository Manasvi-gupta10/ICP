class Solution {
    public int maxSubArray(int[] nums) {
        return maxsum(nums);
    }
    public static int maxsum(int[] ar){
        int n=ar.length;
        int ans=Integer.MIN_VALUE,sum=0;
        for(int i=0;i<n;i++){
                sum=sum+ar[i];
                ans=Math.max(ans,sum);
                if(sum<0){
                    sum=0;
                }
        }
        return ans;
    }
}