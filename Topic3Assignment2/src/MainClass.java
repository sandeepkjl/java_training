
public class MainClass {
	
	public static void main(String args[])
	{
		try{
			Student student1 = new Student();
			student1.name = args[0];
			student1.mark1 = Integer.parseInt(args[1]);
			student1.mark2 = Integer.parseInt(args[2]);
			student1.mark3= Integer.parseInt(args[3]);
			
			
			Student student2 = new Student();
			student2.name = args[4];
			student2.mark1 = Integer.parseInt(args[5]);
			student2.mark2 = Integer.parseInt(args[6]);
			student2.mark3 = Integer.parseInt(args[7]);
			
			int avgMarkStudent1 = (student1.mark1+student1.mark2+student1.mark3)/3;
			int avgMarkStudent2 = (student2.mark1+student2.mark2+student2.mark3)/3;
			
			System.out.println("Average Mark Of Student 1 : "+avgMarkStudent1 );
			System.out.println("Average Mark Of Student 2 : "+avgMarkStudent2 );
			
		}
		catch(NumberFormatException e)
		{
			System.out.println(e.getMessage());
		}
		
		
		
		
		
	}

}
