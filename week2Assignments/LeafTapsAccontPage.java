package week2Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LeafTapsAccontPage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get(" http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		//driver.findElement(By.linkText("crmsfa")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
        driver.findElement(By.id("accountName")).sendKeys("Pavitra Sirigireddy");
        driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester.");
        WebElement industryDropdown = driver.findElement(By.name("industryEnumId"));
		Select industry = new Select(industryDropdown);
		industry.selectByValue("IND_SOFTWARE");
		
		WebElement ownershipDropdown = driver.findElement(By.name("ownershipEnumId"));
		Select Ownership = new Select(ownershipDropdown);
		Ownership.selectByValue("OWN_CCORP");
		
		WebElement sourceDropdown = driver.findElement(By.id("dataSourceId"));
		Select Source = new Select(sourceDropdown);
		Source.selectByValue("LEAD_EMPLOYEE");
		
		WebElement marketingcampaignDropdown = driver.findElement(By.name("marketingCampaignId"));
		Select marketingcampaign = new Select(marketingcampaignDropdown);
		marketingcampaign.selectByIndex(6);
		
		WebElement stateprovinceDropdown = driver.findElement(By.name("generalStateProvinceGeoId"));
		Select stateprovince = new Select(stateprovinceDropdown);
		stateprovince.selectByValue("TX");
		
		driver.findElement(By.className("smallSubmit")).click();
		
		 Thread.sleep(5000);
		 driver.close();         
		
	}

}
