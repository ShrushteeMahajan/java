public class Wrapper
{
	public static void main(String args[])
	{
		byte b=10;
		short s=20;
		int i=30;
		long l=40;
		float f=50.0F;
		double d2=60.0D;
		char c='a';
		boolean n=true;

		Byte byteobj=b;
		Short shortobj=s;
		Integer intobj=i;
		Long longobj=l;
		Float floatobj=f;
		Double doubleobj=d2;
		Character charobj=c;
		Boolean boolobj=n;

		System.out.println("--Printing object values--");
		System.out.println("Byte object:"+byteobj);
		System.out.println("Short object:"+shortobj);
		System.out.println("Interger object:"+intobj);
		System.out.println("Long object:"+longobj);
		System.out.println("Float object:"+floatobj);
		System.out.println("Double object:"+doubleobj);
		System.out.println("Char object:"+charobj);
		System.out.println("Boolean object:"+boolobj);

		Byte bytevalue=byteobj;
	    Short shortvalue=shortobj;
		Integer intvalue= intobj;
		Long longvalue=longobj;
		Float floatvalue=floatobj;
		Double doublevalue=doubleobj;
		Character charvalue=charobj;
		Boolean boolvalue=boolobj;

		System.out.println("--Printing primtive values--");
		System.out.println("Byte value:"+bytevalue);
		System.out.println("Short value:"+shortvalue);
		System.out.println("Interger value:"+intvalue);
		System.out.println("Long value:"+longvalue);
		System.out.println("Float value:"+floatvalue);
		System.out.println("Double value:"+doublevalue);
		System.out.println("Char value:"+charvalue);
		System.out.println("Boolean value:"+boolvalue);
	}
}
