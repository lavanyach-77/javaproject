package fees;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Userclass<T>
{
	T obj;
	void create(T obj)
	{
		this.obj=obj;
	}
	T getInstance()
	{
		return obj;
	}
}
public class Fees_management 
{
	InputStreamReader isr=null;
	BufferedReader buff=null;
	Accountant maccountant=null;
	Admin madmin=null;
	Student mstudent=null;
	boolean data=true;
	String userchoice;
	public static void main(String[] args) throws Exception {
   Fees_management fees=new Fees_management();
   fees.isr=new InputStreamReader(System.in);
   fees.buff=new BufferedReader(fees.isr);
   
   do
   {
	  User mUser= new User();
	  System.out.println("Welcome to fees management system\n");
	  System.out.println("Select the user type\n1 Admin\n2. Accountant\n3. Student");
	  String mUserChoice=fees.buff.readLine();
	  String mOperationChoice,continueChoice;
	  boolean type=true;
	  switch(Integer.parseInt(mUserChoice))
	  {
	  case 1:
		  Userclass<Admin> obj=new Userclass<Admin>();
	  obj.create(new Admin());
	  fees.madmin=obj.getInstance();
	  break;
	  case 2:
		  Userclass<Accountant> obj1=new Userclass<Accountant>();
	  obj1.create(new Accountant());
	  fees.maccountant=obj1.getInstance();
	  break;
	  case 3:
		  Userclass<Student> obj2=new Userclass<Student>();
	  obj2.create(new Student());
	  fees.mstudent=obj2.getInstance();
	  break;
	  }
   }while(fees.data);
   
	
	


	}

}
