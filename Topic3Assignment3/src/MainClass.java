
public class MainClass {
	
	public static void main(String args[])
	{
		try{
			int avg = (Integer.parseInt(args[0])+Integer.parseInt(args[1])
	           +Integer.parseInt(args[2])+Integer.parseInt(args[3])
	        		   +Integer.parseInt(args[4])) /5;
			
			System.out.println(avg);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
		}
	}

}