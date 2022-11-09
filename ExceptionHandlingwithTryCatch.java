import  java.util.*;

 public class ExceptionHandlingwithTryCatch

 {

  public static void main(String args[])

  {
    try
    {
     System.out.println("Before divide");
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter two integer number");

       int num1=sc.nextInt();
       int num2= sc.nextInt();
       System.out.println(num1+ "/"+num2+"="+(num1/num2));


       }


       catch(ArithmeticException e)

       {

        System.out.println("A number cannot be divided by zero ");
        }
	  }
  }