class Solution {
    public boolean exist(char[][] board, String word) {
        return canSearch(board,word);
    }
    static boolean canSearch(char[][] board,String word){
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]==word.charAt(0)){
                    if(canPlace(board,word,1,i,j)){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    static boolean canPlace(char[][] board,String word,int ind,int i,int j){
        if(ind==word.length()){
            return true;
        }
        char temp=board[i][j];
        board[i][j]='#';
        //up direction
        if(i-1>=0 && board[i-1][j]==word.charAt(ind)){
            if(canPlace(board,word,ind+1,i-1,j)){
                board[i][j]=temp;
                return true;
            }
        }
        //down direction
        if(i+1<board.length && board[i+1][j]==word.charAt(ind)){
            if(canPlace(board,word,ind+1,i+1,j)){
                board[i][j]=temp;
                return true;
            }
        }
        //right direction
        if(j+1<board[0].length && board[i][j+1]==word.charAt(ind)){
            if(canPlace(board,word,ind+1,i,j+1)){
                board[i][j]=temp;
                return true;
            }
        }
        //left direction
        if(j-1>=0 && board[i][j-1]==word.charAt(ind)){
            if(canPlace(board,word,ind+1,i,j-1)){
                board[i][j]=temp;
                return true;
            }
        }
        board[i][j]=temp;
        return false;
    }
}