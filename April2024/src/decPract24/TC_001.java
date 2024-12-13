package decPract24;

import org.openqa.selenium.By;

public class TC_001  extends BaserTest

{
	

	public static void main(String[] args) throws Exception 
	{
		
		init();
		
launch("firefoxbrowser");

Navigateurl("amazonurl");

SelectOption("amazondropdown_id","Books");

TypeText("amazontextbox_name","Harry Potter");

clickSearch("amazonsearchbutton_xpath");


	}

	

}
