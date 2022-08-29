package miniprogram;


//Fibonacci series without 3rd variable
public class Fibo_wo_3v 
{
 public static void main(String args [])
 {
	 Fibo_wo_3v fibo=new Fibo_wo_3v();
	       //     fibo.series(0,1);
	            fibo.series_1(0, 1);
 }
 public void series(int a,int b)
 {
	int n=20;
	for(int i=1;i<=n;i++) 
	{
	  System.out.println(a);
	  b=a+b;
	  a=b-a;
	}
 }
 
 
 
 
 //Fibonacci series with 3rd variable
 public void series_1(int a,int b)
 {
	int sum=0;
	int n=20;
	for(int i=1;i<=n;i++) 
	{
	  System.out.println(a);
	  sum=a+b;
	  a=b;
	  b=sum;
	}
 }
}
