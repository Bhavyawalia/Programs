package arrayPackage;

public class MaxValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array1[]= {5,10,20,8,2};
		int max=array1[0];
		for(int i=1;i<5;i++)
		{
			if(array1[i]>max)
			{
				max=array1[i];
			}
		}
		System.out.println("The maximum value = "+max);

		}

}
