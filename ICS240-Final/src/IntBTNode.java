
/*

public class IntBTNode {

	private int data;
	private IntBTNode left;
	private IntBTNode right;

	
	public IntBTNode(int initialData, IntBTNode initialLeft, IntBTNode initialRight) {
		this.data = initialData;
		this.left = initialLeft;
		this.right = initialRight;
	}

	

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public IntBTNode getLeft() {
		return left;
	}

	public void setLeft(IntBTNode left) {
		this.left = left;
	}

	public IntBTNode getRight() {
		return right;
	}

	public void setRight(IntBTNode right) {
		this.right = right;
	}


	public int getLeftmostData() {
		if (left == null)
			return data;
		else
			return left.getLeftmostData();
	}


	public int getRightmostData() {
		if (right == null)
			return data;
		else
			return right.getRightmostData();
	}


	public boolean isLeaf() {
		return (this.left == null) && (this.right == null);
	}


	public static int treeSize(IntBTNode root) {
		if (root == null)
			return 0;
		else
			return 1 + treeSize(root.left) + treeSize(root.right);
	}

	public static IntBTNode treeCopy(IntBTNode root) {
		
		if ( root == null)
			return null;
		else {
			IntBTNode leftCopy = treeCopy(root.left);
			IntBTNode rightCopy = treeCopy(root.right);
			return new IntBTNode(root.data,leftCopy,rightCopy);
		}
	}
	
	public void preorderPrint() {
		System.out.print(this.data + "\t");
		if (left != null)
			left.preorderPrint();
		if (right != null)
			right.preorderPrint();
	}

	
	public void postorderPrint() {
		if (left != null)
			left.postorderPrint();
		if (right != null)
			right.postorderPrint();

		System.out.print(this.data + "\t");
	}

	
	public void inorderPrint() {
		if (left != null)
			left.inorderPrint();
		System.out.print(data + "\t");
		if (right != null)
			right.inorderPrint();
	}


	public IntBTNode removeRightmost() {

		if (right == null)
			// the right most node is at the root becuase there is no right child
			return left;
		else {
			// a recursive call removes the rightmost node if my own right child
			right = right.removeRightmost();
			return this;
		}

	}
	
	public IntBTNode removeLeftmost() {

		if (left == null)
			// the right most node is at the root becuase there is no right child
			return right;
		else {
			// a recursive call removes the rightmost node if my own right child
			left = left.removeLeftmost();
			return this;
		}

	}
	
	public int treeSum() {

		if (isLeaf())
			return this.getData();
		else
			return this.getData() + this.getLeft().treeSum() + this.getRight().treeSum();
	}
}
*/




public class IntBTNode {

	private int data;
	private IntBTNode left;
	private IntBTNode right;

	
	public IntBTNode(int initialData, IntBTNode initialLeft, IntBTNode initialRight) {
		this.data = initialData;
		this.left = initialLeft;
		this.right = initialRight;
	}

	

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public IntBTNode getLeft() {
		return left;
	}

	public void setLeft(IntBTNode left) {
		this.left = left;
	}

	public IntBTNode getRight() {
		return right;
	}

	public void setRight(IntBTNode right) {
		this.right = right;
	}


	public int getLeftmostData() {
		if (left == null)
			return data;
		else
			return left.getLeftmostData();
	}


	public int getRightmostData() {
		if (right == null)
			return data;
		else
			return right.getRightmostData();
	}


	public boolean isLeaf() {
		return (this.left == null) && (this.right == null);
	}


	public static int treeSize(IntBTNode root) {
		if (root == null)
			return 0;
		else
			return 1 + treeSize(root.left) + treeSize(root.right);
	}

	public static IntBTNode treeCopy(IntBTNode root) {
		
		if ( root == null)
			return null;
		else {
			IntBTNode leftCopy = treeCopy(root.left);
			IntBTNode rightCopy = treeCopy(root.right);
			return new IntBTNode(root.data,leftCopy,rightCopy);
		}
	}
	
	public void preorderPrint() {
		System.out.print(this.data + "\t");
		if (left != null)
			left.preorderPrint();
		if (right != null)
			right.preorderPrint();
	}

	
	public void postorderPrint() {
		if (left != null)
			left.postorderPrint();
		if (right != null)
			right.postorderPrint();

		System.out.print(this.data + "\t");
	}

	
	public void inorderPrint() {
		if (left != null)
			left.inorderPrint();
		System.out.print(data + "\t");
		if (right != null)
			right.inorderPrint();
	}


	public IntBTNode removeRightmost() {

		if (right == null)
			// the right most node is at the root becuase there is no right child
			return left;
		else {
			// a recursive call removes the rightmost node if my own right child
			right = right.removeRightmost();
			return this;
		}

	}
	
	public IntBTNode removeLeftmost() {

		if (left == null)
			// the right most node is at the root becuase there is no right child
			return right;
		else {
			// a recursive call removes the rightmost node if my own right child
			left = left.removeLeftmost();
			return this;
		}

	}
	
	public int treeSum() {

		if (isLeaf())
			return this.getData();
		else
			return this.getData() + this.getLeft().treeSum() + this.getRight().treeSum();
	}
}

