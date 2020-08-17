

public class IntBSTLinkedBag {
	
	private IntBTNode root;
	
	//Part of Q4
	private int totalSum;
	private int counter;
	
	
	public IntBSTLinkedBag(){ 
		this.root = null;
	}
	
	public int size() { 
		return IntBTNode.treeSize(this.root); 
	}
	
	
	public void add(int element){
		
		//Create IntBTNode with data = element
		IntBTNode newNode = new IntBTNode(element,null,null);
		
		
		if (root == null) //if the tree is empty, the new node becomes the root
			root = newNode;
		else{
			
			//if the tree is not empty, start from the root and go down the tree 
			IntBTNode cursor = root;
			IntBTNode parentOfCursor = null;
			
			while (cursor != null){
				//need to keep track of parent of the new node
				parentOfCursor = cursor;
				if (element <= cursor.getData())
					cursor = cursor.getLeft();
				else
					cursor = cursor.getRight();
			}
			//at this point of time, the new element can be inserted as a child of parent
	
			if (element <= parentOfCursor.getData())
				parentOfCursor.setLeft(newNode);
			else
				parentOfCursor.setRight(newNode);
		}
		
		
	}
	
	//Answer for question 1
	public int maxValue() {
		IntBTNode cursor  = root;
		int find = cursor.getData();
		
		while (cursor != null) {
			if(cursor.getRight() ==  null) {
				return find; 
			}
			else {
				cursor = cursor.getRight();
				find = cursor.getData();
			}
		}		
		return find;
	}
	
	//Answer for question 2
	public boolean interiorNode(IntBTNode target) {
		IntBTNode cursor  = root;
		boolean inside = false;
		
		while ((cursor!=null) && (cursor != target)){
			if ( cursor.getData() > target.getData() && cursor.getLeft() != null) {
				cursor = cursor.getLeft();
				//check the next one going in so check right since we already went left
				if(cursor.getData() < target.getData() && cursor.getRight() != null) {
					cursor = cursor.getRight();
					if (cursor.getData() == target.getData()) {
						return inside = true;
					}
				}
			}
			else if ( cursor.getData() <= target.getData() && cursor.getRight() != null) {
				cursor = cursor.getRight();
				//checking the next one going in so check left since we already went right
				if (cursor.getData() > target.getData() && cursor.getLeft() != null){
					cursor = cursor.getLeft();
					if (cursor.getData() == target.getData()) {
						return inside = true;
					}
				}
			}
			else {
				return inside;
			}
		}		
		return inside;
	}
	
	//Answer for question 3
	public int height(IntBTNode target) {
		IntBTNode cursor  = root;
		int nodeHeight = 0;
		
		if (root == null) {
			return nodeHeight;
		}
		else{			
			while (cursor != null){
				//need to keep track of parent of the new node
				
				if (target.getData() <= cursor.getData() && cursor.getData() != target.getData()) {
					cursor = cursor.getLeft();
					nodeHeight++;
				}
				
				else if (target.getData() >= cursor.getData() && cursor.getData() != target.getData()) {
					cursor = cursor.getRight();
					nodeHeight++;
				}		
				else {
					return nodeHeight;
				}
					
			}
		}		
		return nodeHeight;
	}
	
	//Answer for question 4
	public void average() {
		totalSum = 0;
		counter = 0;
		int avg = 0;
		
		//dedicated for Right
		goLeft();
		goRight();
	
		
		avg = totalSum / counter;
		System.out.println("Counter " + counter);
		System.out.println("TOTAL Sum " + totalSum);
		System.out.println("The average is: " + avg);
	}
	
	//part of Q4
	public void goLeft() {
		IntBTNode cursor  = root;
		IntBTNode backTrack;
		
		while (cursor != null) {
			if(cursor.getLeft() !=  null) {
				backTrack = cursor;	
				counter++;
				if(cursor.getRight() !=  null) {
					cursor = cursor.getRight();
					totalSum += cursor.getData();
					cursor = backTrack;
				}
				else if(cursor.getLeft() != null) {
					cursor = cursor.getLeft();
					totalSum += cursor.getData();
					cursor = backTrack;
				}
			}
		}
	}
	
	public void goRight() {
		IntBTNode cursor  = root;
		IntBTNode backTrack;
		
		while (cursor != null) {
			if(cursor.getRight() !=  null) {
				backTrack = cursor;	
				counter++;
				if(cursor.getRight() !=  null) {
					cursor = cursor.getRight();
					totalSum += cursor.getData();
					cursor = backTrack;
				}
				else if(cursor.getLeft() != null) {
					cursor = cursor.getLeft();
					totalSum += cursor.getData();
					cursor = backTrack;
				}
				
			}
		}
		
	}
	
	
	public boolean remove(int target){
		
		IntBTNode cursor  = root;
		IntBTNode parentOfCursor = null;
		boolean output = true;
		
		while ((cursor!=null) && (cursor.getData()!= target)){
			parentOfCursor = cursor;
			if ( target < cursor.getData() )
				cursor = cursor.getLeft();
			else
				cursor = cursor.getRight();
		}
		
		//Case 1: if cursor is null, target is not found
		if (cursor == null)
			return false;
		else if (cursor.getLeft() == null){
			//case 2: if cursor is root, change root
			if (cursor == root)
				root = cursor.getRight();
			else{
				//case 3: replace cursor with its right subtree
				if (cursor == parentOfCursor.getLeft())
					parentOfCursor.setLeft(cursor.getRight());
				else
					parentOfCursor.setRight(cursor.getRight());
			}
				
		}else{
			//case 4: replace the cursor with the rightmost element in the left subtree
			cursor.setData(cursor.getLeft().getRightmostData());
			cursor.setLeft(cursor.getLeft().removeRightmost());
			
		}
			
		
		return output;
		
	}
	
	public void inorderTraversal(){
		if (root != null)
			root.inorderPrint();
	}
	
	public void postorderTraversal(){
		if (root !=null)
			root.postorderPrint();
	}
	
	public void preorderTraversal(){
		if (root !=null)
			root.preorderPrint();
	}
	

	public int countOccurrences(int value) {
		return countOccurrencesAux(this.root,value);
	}
	
	private int countOccurrencesAux(IntBTNode root, int value) {
    	if (root == null) 
    		return 0;
    	
    	int tempCount = 0;
    	if (root.getData() == value) 
    		tempCount = 1;
    	
    	return tempCount + countOccurrencesAux(root.getLeft(), value) +countOccurrencesAux(root.getRight(), value);
    }

	
	public String toString() {
		
		return toStringAux(this.root);
	}
	
	private String toStringAux(IntBTNode root) {
		
		if (root == null)
			return "";
		else {
			return toStringAux(root.getLeft()) + "\t" + root.getData() + "\t" + toStringAux(root.getRight());
		}
	}
	
}


	
	

	