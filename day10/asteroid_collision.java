class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        int n=asteroids.length;
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++){
            boolean isdestroy=false;//abhi ith wla asteroid destry ni hua
            while(!st.isEmpty()&&asteroids[i]<0&&st.peek()>0){//possible ek case jisme collision hoga jb peek wla right m aur current wla left m jarha hoga
                if(Math.abs(st.peek())<Math.abs(asteroids[i])){//agr peek wla chota toh wo explode hojayega toh peek wla remove
                    st.pop();
                    continue;//kyuki current k ni pta abhi isiliye continue
                }else if(Math.abs(st.peek())==Math.abs(asteroids[i])){//agr current wla equal hogya peek ke toh dono explode toh phla wla pop
                    st.pop();
                }
                isdestroy=true;//ab wo equal wli condition ayi tbhi yha tk aye mtln current wla bhi explode hogya toh true
                break;
            }
            if(!isdestroy){//agr destroy n hua false toh add kro
                st.push(asteroids[i]);
            }
        }
        int[] ans=new int[st.size()];
        for(int i=st.size()-1;i>=0;i--){
            ans[i]=st.pop();
        }
        return ans;
    }
}