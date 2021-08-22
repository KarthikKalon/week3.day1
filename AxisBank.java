package week3.day1;

public class AxisBank {
	public void deposit() {
		// TODO Auto-generated method stub
       System.out.println(" The money is deposited");
	}

	
	public static void main(String[] args) {
		Bankinfo objb=new Bankinfo();
		objb.saving();
		objb.fixed();
		objb.deposit();
		AxisBank obja=new AxisBank();
		obja.deposit();
	}
}


