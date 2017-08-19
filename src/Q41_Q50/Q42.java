package Q41_Q50;

public class Q42 {
	public static void main(String[] args) {
		Q42 q = new Q42();
		int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
		System.out.println(q.trap(height));
	}
    public int trap(int[] height) {
    	int count = 0;
        for(int i=0; i<height.length-2; i++){
        	if(height[i] <= height[i+1])
        		continue;
        	//find the first larger or equal || find the first upwards trend
        	for(int j=i+1; j<height.length; j++){
        		if(height[j] >= height[i]){
        			count += calculate(height, i, j);
        			i=j-1;
        			break;
        		}
        	}
        }
    	return count;
    }

	private int calculate(int[] height, int i, int j) {
		// TODO Auto-generated method stub
		int min_h = height[i] > height[j] ? height[j] : height[i];
		int total = (j-i-1) * min_h;
		for(int a=i+1; a<j; a++)
			total -= height[a];
		return total;
	}
}
