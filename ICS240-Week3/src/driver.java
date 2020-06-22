
public class driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntArrayBag arr = new IntArrayBag();
		IntArrayBag arr2 = new IntArrayBag();
		
		arr.add(1);
		arr.add(13);
		arr.add(61);
		arr.add(16);
		arr.add(21);
		arr.add(67);
		arr.add(22);
		arr.add(9);
		arr.add(7);
		arr.add(15);

		arr2.add(1);
		arr2.add(13);
		arr2.add(61);
		
		System.out.println(arr.max());
		System.out.println(arr.min());
		System.out.println(IntArrayBag.sumEven(arr));
		System.out.println(arr.sumEvens());
		System.out.println(IntArrayBag.equalsTo(arr, arr2));
		System.out.println(arr.equalsTo(arr2));
		
	}

}
