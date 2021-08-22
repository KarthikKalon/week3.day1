package week3.day1;

public class Student {
	public void Studentinfo(int id) {
		// TODO Auto-generated method stub
       System.out.println("The Student id is " + id);
	}
	public void Studentinfo(int id,String name) {
		// TODO Auto-generated method stub
	       System.out.println("The Student id is " + id + " and The student name is "+ name);
		}
	public void Studentinfo(String email, long no) {
		// TODO Auto-generated method stub
       System.out.println("The Student email is " + email + "and the number is "+ no);
	}

public static void main(String[] args) {
	Student objstd=new Student();
	objstd.Studentinfo(45);
	objstd.Studentinfo(13, "Karthik");
	objstd.Studentinfo("karthik@gmail.com", 987654321);
}

}
