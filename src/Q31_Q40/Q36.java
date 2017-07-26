package Q31_Q40;

public class Q36 {
	public boolean isValidSudoku(char[][] board) {
		 boolean[][] used1 = new boolean[9][9];
		 boolean[][] used2 = new boolean[9][9];
		 boolean[][] used3 = new boolean[9][9];
		 int length = board.length;
		 for(int i=0; i<length; i++){
			 for(int j=0; j<length; j++){
				 char chess = board[i][j];
				 if(chess != '.'){
					 int num = Integer.parseInt(String.valueOf(chess))-1;
					 if(used1[i][num] || used2[j][num] || used3[i/3*3+j/3][num] )
						 return false;
					 used1[i][num] = used2[j][num] = used3[i/3*3+j/3][num] = true;
				 }
			 }
		 }
		 return true;
	}

}
