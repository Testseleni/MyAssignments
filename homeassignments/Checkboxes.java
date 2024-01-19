package week2.homeassignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkboxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
					ChromeDriver driver=new ChromeDriver();
					driver.manage().window().maximize();
					driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
					driver.get("https://leafground.com/checkbox.xhtml");
					
					//1.Click on the "Basic Checkbox.”
					
					WebElement Basic = driver.findElement(By.xpath("(//div[contains(@class,'ui-chkbox-box ui-widget')])"));
					Basic.click();
					
					//2.Click on the "Notification Checkbox."
					WebElement Noti = driver.findElement(By.xpath("(//div[contains(@class,'ui-chkbox-box ui-widget')])[2]"));
					Noti.click();
				
					//3.Verify that the expected message is displayed.
						WebElement expected =driver.findElement(By.xpath("//span[text()='Checked']"));
						String message=expected.getText();
						System.out.println(message);
						String tmesssage = "Checked";
						if(message.equals(tmesssage))
						{
							System.out.println("The expected Message displayed :"+message);
						}
						else
						{
							System.out.println("The expected Message not displayed :"+message);
						}
						
						//4.Click on your favorite language (assuming it's related to checkboxes).
					    WebElement Lang = driver.findElement(By.xpath(("(//div[contains(@class,'ui-chkbox-box ui-widget')])[4]")));
						Lang.click();
						
						//5.Click on the "Tri-State Checkbox
						WebElement Tri = driver.findElement(By.xpath(("(//div[contains(@class,'ui-chkbox-box ui-widget')])[8]")));
						Tri.click();
						 WebElement expected1 =driver.findElement(By.xpath("//span[text()='State has been changed.']"));
							String message1=expected1.getText();
							System.out.println(message1);
						// 6.Verify which tri-state option has been chosen.
						if(Tri.isEnabled())
						{
							System.out.println("The tri-state option has been chosen ");
						}
						else
						{
							System.out.println("The tri-state option has not been chosen");
						}
						
						//7.Click on the "Toggle Switch."
						WebElement tog = driver.findElement(By.xpath("//div[contains(@class,'ui-toggleswitch-slider')]"));
						tog.click();
						
						//8.Verify that the expected message is displayed
                        WebElement expected2=driver.findElement(By.xpath("//span[text()='Checked']"));
						String message2=expected2.getText();
						System.out.println(message2);
						String tmesssage1 = "Checked";
						if(message.equals(tmesssage1))
						{
							System.out.println("The expected Message displayed :"+message);
						}
						else
						{
							System.out.println("The expected Message not displayed :"+message);
						}
						
						//9.Verify if the Checkbox is disabled.
						WebElement disa  = driver.findElement(By.xpath("//div[contains(@class,'selectbooleancheckbox')]"));
						if(disa.isEnabled())
						  {
						   System.out.print("Text box is enabled. Take your action.");
						  }
						  else
						  {
						   System.out.print("Text box is disabled. Take your action.");
						  }
	                      
						//10.Select multiple options on the page (details may be needed).
	
						WebElement mult  = driver.findElement(By.xpath("//div[contains(@class,'ui-selectcheckboxmenu-multiple ui-selectcheckboxmenu')]"));
						 mult.click();
						driver.findElement(By.xpath("//div[@id='j_idt87:multiple_panel']/div[2]/ul[1]/li[1]/div[1]/div[2]")).click();
						driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-close']")).click();
						
						//Close the web browser when done
						driver.close();
						
	
	}}


