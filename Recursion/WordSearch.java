class WordSearch {
    public boolean exist(char[][] board, String word) {
        //your code goes here
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                // If the first character matches, start the search
                if (board[i][j] == word.charAt(0)) {
                    // If the word is found, return true
                    if (func(0, i, j, word, board)) {
                        return true;
                    }
                }
            }
        }
        // If the word is not found, return false
        return false;
    }

    boolean func(int ind, int i, int j, String word, char[][] board) {
        int row = board.length;
        int col = board[0].length;
        if(ind == word.length()) return true;
        if(i < 0 || j < 0 || i >= board.length || j >= board[0].length || word.charAt(ind) != board[i][j] || board[i] [j] == ' ' ) {
            return false;
        }
        char temp = board[i] [j];
        board[i][j] = ' ';
        

        boolean ans = func(ind+1, i -1, j, word, board ) 
        || func(ind+1, i+1, j, word, board)  
        || func(ind+1, i, j -1, word, board) 
        || func(ind+1, i, j + 1, word, board) ; 

        board[i][j] = temp;
        return ans;
    }
}