public class Lab3 {
	private double[] arr;
	private int manyItems;
	
	public Lab3() {
		this.arr =  new double[10];
		this.manyItems = 0;
	}
	
	public void add(double element) {
		arr[manyItems] = element;
		manyItems++;
	}
	
	public int size() {
		return this.manyItems;
	}
	
	public void sort() {
		//found the sort at 
		//https://stackoverflow.com/questions/13548619/java-sort-integer-array-without-using-arrays-sort
		 for (int i = 0; i < manyItems; i++) {
	        for (int j = i + 1; j < manyItems; j++) {
	            double tmp = 0;
	            if (arr[i] < arr[j]) {
	                tmp = arr[i];
	                arr[i] = arr[j];
	                arr[j] = tmp;
	            }
	        }
		 }
	}
	
	public void print() {
		for(int i=0; i< manyItems; i++){
		     System.out.print(arr[i] + " ");
		  }		
	}
	
	public static void main(String[] args) {
		Lab3 arr = new Lab3();
		
		arr.add(12);
		arr.add(14);
		arr.add(16);
		arr.add(23);
		arr.sort();
		
		arr.print();
	}

}
