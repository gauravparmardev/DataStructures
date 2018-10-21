
public class KnapSackDP {

	public static void main(String[] args) {
        int val[] = new int[]{60, 100, 120};
        int wt[] = new int[]{10, 20, 30};
        int  W = 50;
        
        int [][] results = new int [val.length+1][W+1]; 
        
        for(int i=1; i <= val.length; i++) {
        	for(int j=1; j<=W; j++) {
        		
        		int v1=0;
        	
        		if(j-wt[i-1]>= 0) {
        			 v1 = val[i-1] + results[i-1][j-wt[i-1]];
        		}
        		int v2 = results[i-1][j];
        		
        		results[i][j] =  Math.max(v1, v2);
        	
        	}
        	
        }
        
//        for(int i=0; i <= val.length; i++) {
//        	for(int j=0; j<=W; j++) {
//        		System.out.print(results[i][j]);
//        		System.out.print(" ");
//        	}
//        	System.out.println("");
//        }

        System.out.println(results[val.length][W]);
        
	}

}
