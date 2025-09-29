import java.util.*;
public class to2d
{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] ar=new int[n];
        for(int i=0;i<n;i++){
            ar[i]=sc.nextInt();
        }
        int r=sc.nextInt();
        int c=sc.nextInt();
        int[][] ans=transform(ar,r,c);
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(ans[i][j]+" ");
            }
        }
    }
    public static int[][] transform(int[] ar,int r,int c){
        int[][] ans=new int[r][c];
        if(ar.length!=r*c){
            return ans;
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                ans[i][j]=ar[i*c+j];
            }
        }
        
        
        return ans;
    
    }
}
