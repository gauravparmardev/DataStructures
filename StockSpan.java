import java.util.*;

public class StockSpan {

	
	public static void main(String[] args) {
		
		int arr [] = {10, 4, 5, 90, 120, 80};
		
		for (int i : findStockSpan(arr)) {
			System.out.println(i);
		}
		
 
	}
	
	public static int [] findStockSpan(int [] arr) {
		
		LinkedList<Node> stack = new LinkedList<Node>();
		
		
		int count = 0;
		int len = arr.length;
		int [] result = new int[len];

		for(int i : arr) {
			Node n = new Node(i,count);
			if(count == 0) {
				stack.push(n);
				result[count] = 1;
			}else if (i < stack.peek().value){
				stack.push(n);
				result[count] = 1;
			}else {
				while(stack.peek() != null && stack.peek().value < i ) {
					stack.pop();
				}
				
				if(stack.size() == 0) {
					result[count] = count+1;
				}else {
				
				result[count] = count - stack.peek().position;}
				stack.push(n);

			}
			++count;

		}
		
		return result;
	}

}


class Node{
	int value;
	int position;
	 Node(int val, int pos){
		 value = val;
		 position = pos;
	 }
	
}