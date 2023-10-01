package week2Assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook_Registration_Page {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		String originalWindow=driver.getWindowHandle();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Create new account")).click();
		//Handling the new window
		for(String windowHandle:driver.getWindowHandles()) {
			if(!originalWindow.contentEquals(windowHandle)) {
				driver.switchTo().window(windowHandle);
				break;
			}
		}
		
		driver.findElement(By.name("firstname")).sendKeys("Pavitra");
		driver.findElement(By.name("lastname")).sendKeys("Sirigireddy");
		driver.findElement(By.name("reg_email__")).sendKeys("pavitra.sirigireddy@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("Ppas@9896");
		WebElement day = driver.findElement(By.name("birthday_day"));  
		Select daydropdown = new Select(day); 
		daydropdown.selectByValue("13"); 
		WebElement month = driver.findElement(By.name("birthday_month"));  
		Select monthdropdown = new Select(month); 
		monthdropdown.selectByVisibleText("Jun"); 
		WebElement yearDropDown = driver.findElement(By.name("birthday_year"));  
		Select yeardropdown = new Select(yearDropDown); 
		yeardropdown.selectByVisibleText("1998"); 
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		driver.close();
		

	}
	
	
	
	

}
