
public class MainClass {
	
	public static void main(String args[])
	{
		EmployeeDB empDB = new EmployeeDB();
		empDB.addEmployee(new Employee(377367, "sandeep", "30000"));
		
		System.out.println(empDB.deleteEmployee(377367));
		
		empDB.addEmployee(new Employee(377368, "Rohan", "35000"));
		System.out.println(empDB.paySlip(377368));
		
		empDB.addEmployee(new Employee(367368, "ayush", "50000"));
		empDB.addEmployee(new Employee(367460, "Kiran", "55000"));
		
		empDB.listAll();
	}

}
