
public class BagDriver {

	public static void main(String[] args) {
		
//		IntBTNode n1 = new IntBTNode(10,null,null);
//		IntBTNode n2 = new IntBTNode(5,null,null);
//		IntBTNode n3 = new IntBTNode(3,n1,n2);
//		IntBTNode n4 = new IntBTNode(7,null,null);
//		IntBTNode n5 = new IntBTNode(8,n4,n3);
//		IntBTNode n6 = new IntBTNode(1,null,null);
//		IntBTNode root = new IntBTNode(4,n5,n6);
		
		
//		System.out.println("Inorder: ");
//		root.inorderPrint();
//		System.out.println("\nPreorder: ");
//		root.preorderPrint();
//		System.out.println("\nPostorder: ");
//		root.postorderPrint();
//		System.out.println();
		
//		IntBTNode copy = IntBTNode.treeCopy(root);
//		
//		System.out.println("\n Tree Copy inorder: ");
//		copy.inorderPrint();
//		
//		
//		System.out.println("Size "+IntBTNode.treeSize(root));
//		System.out.println("Left most item: "+root.getLeftmostData());
//		System.out.println("Right most item: "+root.getRightmostData());
//		
//		System.out.println(root.treeSum());
		
		
		
		IntBSTLinkedBag b = new IntBSTLinkedBag();
		IntBTNode nb1 = new IntBTNode(11,null,null);
		
		
		b.inorderTraversal();
		
		b.add(10);
		b.add(20);
		b.add(5);
		b.add(3);
		b.add(11);
//		b.add(12);
		b.add(30);
//		b.postorderTraversal();
		b.preorderTraversal();
		System.out.println("\n");
//		b.inorderTraversal();
//		System.out.println(b);
//		
//		System.out.println();
//		
//		System.out.println(b.countOccurrences(10));
//		
//		b.remove(3);
		System.out.println("\n");
		
//		System.out.println(b);
//		System.out.println("The Max leaf is: " + b.maxValue());
		System.out.println(b.interiorNode(nb1));
		System.out.println(b.height(nb1));
		b.average();
		
		

	}

}
