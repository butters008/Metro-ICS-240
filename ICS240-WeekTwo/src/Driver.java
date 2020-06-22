
public class Driver {

	public static void main(String[] args) {
		IntArrayBag bag1 = new IntArrayBag(20);
		
		System.out.println(bag1);
		
		bag1.add(54);
		bag1.add(44);
		bag1.add(34);
		
		System.out.println(bag1);
		
		bag1.remove(54);
		
		System.out.println(bag1);
		
		assert 5 != 5;

	}

}
