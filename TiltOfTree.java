
public class TiltOfTree {
	
	static int tilt =0;

	public static void main(String[] args) {
		
		Node20 root = new Node20(4);
		Node20 n1 = new Node20(2);
		Node20 n2 = new Node20(9);
		Node20 n3 = new Node20(3);
		Node20 n4 = new Node20(5);
		Node20 n5 = new Node20(7);
		root.left = n1;
		root.right = n2;
		
		n1.left  = n3;
		n1.right = n4;
		
		n2.right = n5;
	
		int t=findTilt(root);
		System.out.println(tilt);
		
		
	}
	
	static int findTilt(Node20 node) {
		if(node ==null) {
			return 0;
		}
		
		int t1 = findTilt(node.left);
		int t2= findTilt(node.right);
		
		
		int temptilt = Math.abs(t1 - t2);
		
		tilt = tilt+temptilt;
		
		return t1+ t2+ node.data;
				
		
	}
	
	
	
	

}
