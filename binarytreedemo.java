package treedemo;



public class binarytreedemo {
	Node root; // reference node
	
	class Node{
		int data;
		Node left, right; // reference variable for the left and right node
		
		public Node(int d) {
		data = d;
		left = null;
		right = null;
		
	}

}
	public binarytreedemo(int d) { // from main
	root = new Node(d); // new node is allocated in memory with value of 10.// once new is given reference memory root carries the value of d
}
	public void insertLeft(Node root, int val) { // new node has to be created on the left and carry the value. // since value is going to be given, it calls line 13 to 16
		Node newNode = new Node(val); // Node  =10
		root.left = newNode;
	}
	public void insertRight(Node root,int val) {
		Node newNode = new Node(val);
		root.right = newNode;
		
}
	public static void preorder(Node root) {
		if(root!=null) { //no nodes available
			System.out.print(root.data + " ");
		    preorder(root.left);
		    preorder(root.right);
		}
		    
	}


public static void inorder(Node root) {
	if(root!=null) { //no nodes available
		inorder(root.left);
	System.out.print(root.data + " ");
	    inorder(root.right);
	}
	    
}


public static void postorder(Node root) {
	if(root!=null) { //no nodes available
		postorder(root.left);
	    postorder(root.right);
	    System.out.print(root.data + " ");
	}
	    
}

public static void main(String[] args) {
	binarytreedemo tree = new binarytreedemo(10); // 10 is root
	tree.insertLeft(tree.root,5); // assign 5 to the left of root 10
	tree.insertRight(tree.root,15);
	tree.insertLeft(tree.root.left,3);
	tree.insertRight(tree.root.left,8);
	tree.insertLeft(tree.root.right,12);
	
	binarytreedemo.preorder(tree.root);
	System.out.println();
	binarytreedemo.inorder(tree.root);
	System.out.println();
	binarytreedemo.postorder(tree.root);
	System.out.println();
}
}