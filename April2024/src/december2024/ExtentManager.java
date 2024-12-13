package december2024;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentManager extends BaseeTest
{
	public static ExtentHtmlReporter htmlReport;
	
	public static ExtentReports report;
	
	
	public static ExtentReports getInstance()
	{
		
		if(htmlReport==null)
		{
			htmlReport = new ExtentHtmlReporter(projectPath+"\\HtmllReports\\report.html");
		
			htmlReport.config().setDocumentTitle("Auto Report");
			htmlReport.config().setReportName("fucn Report");
			htmlReport.config().setTheme(Theme.DARK);
			
			
			report = new ExtentReports();
			report.attachReporter(htmlReport);
			report.setSystemInfo("OS","windows" );
			report.setSystemInfo("Tester Name", "ravilella");
			report.setSystemInfo("Browser","Chrome");
		
		
		}
		
		
		return report;
		
	}

}
