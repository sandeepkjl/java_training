package other;

import test.Foundation;

public class MainClass {

	public static void main(String[] args) {
		Foundation f =new Foundation();
		
		//only Var4 can be accessible
		System.out.println(f.var4);
		
		//below mentioned variable are not accessible
		
		/*System.out.println(f.var1);
		System.out.println(f.var2);
		System.out.println(f.var3);*/
		

	}

}
