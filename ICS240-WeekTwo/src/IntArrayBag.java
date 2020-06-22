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

