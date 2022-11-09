import java.util.Scanner;
class PrimeExample
{
	public static void main(String args[])
	{
		int no,i,temp=0;
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter number:-");
		no=sc.nextInt();

		for(i=1;i<=no;i++)
		{
			if(no%i==0)
			{
			 temp++;
		    }
	    }

	    if(temp==2)
	    {
		  System.out.println("prime");
        }
        else
        {
	      System.out.println("not");
        }
}
}
