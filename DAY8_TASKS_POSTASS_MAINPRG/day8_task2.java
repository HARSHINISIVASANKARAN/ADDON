package project1_8;
import java.util.*;

public class day8_task2 {
public static void main(String []args)
{
	int []arr= {1,2,3,4,5,6,7};
    System.out.println(Arrays.toString(arr) );
    Scanner sd=new Scanner(System.in);
    System.out.println(" Enter the target value : " );

    int target=sd.nextInt();

	int first= 0;
	int last=arr.length-1;
	boolean flag=false;

	
	while(first<=last)
	{
		int mid =(first + last)/2;
	         if (arr[mid] ==target)
	            {
		        System.out.println("element found " + arr[mid] +" at index" );
		        flag=true;
                 break;	            }
	            else if (arr[mid] <target )
	           {
		       first=mid+1;

		      
	           }
	            else if (arr[mid]>target)
	            { 
                  last=mid-1;   			        
                    
	            }
	         else
	         {
                 System.out.println("element not found " );

	         }
}
}}
