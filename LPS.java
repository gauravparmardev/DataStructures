
public class LPS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		   String s1 = "abcdcbaff";
		   
		   char [] arr1 = s1.toCharArray();
		   
		   System.out.println(lps(arr1, 0, arr1.length -1));
	}

	static int lps(char [] arr, int i , int j){
		if(i>j) {
			return 0;
		}
		
		if(arr[i] == arr[j]) {
			if(i==j)
				return 1+ lps(arr, i+1, j-1);
			else
				return 2+lps(arr, i+1, j-1);
		}else {
			
			return Math.max(lps(arr, i+1, j), lps(arr, i, j-1));
			
		}
		
	}
}
