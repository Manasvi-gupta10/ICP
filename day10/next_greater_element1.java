class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;
        int[] ans=new int[n1];
        int[] temp=new int[n2];
        Stack<Integer> st=new Stack<Integer>();
        for(int i=0;i<n2;i++){
            while(!st.isEmpty()&&nums2[i]>nums2[st.peek()]){
                temp[st.pop()]=nums2[i];
            }
            st.push(i);
        }
        while(!st.isEmpty()){
            temp[st.pop()]=-1;
        }
        for(int i=0;i<n1;i++){
            for(int j=0;j<n2;j++){
                if(nums2[j]==nums1[i]){
                    ans[i]=temp[j];
                }
            }
        }
        return ans;

    }
}