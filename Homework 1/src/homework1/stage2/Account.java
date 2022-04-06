package homework1.stage2;

public class Account {
	public double loan_value, rate;	
	public int account_type;
	public static final int	STANDARD=0, BUDGET=1, PREMIUM=2, SUPER_PREMIUM=3;
	
	public double loan() {
		return this.loan_value;
	}
	
	public double getRate() {
		return this.rate;
	}
	
	public String getAccountType() {
		String accountType;
		switch(this.account_type) {
	    	case 0:
	    		accountType = "STANDARD";
	    		break;
	    	case 1:
	    		accountType = "BUDGET";
	    		break;
	    	case 2:
	    		accountType = "PREMIUM";
	    		break;
	    	case 3:
	    		accountType = "SUPER_PREMIUM";
	    		break;
	    	default:
	    		throw new UnsupportedOperationException();
		}
		return accountType;
	}
	
	public double getMonthlyRate() {
		return this.loan()/this.getRate();
	}
	
	public double setValue(double value) throws Exception {
		if(value<0)
			throw new Exception();
		else
			return value;
	}
	
	public int setAccountType(int value) throws Exception {
		if(value<0||value>3)
			throw new Exception();
		else
			return value;
	}
	
	public double setRate(double value) throws Exception {
		if(value<0)
			throw new Exception();
		else
			return value;
	}
	
	public String showAccountDetails() {
		return "Loan Value: "+this.loan()+"; Monthly rate: "+this.getRate()+"; Number of months: "+this.getMonthlyRate()+"; Type: "+this.getAccountType()+"; "
				+ "Total fee: " +this.calculate()+";";
	}

	public double calculate(){
		double totalFee=0.0;
		
		if(this.account_type==PREMIUM || this.account_type==SUPER_PREMIUM)	
				totalFee+=.0125	* this.loan_value;
		
		return totalFee;
	}

	public Account(double value, double rate, int account_type) throws Exception{
		this.loan_value = this.setValue(value);
		this.rate = this.setRate(rate);
		this.account_type = this.setAccountType(account_type);
	}
}
