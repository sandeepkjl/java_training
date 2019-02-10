import java.util.ArrayList;
import java.util.Iterator;

public class EmployeeDB {
	
	ArrayList<Employee> employeeList = new ArrayList<Employee>();
	
	public boolean addEmployee(Employee e)
	{
		boolean b = employeeList.add(e);
		
		return b;
	}
	
	public boolean deleteEmployee(int eCode)
	{
		boolean b = false;
		Iterator<Employee> itr = employeeList.iterator();
		while(itr.hasNext())
		{
			Employee e = (Employee)itr.next();
			if(e.geteCode()==eCode)
			{
				itr.remove();
				b= true;
			}
		}
		 return b;
	}
	
	public String paySlip(int eCode)
	{
		String s =null;
		Iterator<Employee> itr = employeeList.iterator();
		while(itr.hasNext())
		{
			Employee e = (Employee)itr.next();
			if(e.geteCode()==eCode)
			{
				s = e.getSalary();
			}
		}
		
		return s;
	}
	
	public void listAll()
	{
		Iterator<Employee> itr = employeeList.iterator();
		while(itr.hasNext())
		{
			Employee e = (Employee)itr.next();
			System.out.println(e);
		}
	}

}
