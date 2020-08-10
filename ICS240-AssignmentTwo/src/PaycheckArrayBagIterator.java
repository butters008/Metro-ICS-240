import java.util.Iterator;

public class PaycheckArrayBagIterator implements Iterator<Paycheck> {
	private int cursor = 0;

	@Override
	//mimic the peek
	public boolean hasNext() {
		boolean output = false;
		if (cursor < manyItems) {
			output =  true;
		}	
		else{
			output = false;
		} 
		return output;

	}

	@Override
	public Paycheck next() {
		Paycheck output = data[cursor];
		cursor++;
		return output;

	}

}
