import java.util.HashSet;
import java.util.Iterator;

public class MainClass {
	public static void main(String args[])
	{
		HashSet<Employee> hs = new HashSet<Employee>();
		hs.add(new Employee(377367, "sandeep", "30000"));
		hs.add(new Employee(377368, "rohan", "35000"));
		hs.add(new Employee(377369, "ayush", "40000"));
		hs.add(new Employee(377370, "sandeep", "45000"));
		
		Iterator<Employee> itr= hs.iterator();
		
		while(itr.hasNext())
		{
			Employee e=(Employee)itr.next();
			System.out.println(e);
		}
		
		
	}

}
