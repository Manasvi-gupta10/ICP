import java.util.*;

public class medium2{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        // for(int i=2;i<=n;i++){
        //     if(prime(i)){
        //         System.out.println(i);
        //     }
        // }
        allprimes(n);
    }
    public static void allprimes(int n){
        //1 means not prime
        int[] ar=new int[n+1];
        ar[0]=ar[1]=1;
        for(int i=2;i*i<=n;i++){
            if(ar[i]==0){
                for(int j=2;i*j<=n;j++){
                    ar[i*j]=1;
                }
            }
        }
        for(int i=0;i<=n;i++){
            if(ar[i]==0){
                System.out.println(i);
            }
        }

    } 
    public static boolean prime(int n){
        int c=0;
        for(int i=2;i<n;i++){
            if(n%i==0){
                c++;
            }
        }
        return c==0;
    }
}