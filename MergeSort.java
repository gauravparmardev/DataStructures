
public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {6,8,4,10,1,7,3,100, 56,33,109,106,567};

		splitsort(arr, 0, arr.length -1);
		for(int g: arr) {
			System.out.println(g);
		}
		
	}
	
	public static void splitsort(int [] arr, int i, int j) {
		
		if(i == j) {
			return;
		}
		
		int diff = j -i;
		int end1 = i + diff/2;
		int start2 = end1+1;
		
		splitsort(arr, i, end1);
		splitsort(arr, start2, j);
		
		sort(arr, i, end1, start2, j);
		
	}
	
	
	public static void sort(int [] arr, int i, int end1, int start2, int j) {
		
		int i_start = i;
		int j_start = j;
		int temp [] = new int [j-i+1];
		int k=0;
		
		while(i<= end1 && start2 <= j) {
			
			if(arr[i] < arr[start2]) {
				temp[k] = arr[i];
				++ i;
				++k;
			}else {
				temp[k] = arr[start2];
				++start2;
				++k;
			}
		}
		
		if(i<=end1) {
			while(i <= end1) {
				temp[k] =arr[i];
				++i;
				++k;
			}
			
		}
		
		if(start2<= j) {
			while(start2 <= j) {
				temp[k] = arr[start2];
				++ start2;
				++k;
			}
			
		}
		
		for(int item: temp) {
			arr[i_start] = item;
			++i_start; 
		}
		
		
		
	}

}
