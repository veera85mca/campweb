package initialize;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Searchfilter extends Browserinitializer{

public static void clickpatientlist()
{
	WebDriverWait wait=new WebDriverWait(driver, 25);
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='MAIN_PatientList']/a"))).click();
}
public static void clicksearchfilter()
{
	WebDriverWait wait=new WebDriverWait(driver, 15);
	wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(".//tbody[@id='MainTable_body1']/tr")));
	/*FluentWait<WebDriver> wait=new FluentWait<WebDriver>(driver).withTimeout(20, TimeUnit.SECONDS).pollingEvery(5, TimeUnit.SECONDS).ignoring(NoSuchElementException.class);
	WebElement element=wait.until(new Function<WebDriver, WebElement>() {
	public WebElement apply(WebDriver driver)
	{
		List<WebElement> tabledata=driver.findElements(By.xpath(".//tbody[@id='MainTable_body1']/tr"));
		if(tabledata.size()<=3)
		{
			driver.findElement(By.xpath(".//a[@onclick='Search_ShowHide()']")).click();
		}
		return driver.findElement(By.xpath(".//tbody[@id='MainTable_body1']"));
	}
	});*/
	WebDriverWait wait1=new WebDriverWait(driver, 20);
	wait1.until(ExpectedConditions.elementToBeClickable(By.xpath(".//a[@onclick='Search_ShowHide()']"))).click();
}
public static void searchuid(String uidsearch)
{
	WebDriverWait wait=new WebDriverWait(driver, 20);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='txt_UID']"))).sendKeys(uidsearch);
}
public static void searchpatientname(String patientnamesearch)
{
	WebDriverWait wait=new WebDriverWait(driver, 20);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='txt_PatientName']"))).sendKeys(patientnamesearch);
}
public static void clicksearchbutton()
{
	WebDriverWait wait=new WebDriverWait(driver, 20);
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='btn_Search']"))).click();
}
}
