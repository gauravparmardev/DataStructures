import java.util.HashMap;
import java.util.Map;

public class TopViewTree {

	static Map<Integer, Temp> map = new HashMap<Integer, Temp>();

	public static void main(String[] args) {
		Node20 root = new Node20(1);
		Node20 n1 = new Node20(2);
		Node20 n2 = new Node20(3);
		Node20 n3 = new Node20(4);
		Node20 n4 = new Node20(5);
		Node20 n5 = new Node20(6);
		Node20 n6 = new Node20(7);
		root.left = n1;
		root.right = n2;
		
		n1.left  = n3;
		n1.right = n4;
		
		n2.left = n5;
		n2.right = n6;
	
		traverse(root,0,0);
		
		for(Map.Entry<Integer, Temp> entry :map.entrySet()) {
			
			System.out.println(entry.getKey() + " " + entry.getValue().data);
		}
		
	}
	
	static void traverse(Node20 node, int horizontal, int depth){
		
		if(node == null) {
			return;
		}
		
			if(map.get(horizontal) == null) {
				Temp t1 = new Temp(node.data, depth);
				map.put(horizontal, t1);
			}else {
				Temp t1 = map.get(horizontal);
				if(t1.depth > depth) {
					t1 = new Temp(node.data, depth);
					map.put(horizontal, t1);
				}
				
			}
		
		traverse(node.left, horizontal -1, depth +1);
		traverse(node.right, horizontal +1, depth +1);
	
	}

}

class Temp{
	
	int data;
	int depth;
	
	Temp(int data, int depth){
		this.data = data;
		this.depth = depth;
	}
	
}


