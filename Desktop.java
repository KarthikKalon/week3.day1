package org.system;

public class Desktop extends ComputerModel{
	public void desktopSize()  {
		// TODO Auto-generated method stub
        System.out.println("The size of desktop is given");
        
	}
  
	public static void main(String[] args) {
		ComputerModel objcom=new ComputerModel();
		objcom.computermodel();
		Desktop desk=new Desktop();
		desk.computermodel();
		desk.desktopSize();
}

}
