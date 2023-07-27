package dataTypes;

public class ArrayEx {

	public static void main(String[] args) {
		int arr[]= {4,7,9,10};
		String a[]= {"abc","cfg"};
		int arr1[]=new int[5];
		arr1[0]=34;
		arr1[1]=95;
		arr1[2]=55;
		arr1[3]=13;
		arr1[4]=56;
		System.out.println(arr.length);
		System.out.println(arr);
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		for (int k=0;k<arr1.length;k++)
		{
		System.out.println(arr1[k]);
	}
	}
}
