class demo
{
demo(int x)
{
System.out.println(x);
}protected void finalize()
{
System.out.println("Object is destroyes by the Garbage Collector");
}
}
public class DestructorExample
{
	public static void main(String[] args)
	{
		demo de=new demo(23);
		de.finalize();
		de=null;
		System.out.println("Inside the main() method");
	}
}
