   class demo
   {
	demo(int x)
	{
		System.out.println(x);
	}
	 protected void finalize()
	 {
		 System.out.println("Oject is Destroyed by the garbage collector");
	 }
 }
  public class finalizeDemo
  {
	  public static void main(String[]args)
	  {
		  demo d= new demo(25);
		  d.finalize();
		  d=null;
		  System.out.println("Inside the main()method");
	  }
  }
