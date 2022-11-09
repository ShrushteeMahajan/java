class Outer
{
	void outermethod()
	{
		System.out.println("Inside outer method");
		class Inner
		{
			public void innermethod()
			{
				System.out.println("Inside inner method");
			}
		}
		Inner y=new Inner();
		y.innermethod();
	}
}
class outerr
{
	public static void main(String args[])
	{
		Outer x=new Outer();
		x.outermethod();
	}
}
