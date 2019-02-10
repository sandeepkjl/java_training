
public class MainClass {

	public static void main(String[] args) {
		Person person =new Person();
		
		person.name = args[0];
		person.age = Integer.parseInt(args[1]);
		
		try{
			if(person.age <18 || person.age >60)
			{
				throw new AgeException("Age Should be in Rnage og 18 to 60");
			}
		}
		catch(AgeException e)
		{
			System.out.println(e.getMessage());
		}

	}

}
