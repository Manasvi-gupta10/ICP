import java.util.*;
public class helpclassmates
{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] ar=new int[n];
        for(int i=0;i<n;i++){
            ar[i]=sc.nextInt();
            
        }
        int[] re=new int[n];
        Arrays.fill(re,-1);
        Stack<Integer> st=new Stack<Integer>();
        for(int i=0;i<n;i++){
            while(!st.isEmpty()&&ar[st.peek()]>ar[i]){
                re[st.pop()]=ar[i];
            }
            st.push(i);
        }
        for(int i=0;i<n;i++){
            System.out.println(re[i]);
            
        }
    }
}
