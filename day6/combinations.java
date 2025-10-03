class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> li=new ArrayList<>();
        comb(n,k,1,li,ans);
        return ans;
    }
    public void comb(int n,int k,int in,List<Integer> li,List<List<Integer>> ans){
        if(k==0){
            ans.add(new ArrayList<>(li));
            return;
        }
        for(int i=in;i<=n;i++){
            li.add(i);
            comb(n,k-1,i+1,li,ans);
            li.remove(li.size()-1);
        }
    }
}