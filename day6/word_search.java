class Solution {
    public boolean exist(char[][] board, String word) {
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
               if(board[i][j]==word.charAt(0)){
                   boolean ans=search(board,word,i,j,0);
                   if(ans==true){
                    return true;
                   }
               }
            }
        }
        return false;
    }
    public boolean search(char[][] board,String word,int cr,int cc,int id){
        if(id==word.length()){
           return true;
        }
        if(cr<0||cr>=board.length||cc<0||cc>=board[0].length||board[cr][cc]!=word.charAt(id)){
            
            return false;
        }
        int[] r={-1,0,1,0};
        int[] c={0,-1,0,1};
        board[cr][cc]='*';
        for(int i=0;i<r.length;i++){
            boolean ans=search(board,word,cr+r[i],cc+c[i],id+1);
                if(ans==true){
                    return true;
                }
            
        }
        board[cr][cc]=word.charAt(id);
        return false;
    }
}