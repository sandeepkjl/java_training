import java.util.HashMap;

public class TelephoneBook {
	
	HashMap<String ,Long> hs= new HashMap<String, Long>();
	
	public Long addNumber(String name, Long number)
	{
		
		return hs.put(name, number);
		
	}
	
	public Long getNumber(String name)
	{
		return hs.get(name);
	}
	
	

}
