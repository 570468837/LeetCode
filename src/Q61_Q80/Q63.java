package Q61_Q80;

public class Q63 {
	public int uniquePathsWithObstacles(int[][] obstacleGrid) {
		int count = backtrack(obstacleGrid, 0, 0, 0);
		return count;
    }
	
	public int backtrack(int[][] obstacleGrid, int row, int col, int count){
		if(obstacleGrid[row][col] == 1)
			return count;
		if(row == obstacleGrid.length-1 && col == obstacleGrid[0].length-1 
				&& obstacleGrid[row][col]==0)
			return ++count;
		else{
			if(row+1 < obstacleGrid.length)
				count = backtrack(obstacleGrid, row+1, col, count);
			if(col+1 < obstacleGrid[0].length)
				count = backtrack(obstacleGrid, row, col+1, count);
		}
		return count;
	}
}
