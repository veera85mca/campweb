package commoncamp;

import org.openqa.selenium.WebElement;

public class Commonfield {

	
	public static boolean patientinfovalidation(WebElement ele, String data)
	{
		if(data.equals(ele.getText()))
		{
			return true;
		}else {
			return false;
		}
	}
	public static boolean patientinfovalidationnumeric(WebElement ele, Integer data)
	{
		if(Integer.parseInt(ele.getText())==data)
		{
			return true;
		}else {
			return false;	
		}
	}
	public static boolean patientinfovalidationdouble(WebElement ele, Double data)
	{
		if(Double.parseDouble(ele.getText())==data)
		{
			return true;
		}else {
			return false;	
		}
	}
}
