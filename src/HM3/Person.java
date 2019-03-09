package HM3;

public abstract class Person
{
   private String name;
   private String dob;
   public abstract String getEmail();
   

   public Person(String name,String dob)
   {
      this.name = name;
      this.dob = dob;
   }

   public String getName()
   {
      return name;
   }
   public String getDob() 
   {
	return dob;
   }
}