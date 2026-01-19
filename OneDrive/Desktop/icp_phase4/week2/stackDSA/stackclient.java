
public class stackclient{
    public static void main(String[] args)throws Exception{
        stackimplementation st=new stackimplementation(6);
        System.out.println(st.pop());
        System.out.println(st.isempty());
        st.push(9);
        st.push(8);
        st.push(6);
        System.out.println(st.pop());
        System.out.println(st.peek());
        System.out.println(st.isempty());
    }
}