package BookShop.booktest;

/**
 * Hello world!
 *
 */
public class App 
{
    public int validateAccount(String uname,String pwd)
    {
    	if(uname.equals("admin") && pwd.equals("pass123"))
    	{
    		return(1);
    	}
    	else
    	{
    		return(0);
    	}
    }
}
