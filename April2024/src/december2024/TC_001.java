package december2024;

public class TC_001  extends BaseeTest
{

	public static void main(String[] args) throws Exception 
	{
		
		init();
		
         launch("firefoxbrowser");
         
         navigateUrl("amazonurl");
         
         driver.manage().window().maximize();
         
         String title = driver.getTitle();
         
         System.out.println(title);
         
         String url = driver.getCurrentUrl();
         
         System.out.println(url);
         
         driver.manage().deleteAllCookies();
         
        driver.quit();
        
        
         
	}

}
