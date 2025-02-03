//UserInput.java

import java.util.*;
public class UserInput
{
	int[] arrayInput()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter five numbers");
		int[] array=new int[5];
		for(int i=0;i<array.length;i++)
		{
			array[i]=sc.nextInt();
		}
		return array;
	}
}
		