import java.util.*;
public class stackimplementation{
    private int[] stack;
    private int top=-1;
    int sz=0;
    public stackimplementation(int n){
        stack=new int[n];
    }
    public void push(int x)throws Exception{
        if(sz==stack.length){
            throw new Exception("overflow");
        }
        stack[top+1]=x;
        top++;
        sz++;
        
    }
    public int pop()throws Exception{
        if(sz==0){
            throw new Exception("underflow");
        }
        int r=stack[top];
        top--;
        sz--;
       
        return r;
    }
    public int peek()throws Exception{
        if(sz==0){
            throw new Exception("underflow");
        }
        return stack[top];
    }
    public boolean isempty(){
        return sz==0;
    }

}