
public class MainClass {

	public static void main(String[] args) {
		int arr[]={5,7,9,10,26,37};
		int max=arr[0];
		for(int i=0;i<arr.length;i++ )
		{
			if(max<arr[i])
			{
				max=arr[i];
			}
		}
		
		System.out.println("max element of array is : "+ max);

	}

}
