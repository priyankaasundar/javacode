package myProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbosolutePathGoogle 
{
public static void main(String[] args) throws InterruptedException 
{
ChromeDriver c=new ChromeDriver();
c.manage().window().maximize();
c.get("https://www.google.com/");
WebElement search=c.findElement(By.xpath("//textarea[@class=\"gLFyf\"]"));
Thread.sleep(3000);
search.sendKeys("Ramya");
}
}
