
public class LowestCommonAncestor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node9 root = new Node9(1);
		root.left = new Node9(2);
		root.right = new Node9(3);
		
		root.left.left = new Node9(4);
		root.left.right = new Node9(5);
		
		root.right.left = new Node9(6);
		root.right.right = new Node9(7);
		
		Node9 n = lca(root, 6,7);
		System.out.println(n.data);
		
	}
	
	
	static Node9 lca(Node9 root, int i, int j) {
		if(root == null) {
			return null;
		}
		if(root.data == i || root.data == j) {
			return root;
		}else {
			Node9 n1 = lca(root.left, i, j);
			Node9 n2 = lca(root.right, i,j);
			
			if(n1 != null && n2 != null) {
				return root;
			}else if(n1 != null) {
				return n1;
			}else if(n2 != null) {
				return n2;
			}else 
				return null;
			
			
		}
		
	}
}

class Node9{
	
	Node9 left;
	Node9 right;
	
	int data;
	
	Node9(int data){
		this.data = data;	
	}
}
