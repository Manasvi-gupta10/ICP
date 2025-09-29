import java.util.*;
public class traversals
{
    public static void main(String[] args){
        int[][] ar={{1,2,3},{4,5,6,},{7,8,9}};
        wave(ar);
    }
    public static void rowwise(int[][] ar){
        for(int i=0;i<ar.length;i++){
            for(int j=0;j<ar[0].length;j++){
                System.out.print(ar[i][j]+"->");
            }
           
        }
    }
    public static void columnwise(int[][] ar){
        for(int i=0;i<ar[0].length;i++){
            for(int j=0;j<ar.length;j++){
                System.out.print(ar[j][i]+"->");
            }
            
        }
    }
    public static void reverse(int[][] ar){
        for(int i=ar.length-1;i>=0;i--){
            for(int j=ar[0].length-1;j>=0;j--){
                System.out.print(ar[i][j]+"->");
            }
            
        }
    }
    public static void spiral(int[][] ar){
        int sr=0,sc=0,ec=ar[0].length-1,er=ar.length-1;
        int tot=ar.length*ar[0].length;
        int c=0;
        while(c<tot){
            for(int i=sc;i<=ec;i++){
                System.out.print(ar[sr][i]+"->");
                c++;
            }
            sr++;
            for(int i=sr;i<=er;i++){
                System.out.print(ar[i][ec]+"->");
                c++;
            }
            ec--;
            for(int i=ec;i>=sc;i--){
                System.out.print(ar[er][i]+"->");
                c++;
            }
            er--;
            for(int i=er;i>=sr;i--){
                System.out.print(ar[i][sc]+"->");
                c++;
            }
            sc++;
        }
        
    }
    public static void wave(int[][] ar){
        int t=0;
        for(int i=0;i<ar.length;i++){
            if(t%2==0){
                for(int j=0;j<ar[0].length;j++){
                    System.out.print(ar[i][j]+"->");
                }
            }else{
                for(int j=ar[0].length-1;j>=0;j--){
                    System.out.print(ar[i][j]+"->");
                }
            }
            t++;
        }
    }
    

}
