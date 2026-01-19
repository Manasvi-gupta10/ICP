import java.util.Scanner;

public class easy1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ar=new int[n];
        for(int i=0;i<n;i++){
            ar[i]=sc.nextInt();

        }
        int ans=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(ar[i]<ar[j]){
                    ans=Math.max(ans,ar[j]-ar[i]);
                }
            }
        }
        // int mn=ar[0];
        // for(int i=1;i<n;i++){
        //     if(ar[i]<mn){
        //         mn=ar[i];
        //     }else{
        //         ans=Math.max(ans,ar[i]-mn);
        //     }
        // }
        System.out.println(ans);
    }
}
