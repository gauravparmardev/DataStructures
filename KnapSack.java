
public class KnapSack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        int val[] = new int[]{60, 100, 120};
        int wt[] = new int[]{10, 20, 30};
        int  W = 50;
        System.out.println(getMaxValue(val, wt, val.length -1 , W));
	
	}
	
	static int getMaxValue(int [] val, int [] wt, int i, int w) {
		
		if(i<0) {
			return 0;
		}
		int v1 =0;
		if(w-wt[i]>= 0) {
			v1 = val[i] + getMaxValue(val, wt, i-1, w-wt[i]);
		}
		int v2 = getMaxValue(val, wt, i-1, w);
		
		return Math.max(v1, v2);
	}
	
	

}
