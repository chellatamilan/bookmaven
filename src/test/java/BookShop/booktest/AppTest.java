package BookShop.booktest;

import org.testng.Assert;
import org.testng.annotations.Test;
class MyApp {
	public int validateAccount(String user,String pwd)
	   {
		   if(user.equals("admin") && pwd.equals("pass123")) 
		   {
			   return(1); 
		   }
		   
		   else return(1);
		   
	   }
}
public class AppTest {
	
	@Test
	public void testMethod1()
	{
		MyApp myapp=new MyApp();
		Assert.assertEquals(1, myapp.validateAccount("admin", "pass123"));
	}
	@Test
	public void testMethod2()
	{
		MyApp myapp=new MyApp();
		Assert.assertEquals(0, myapp.validateAccount("vit", "student"));
	}
	
}
