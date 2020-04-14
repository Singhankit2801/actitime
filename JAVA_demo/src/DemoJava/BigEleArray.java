package DemoJava;

import java.util.Scanner;

public class BigEleArray {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Length of array");
		int n=sc.nextInt();
		int array[]=new int[n];
		for(int i=0;i<n;i++)
		{
			array[i]=sc.nextInt();
		}
		int small=array[0];
		for(int i=0;i<3;i++)
		{
			if(array[i]<small)
				small=array[i];
		}
		System.out.println(small);
	}
}
