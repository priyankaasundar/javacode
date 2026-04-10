package myProject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AboslutePathAmazon
{
public static void main(String[] args)
{
ChromeDriver c=new ChromeDriver();
c.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
WebElement username=c.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div/div[2]/div/div/form/div/div/div/div[1]/input"));
username.sendKeys("priyankaasundar1996@gmail.com"+Keys.ENTER);

}
}
