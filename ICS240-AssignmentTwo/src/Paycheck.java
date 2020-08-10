
public class Paycheck implements Comparable <Paycheck> 
{
	private String checkName;
	private int checkAmount;
	
	public Paycheck() {
		this.checkName = "";
		this.checkAmount = 0;
	}
	
	public Paycheck(String checkName, int checkAmount) {
		this.checkName = checkName;
		this.checkAmount = checkAmount;
	}

	public String getCheckName() {
		return checkName;
	}

	public void setCheckName(String checkName) {
		this.checkName = checkName;
	}

	public int getCheckAmount() {
		return checkAmount;
	}

	public void setCheckAmount(int checkAmount) {
		this.checkAmount = checkAmount;
	}

	@Override
	public String toString() {
		return "Paycheck [checkName=" + checkName + ", checkAmount=" + checkAmount + "]";
	}
	
	public boolean equals(String s1) {
		if(this.getCheckName().equalsIgnoreCase(s1)) {
			return true;
		}
		return false;
	}
	public boolean equals(Paycheck p1) {
		if(this.getCheckName().equalsIgnoreCase(p1.getCheckName()) && this.getCheckAmount() == this.getCheckAmount()) {
			return true;
		}
		
		return false;
	}
	
	//breaking this down
	public int compareTo(Paycheck p1) {
/*
		//if the name this.name is Adam and p1 is Keith - it would ring -num so return -1 
		if(this.getCheckName().compareTo(p1.getCheckName()) < 0) {
			System.out.println("This is the -1");
			return -1;
		}
		//if the name this.name is Adam and p1 is Keith - it would ring -num so return 1 
		if(this.getCheckName().compareTo(p1.getCheckName()) > 0) {
			System.out.println("This is the 1");
			return 1;			
		}
		else {
			System.out.println("This is the 0");
			return 0;
		}
*/
		//if the name this.name is Adam and p1 is Keith - it would ring -num so return -1 
		if(this.getCheckName().compareTo(p1.getCheckName()) < 0) {
//			System.out.println("this.object: " + getCheckName() + " is before " + p1.getCheckName());
			if(this.getCheckAmount() < p1.getCheckAmount()) {
//				System.out.println("this.object: " + getCheckAmount() + " has less than " + p1.getCheckAmount());
				return -1;
			}
			if(this.getCheckAmount() > p1.getCheckAmount()) {
//				System.out.println("this.object: " + getCheckAmount() + " has more than " + p1.getCheckAmount());
				return 1;
			}
			else {
//				System.out.println("this.object: " + getCheckAmount() + " has the same amount " + p1.getCheckAmount());
				return 0;
			}
		}
		//if the name this.name is Adam and p1 is Keith - it would ring -num so return 1 
		if(this.getCheckName().compareTo(p1.getCheckName()) > 0) {
//			System.out.println("this.object: " + this.getCheckName() + " is after " + p1.getCheckName());
			if(this.getCheckAmount() < p1.getCheckAmount()) {
//				System.out.println("this.object: " + this.getCheckAmount() + " has less than " + p1.getCheckAmount());				
				return -1;
			}
			else if (this.getCheckAmount() > p1.getCheckAmount()) {
//				System.out.println("this.object: " + this.getCheckAmount() + " has more than " + p1.getCheckAmount());
				return 1;
			}else{
//				System.out.println("this.object: " + this.getCheckAmount() + " has the same amount " + p1.getCheckAmount());
				return 0;
			}			
		}
		//If the name are the same
		else {
			if(this.getCheckAmount() < p1.getCheckAmount()) {
//				System.out.println("The names are the same for both objects");
//				System.out.println("The amount of this.object " + this.getCheckAmount() + " is less than " + p1.getCheckAmount());
				return -1;
			}
			if(this.getCheckAmount() > p1.getCheckAmount()) {
//				System.out.println("The names are the same for both objects");
//				System.out.println("The amount of this.object " + this.getCheckAmount() + " is more than " + p1.getCheckAmount());
				return 1;
			}else{
//				System.out.println("The same name and amount");
				return 0;
			}
		}
	}//end of compareTo()
	
}//end of the class
