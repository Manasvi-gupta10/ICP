import java.util.*;
public class medium1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] ar=new int[n];
        for(int i=0;i<n;i++){
            ar[i]=sc.nextInt();
        }
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        Arrays.sort(ar);
        for(int i=0;i<n;i++){
            if(i>0&&ar[i]==ar[i-1]){
                continue;
            }
            int l=i+1;
            int r=n-1;
            while(l<r){
                int s=ar[i]+ar[l]+ar[r];
                if(s==0){
                    ArrayList<Integer> ls=new ArrayList<>();
                    ls.add(ar[i]);
                    ls.add(ar[l]);
                    ls.add(ar[r]);
                    ans.add(ls);
                    l++;
                    r--;
                }else if(s<0){
                    l++;
                }else{
                    r--;
                }
            }
        }
        // for(int i=0;i<=n-3;i++){
        //     for(int j=i+1;j<n-2;j++){
        //         for(int k=j+1;k<n;k++){
        //             if(ar[i]+ar[j]+ar[k]==0){
        //                 ArrayList<Integer> ls=new ArrayList<>();
        //                 ls.add(ar[i]);
        //                 ls.add(ar[j]);
        //                 ls.add(ar[k]);
        //                 if(!ans.contains(ls)){
        //                     ans.add(ls);
        //                 }
        //             }
        //         }
        //     }
        // }
        System.out.println(ans);
    }
}