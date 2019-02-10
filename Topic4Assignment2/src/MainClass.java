import java.time.LocalDate;

public class MainClass {

	public static void main(String[] args) throws InterruptedException {
	
		long start = System.currentTimeMillis();
		long end = start + 20*1000; // 60 seconds * 1000 ms/sec
		while (System.currentTimeMillis() < end)
		{
		   System.out.println(LocalDate.now());
			Thread.sleep(2*1000);
		    
		}

	}

}
