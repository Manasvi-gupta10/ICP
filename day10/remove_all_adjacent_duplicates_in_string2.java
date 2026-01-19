class Solution {
    public String removeDuplicates(String s, int k) {
        int n=s.length();
        Stack<Character> st=new Stack<>();
        Stack<Integer> count=new Stack<>();//storing occurence of each character
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(!st.isEmpty()&&ch==st.peek()){
                count.push(count.pop()+1);//lagatar mila toh uska ji previous occurence tha usko htke +1 usme add krk daal rhe
            }else{//ny elem toh usko add aur uske liye 1
                st.push(ch);
                count.push(1);
            }
            if(count.peek()==k){//k bar agye toh us char ko htado aur uske corresponding count ko
                st.pop();
                count.pop();
            }
        }
        StringBuilder sb=new StringBuilder();
        while(!st.isEmpty()){
            char ch=st.pop();
            int ocur=count.pop();
            while(ocur>0){
                sb.append(ch);
                ocur--;
            }
        }
        sb.reverse();
        return sb.toString();
    }
}