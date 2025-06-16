package project1_8;
import java.util.*;
public class day8_task1 {
	
	public static void main(String []args)
	{
		int[] arr = {1,4,2,6,8};
		System.out.println(Arrays.toString(arr));

		Scanner s =new Scanner(System.in);
		System.out.println("enter the element :");
		int element=s.nextInt();
	
	
	for(int i=0;i<arr.length;i++)
	{
		if (arr[i]==element)
		{
	     System.out.println("element found " +arr[i] + "at index " +i);
         return;		}}
	
	
    System.out.println("element not found ");

	
	
}}
	
	
	
	
	
	
	
	
	
	
	
	

