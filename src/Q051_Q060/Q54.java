package Q051_Q060;

import java.util.ArrayList;
import java.util.List;

public class Q54 {
	public static void main(String[] args){
		int[][] matrix = {{2,3}};
		new Q54().spiralOrder(matrix);
	}
	
	public List<Integer> spiralOrder(int[][] matrix) {
		List<Integer> res = new ArrayList<Integer>();
		if(matrix.length == 0)
			return res;
		int row_begin = 0, col_begin = 0;
		int row_end = matrix.length-1;
		int col_end = matrix[0].length-1;
		
		while(row_begin <= row_end && col_begin <= col_end){
			int i = row_begin, j = col_begin;
			for(j = col_begin; j<=col_end; j++){
				res.add(matrix[i][j]);
			}
			j--;
			row_begin++;
			for(i = row_begin;i<=row_end; i++){
				res.add(matrix[i][j]);
			}
			i--;
			col_end--;
			for(j = col_end;j>=col_begin; j--){
				res.add(matrix[i][j]);
			}
			j++;
			row_end--;
			for(i = row_end;i>=row_begin; i--){
				res.add(matrix[i][j]);
			}
			i++;
			col_begin++;
		}
		return res;
    }
}
