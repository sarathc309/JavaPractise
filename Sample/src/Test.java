import java.util.Arrays;


public class Test {
	
	public static void main(String args[])
	{
		
		int arr[]={1,3,5,17,19,21,13,5,9,17,31,21};
		
		
		
	//new Test().duplicate(arr);
	//new Test().duplicatenosort(arr);
		
		int arr1[]=new Test().sortarray(arr);
		for(int i=0;i<arr1.length;i++)
		{
	System.out.println(arr1[i]);	
		}
	}
	
	public int[] sortarray(int arr[])
	{
		int temp;
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length-i-1;j++)
			{
			if(arr[j]>arr[j+1])
			{
				
				temp=arr[j];
				arr[j]=arr[j+1];
				
				arr[j+1]=temp;
				
				//arr[i]=arr[i+1];
			}
			
			}
		}
		
		return arr;
		
		
	}
	
	void duplicatenosort(int arr1[])
	{
		
		
		for(int i=0;i<arr1.length;i++)
		{
			
			for(int j=1;j<arr1.length;j++)
			{
				if(arr1[i]==arr1[j])
				{
					System.out.println("duplicate number is "+arr1[i]);
					
				}
			}
			
			
		}
		
		
	}
	
	void duplicate(int arr[])
	{
		
		Arrays.sort(arr);
		
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i-1]==arr[i])
			{
				
				
				System.out.println("duplicate number is " +arr[i]);
			}
		}
		
		
		
	}
	

}
