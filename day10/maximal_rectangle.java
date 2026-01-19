class Solution {
    public int maximalRectangle(char[][] matrix) {
        int ans=0;
        int[] ar=new int[matrix[0].length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]=='1'){
                    ar[j]++;
                }else{
                    ar[j]=0;
                }
            }
            ans=Math.max(ans,large(ar));
        }
        return ans;
    }
    public int large(int[] ar){
        Stack<Integer> st=new Stack<>();
        int ans=0;
        for(int i=0;i<ar.length;i++){
            while(!st.isEmpty()&&ar[i]<ar[st.peek()]){
                int h=ar[st.pop()];
                int r=i;
                if(st.isEmpty()){
                    ans=Math.max(ans,h*r);
                }
                else{
                    int l=st.peek();
                    int area=h*(r-l-1);
                    ans=Math.max(ans,area);
                }
            }
            st.push(i);
        }
        

        int r=ar.length;
        while(!st.isEmpty()){
            int h=ar[st.pop()];
            if(st.isEmpty()){
                ans=Math.max(ans,h*r);
            }else{
                int l=st.peek();
                int area=h*(r-l-1);
                ans=Math.max(ans,area);
            }
        }
        return ans;
    }
}