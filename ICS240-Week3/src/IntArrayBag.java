/**
 * @author Thanaa Ghanem
 * 
 *         Invariant of this bag implementation:
 * 
 *         1- The number of items contained in the bag is stored in an instance
 *         variable called manyItems 2- The bag entries are stored in an
 *         instance array variable called data, from position data[0] to
 *         position data[manyItems-1]
 *
 */
//This was taken from the class ICS240 - Did not write this
/*
 * Added the follow methods
 * public int max()
 * public int min() //extra credit
 * public static void sumEven()
 * public boolean equalsTo()
 * public static boolean equalsTo()
 */
public class IntArrayBag{

	private int[] data;
	private int manyItems;

	/**
	 * instianties a bag with a defualt size of 10
	 */
	public IntArrayBag() {
		this.data = new int[10];
		this.manyItems = 0;
	}

	/**
	 * instantiates a bag with a given capacity
	 * 
	 * @param capacity
	 *            -- required bag's capacity
	 */
	public IntArrayBag(int capacity) {
		this.data = new int[capacity];
		this.manyItems = 0;
	}

	/**
	 * @param element
	 *            -- value to be added to the bag
	 */
	public void add(int element) {
			data[manyItems] = element;
			manyItems++;
		
	}

	/**
	 * removes only one occurrence of element
	 * 
	 * @param element
	 *            -- value to be removed
	 * @return true or false based on whether an element is removed or not.
	 */
	public boolean remove(int element) {

		boolean found = false;

		for (int i = 0; i < manyItems; i++)
			if (data[i] == element) {
				data[i] = data[manyItems - 1];
				this.manyItems--;
				found = true;
				break;
			}

		return found;
	}

	/**
	 * 
	 * @return the number of elements in the bag.
	 */
	public int size() {
		return this.manyItems;
	}

	/**
	 * 
	 * @param index
	 *            --
	 * @return bag element that is located at index
	 */
	public int grab(int index) {

		int output = -1;
		if (index < this.manyItems)
			output = this.data[index];

		return output;
	}

	/**
	 * 
	 * @param target
	 *            -- value to count
	 * @return how many times target exist in the bag
	 */
	public int countOccurances(int target) {

		int count = 0;

		for (int i = 0; i < this.manyItems; i++)
			if (data[i] == target)
				count++;

		return count;
	}
	
	//data[] - manyItems
	public int max() {
		if(manyItems > 0) {
			int temp = data[0];	
			for (int i = 1; i < manyItems; i++) {
				if(data[i] > temp) {
					temp = data[i];
				}
			}
			return temp;
		}
		else {
			return -1;
		}
	}
	
	public int min() {
		if(manyItems > 0) {
			int temp = data[0];	
			for (int i = 1; i < manyItems; i++) {
				if(data[i] < temp) {
					temp = data[i];
				}
			}
			return temp;
		}
		else {
			return -1;
		}
	}
	
	public static int sumEven(IntArrayBag data) {
		int temp = 0;	
		for (int i = 0; i < data.size(); i++) {
			if(data.grab(i) % 2 == 0) {
				temp += data.grab(i);
			}
		}
		return temp;
	}
	
	public int sumEvens() {
		int temp = 0;	
		for (int i = 0; i < manyItems; i++) {
			if(data[i] % 2 == 0) {
				temp += data[i];
			}
		}
		return temp;
	}
	
	public static boolean equalsTo(IntArrayBag bag1, IntArrayBag bag2) {
		if(bag1.size() == bag2.size()) {
			return true;
		}else {
			return false;	
		}
	}
	
	public boolean equalsTo(IntArrayBag bag1) {
		if(this.size() == bag1.size()) {
			return true;
		}else {
			return false;	
		}
	}
	
	/**
	 * returns a string representation of the bag
	 */
	public String toString() {

		String output = "[";

		for (int i = 0; i < this.manyItems; i++)
			output += this.data[i] + ",";

		output += "]";

		return output;
	}


}


