 public class Employee
{
     int age=21;
     String  name="Saurabh", city="Chennai";
 public void display()
   {
          
      System.out.println("My name is "+name);
      System.out.println("My age is "+age);
      System.out.println("My city is "+city);
   }

   public static void main(String args[])
    {
        Employee e=new Employee();
        e.display();
    }
 
}