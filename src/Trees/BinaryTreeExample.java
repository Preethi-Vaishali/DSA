package Trees;

/*class Node1{
	int item;
	Node left, right;
	public Node1(int key) {
		item = key;
		left = right = null;
	}
}*/
public class BinaryTreeExample {
Node root;
BinaryTreeExample(){
	root = null;
}
void inorder(Node node) {
	if(node == null)
		return;
	inorder(node.left);
	System.out.print(node.item + "->");
	inorder(node.right);
}
void preorder(Node node) {
	if(node == null)
		return;
	System.out.print(node.item + "->");
	preorder(node.left);
	preorder(node.right);
}
void postorder(Node node) {
	if(node == null)
		return;
	postorder(node.left);
	postorder(node.right);
	System.out.print(node.item + "->");
}
	public static void main(String[] args) {
		BinaryTreeExample tree = new BinaryTreeExample();
		tree.root = new Node(1);
		tree.root.left = new Node(12);
		tree.root.right = new Node(13);
		tree.root.left.left = new Node(6);
		tree.root.left.right = new Node(10);
		tree.root.left.left.left= new Node(2);
		tree.root.left.left.right = new Node(3);
		tree.root.right.left= new Node(8);
		tree.root.right.right = new Node(9);
		System.out.println("Inorder Traversal");
		tree.inorder(tree.root);
		System.out.println("\nPreorder Traversal");
		tree.preorder(tree.root);
		System.out.println("\nPostorder Traversal");
		tree.postorder(tree.root);
		
	}

}
