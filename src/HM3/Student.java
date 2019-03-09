package HM3;
import java.text.*;

import javax.xml.soap.Text;

public class Student extends Person
{
	
   private String email,major;
   private int id;
   
	    private  Student(int id,String name,String dob, String email,String major){
	      // pass n to superclass constructor
	      super(name,dob);
	      this.id=id;
	      Major temp = Enum.valueOf(Major.class, major);
	      this.email = email;
	      this.major = temp.getMajor();
	    }
	    public static Student getInstanst(int id,String name,String dob, String email,String major) {
		Student student = new Student(id,name, dob, email, major);
		   return student;
	    }
		public String getEmail() {
			return email;
		}
		public String getMajor() {
			return major;
		}
		public int getId() {
		return id;
	}
}
