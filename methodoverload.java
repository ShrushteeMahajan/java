class demo
{
	int a,b,c;
	void read(int x,int y)
	{
		a=x;
		b=y;
	}
	void read(int z)
	{
		c=z;
	}
	void display()
	{
		System.out.println(a+b+c);
	}
}
class methodoverload
{
	public static void main(String args[])
	{
		demo d = new demo();
		d.read(5);
		d.read(10,6);
		d.display();
	}
}
