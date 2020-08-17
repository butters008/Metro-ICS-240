
public class Paycheck implements Comparable <Paycheck> 
{
	private String paycheckName;
	private int paycheckAmount; //aggregate
	//private int cursor;

	public Paycheck(String paycheckName, int paycheckAmount) {
		this.paycheckName = paycheckName;
		this.paycheckAmount = paycheckAmount;
	}

	public Paycheck() {
		// TODO Auto-generated constructor stub
	}


	public String getPaycheckName() {
		return paycheckName;
	}

	public void setPaycheckName(String paycheckName) {
		this.paycheckName = paycheckName;
	}

	public int getPaycheckAmount() {
		return paycheckAmount;
	}

	public void setPaycheckAmount(int paycheckAmount) {
		this.paycheckAmount = paycheckAmount;
	}

	
	public String toString() {
		return "Paycheck [" + paycheckName + " , " + paycheckAmount + "]";
	}
	
	public boolean equals(Paycheck p1) {
		if(this.getPaycheckName().equalsIgnoreCase(p1.getPaycheckName()) && this.getPaycheckAmount() == this.getPaycheckAmount()) {
			return true;
		}
		
		return false;
	}

	@Override
	public int compareTo(Paycheck compareObj) {
		//if the name this.name is Adam and p1 is Keith - it would ring -num so return -1 
		if(this.getPaycheckName().compareTo(compareObj.getPaycheckName()) < 0) {
			System.out.println("This is the -1");
			return -1;
		}
		//if the name this.name is Adam and p1 is Keith - it would ring -num so return 1 
		if(this.getPaycheckName().compareTo(compareObj.getPaycheckName()) > 0) {
			System.out.println("This is the 1");
			return 1;			
		}
		else {
			System.out.println("This is the 0");
			if(this.getPaycheckAmount() > compareObj.getPaycheckAmount()) {
				return 1;							
			}
			else if(this.getPaycheckAmount() < compareObj.getPaycheckAmount()) {
				return -1;
			}
			else {
				return 0;				
			}
		}
		
	}
	
}//end of the class
