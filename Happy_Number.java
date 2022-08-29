package miniprogram;

public class Happy_Number
{
 public static void main(String args [])
 {
	 Happy_Number hap = new Happy_Number();
	              hap.happy(23);
 }
 void happy(int num) 
 {  int a=0;
	int sum=0;
	while(num>0)
	{
	  while(num>0)
	  {
	   sum=num%10;     //ite1-->sum=23%10=3, ite2-->sum=2%10=2 ,ite3-->3, ite4-->1, ite5-->0
	   num=num/10;     //ite1-->23/10=2, ite2-->2/10=0, ite3-->1, ite4-->0, ite5-->1
	   a=(sum*sum)+a;  //ite1-->(3*3)+0=9, ite2-->(2*2)+9=13, ite3-->9, ite4-->10, ite5-->
	  }
	   if(a>9)  
	   {
	    num=a;  
	    a=0;    
	   }
    }
	System.out.println(a);
	if(a==1) {
		System.out.println("Happy Number");
	}
	else
		System.out.println("Not a Happy Number");
	 
 }
	
}
