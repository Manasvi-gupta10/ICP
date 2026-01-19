import java.util.*;
public class easy2{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String haystack=sc.next();
        String needle=sc.next();
        System.out.println(fun(haystack,needle));
    }
     public static int fun(String haystack, String needle) {
        int h=haystack.length();
        int n=needle.length();
        if(h<n){
            return -1;
        }
        
        StringBuilder sb=new StringBuilder();
        for(int in=0;in<n;in++){
            sb.append(haystack.charAt(in));
        }
        if(sb.toString().equals(needle)){
            return 0;
        }
        for(int i=n;i<h;i++){
            sb.append(haystack.charAt(i));
            sb.deleteCharAt(0);
            if(sb.toString().equals(needle)){
            return i-n+1;
        }
        }
        return -1;
    }
}