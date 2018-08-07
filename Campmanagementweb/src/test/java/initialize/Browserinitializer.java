package initialize;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browserinitializer {

public static WebDriver driver;

public static void browser(String browse)
{
if(browse.equalsIgnoreCase("Firefox"))
{
	System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+File.separator+"Browserdrivers"+File.separator+"geckodriver.exe");
	driver=new FirefoxDriver();
	
}else if (browse.equalsIgnoreCase("Chrome")) {
	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+File.separator+"Browserdrivers"+File.separator+"chromedriver.exe");
	driver=new ChromeDriver();
}
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
}
public static void getcampurl(String url)
{
driver.get(url);
}
public static void getusername(String user)
{
	driver.findElement(By.xpath("//*[@id='username']")).sendKeys(user);
}
public static void getpassword(String pass)
{
	driver.findElement(By.xpath("//*[@id='password']")).sendKeys(pass);
}
public static void login()
{
	driver.findElement(By.xpath("//*[@id='sign_LoginBtn1']")).click();
}
}
