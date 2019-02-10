
public class Employee implements Comparable{
	private int  eCode;
	private String name;
	private String salary;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int eCode, String name, String salary) {
		super();
		this.eCode= eCode;
		this.name = name;
		this.salary = salary;
	}

	

	public int geteCode() {
		return eCode;
	}

	public void seteCode(int eCode) {
		this.eCode = eCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}
	
	

	

	@Override
	public int compareTo(Object o) {
		Employee e = (Employee)o;
		if(e.eCode >this.eCode)
		{
			return 1;
		}
		else if(e.eCode <this.eCode)
		{
			return -1;
		}
		else{
			return 0;
		}
		
	}

	@Override
	public String toString() {
		return "Employee [eCode=" + eCode + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
	
	

}