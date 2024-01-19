package week2.homeassignments;



import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
public class EditLeads {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://leaftaps.com/opentaps/");
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.xpath("(//input[@name='companyName'])[2]")).sendKeys("SRM");
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Sai");
		driver.findElement(By.xpath("(//input[@name='lastName'])[3]")).sendKeys("Mugunth");
		driver.findElement(By.xpath("//input[@name='firstNameLocal']")).sendKeys("Sai");
		driver.findElement(By.xpath("//input[@name='departmentName']")).sendKeys("Doctor");
		driver.findElement(By.xpath("(//textarea[@name='description'])[1]")).sendKeys("Designation as cardiologies");
		driver.findElement(By.xpath("(//input[@name='primaryPhoneCountryCode'])[4]")).sendKeys("91");
		driver.findElement(By.xpath("(//input[@name='primaryPhoneAreaCode'])[4]")).sendKeys("755");
		//driver.findElement(By.xpath("(//input[@name='primaryPhoneExtension'])")).sendKeys("Appcogni");
		driver.findElement(By.xpath("(//input[@name='primaryPhoneNumber'])[4]")).sendKeys("9751504224");
		driver.findElement(By.xpath("(//input[@name='primaryEmail'])[4]")).sendKeys("mohanaappsure3@gmail.com");
		
		WebElement state=driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select opt = new Select(state);
		opt.selectByVisibleText("New York");
		driver.findElement(By.className("smallSubmit")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		//driver.findElement(By.xpath("//div[@class='x-form-element']/input[@name='id']")).sendKeys("12937");
		driver.findElement(By.xpath("(//div[@class='x-form-element']/input[@name='lastName'])[3]")).sendKeys("Mugunth");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		driver.findElement(By.xpath("//a[text()='Mugunth']")).click();
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		driver.findElement(By.xpath("(//textarea[@name='description'])[1]")).clear();
		driver.findElement(By.xpath("(//textarea[@name='importantNote'])[1]")).sendKeys("Important note added");
		driver.findElement(By.xpath("(//input[@name='submitButton'])[1]")).click();
		String j = driver.getTitle();
		  System.out.println("Your page title Is : "+j);
		   
		  Thread.sleep(8000);
		  driver.close();
	
		
		
		
		
		
		
		
		
	
}
}