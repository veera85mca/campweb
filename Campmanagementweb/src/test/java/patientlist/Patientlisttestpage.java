package patientlist;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import commoncamp.Commonfield;
import initialize.Browserinitializer;
import initialize.Searchfilter;

public class Patientlisttestpage extends Browserinitializer{

public static FileInputStream file;
public static Properties prob;
public static String patientid;
public static String uid;
public static String patientname;
public static int age;
public static String sex;
public static double mobileno;
public static String tokenid;
	
public static void searchfilter_uid(String uidsearch) throws IOException
{
	file=new FileInputStream(new File(System.getProperty("user.dir")+File.separator+"src"+File.separator+"test"+File.separator+"resources"+File.separator+"Locators"+File.separator+"Patientinfo.properties"));
	prob=new Properties();
	prob.load(file);
	uid=uidsearch;
	Searchfilter.searchuid(uidsearch);
}
public static void searchfilter_patientname(String patientnamesearch)
{
	patientname=patientnamesearch;
	Searchfilter.searchpatientname(patientnamesearch);
}
public static void searchfilter_searchbutton()
{
	Searchfilter.clicksearchbutton();
}
public static void worklist_patientvalidation(Integer agevali, String sexvali, Double mobilevali)
{
	age=agevali;
	sex=sexvali;
	mobileno=mobilevali;		
	if(Commonfield.patientinfovalidation(patientlistinfolocators("Locators_Patientlist_worklist_UID"), uid) && Commonfield.patientinfovalidation(patientlistinfolocators("Locators_Patientlist_worklist_patientname"), patientname) && Commonfield.patientinfovalidationnumeric(patientlistinfolocators("Locators_Patientlist_worklist_age"), age) && Commonfield.patientinfovalidation(patientlistinfolocators("Locators_Patientlist_worklist_sex"), sex) && Commonfield.patientinfovalidationdouble(patientlistinfolocators("Locators_Patientlist_worklist_mobileno"), mobileno))
	{
	}else {
		Assert.fail("Uid or patient name or age or sex or mobileno is mismatched with input in patient Worklist");
	}
}
public static void worklist_patientidlink()
{
	patientid=patientlistinfolocators("Locators_Patientlist_worklist_Patientid").getText();
	patientlistinfolocators("Locators_Patientlist_worklist_Patientid").click();
	WebDriverWait wait=new WebDriverWait(driver, 15);
	wait.until(ExpectedConditions.visibilityOf(patientlistinfolocators("Locators_patientinformation_patientid")));
	if(Commonfield.patientinfovalidation(patientlistinfolocators("Locators_patientinformation_patientid"), patientid)==false)
	{
		Assert.fail("Patient id mismatched with input data");
	}
}
public static void patientinfo_patientvalidation1()
{
	if(Commonfield.patientinfovalidation(patientlistinfolocators("Locators_patientinformation_Uid"), uid) && Commonfield.patientinfovalidation(patientlistinfolocators("Locators_patientinformation_Name"), patientname) && Commonfield.patientinfovalidationnumeric(patientlistinfolocators("Locators_patientinformation_Age"), age) && Commonfield.patientinfovalidation(patientlistinfolocators("Locators_patientinformation_Gender"), sex) && Commonfield.patientinfovalidationdouble(patientlistinfolocators("Locators_patientinformation_Contactno"), mobileno))
	{
	}else {
		Assert.fail("Uid or patient name or age or sex or mobileno is mismatched with input in patient information window");
	}
}
public static void patientinfo_patientvalidation2(String address, String state, String district, String taluk)
{
	if(Commonfield.patientinfovalidation(patientlistinfolocators("Locators_patientinformation_Addres"), address) && Commonfield.patientinfovalidation(patientlistinfolocators("Locators_patientinformation_State"), state) && Commonfield.patientinfovalidation(patientlistinfolocators("Locators_patientinformation_District"), district) && Commonfield.patientinfovalidation(patientlistinfolocators("Locators_patientinformation_Taluk"), taluk))
	{
	}else {
		Assert.fail("Uid or patient name or age or sex or mobileno is mismatched with input in patient information window");
	}
}
public static void patientinfo_patientvalidation3(String aadhaarno, String occupation, String caste, String income)
{
	if(Commonfield.patientinfovalidation(patientlistinfolocators("Locators_patientinformation_Aadhaarno"), aadhaarno) && Commonfield.patientinfovalidation(patientlistinfolocators("Locators_patientinformation_Occupation"), occupation) && Commonfield.patientinfovalidation(patientlistinfolocators("Locators_patientinformation_Caste"), caste) && Commonfield.patientinfovalidation(patientlistinfolocators("Locators_patientinformation_Income"), income))
	{
	}else {
		Assert.fail("Uid or patient name or age or sex or mobileno is mismatched with input in patient information window");
	}
}
public static void patientinfo_tokenidvalidate(String token)
{
	tokenid=token;
	if(Commonfield.patientinfovalidation(patientlistinfolocators("Locators_patientinformation_Token"), token))
	{
	}else {
		Assert.fail("Token id is mismatched with input data");
	}
}
public static void casesheet_casesheettab() throws InterruptedException
{
	patientlistinfolocators("Locators_casesheet_tab").click();
	WebDriverWait wait=new WebDriverWait(driver, 20);
	wait.until(ExpectedConditions.visibilityOf(patientlistinfolocators("Locators_casesheet_va_headtext")));
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView(true);", patientlistinfolocators("Locators_casesheet_okbutton"));
}
public static void casesheet_general1(String general1)
{
	if(Commonfield.patientinfovalidation(patientlistinfolocators("Locators_casesheet_generalquestion1"), general1))
	{
	}else {
		Assert.fail("Have you had a medical check up in the past 1 year is mismatched with input");
	}
}
public static void casesheet_general2(String general2)
{
	if(Commonfield.patientinfovalidation(patientlistinfolocators("Locators_casesheet_generalquestion2"), general2))
	{
	}else {
		Assert.fail("Do you have Diabetes is mismatched with input");
	}
}
public static void casesheet_general3(String general3)
{
	if(Commonfield.patientinfovalidation(patientlistinfolocators("Locators_casesheet_generalquestion3"), general3))
	{
	}else {
		Assert.fail("Do you have Hypertension is mismatched with input");
	}
}
public static void casesheet_general4(String general4)
{
	if(Commonfield.patientinfovalidation(patientlistinfolocators("Locators_casesheet_generalquestion4"), general4))
	{
	}else {
		Assert.fail("Do you Smoke is mismatched with input");
	}
}
public static void casesheet_general5(String general5)
{
	if(Commonfield.patientinfovalidation(patientlistinfolocators("Locators_casesheet_generalquestion5"), general5))
	{
	}else {
		Assert.fail("Do you consume Alcohol is mismatched with input");
	}
}
public static void casesheet_general6(String general6)
{
	if(Commonfield.patientinfovalidation(patientlistinfolocators("Locators_casesheet_generalquestion6"), general6))
	{
	}else {
		Assert.fail("Have you ever had eye examination is mismatched with input");
	}
}
public static void casesheet_general7(String general7)
{
	if(Commonfield.patientinfovalidation(patientlistinfolocators("Locators_casesheet_generalquestion7"), general7))
	{
	}else {
		Assert.fail("Do you have any difficulty in seeing distant object is mismatched with input");
	}
}
public static void casesheet_general8(String general8)
{
	if(Commonfield.patientinfovalidation(patientlistinfolocators("Locators_casesheet_generalquestion8"), general8))
	{
	}else {
		Assert.fail("Have you been advised to wear glassess ever is mismatched with input");
	}
}
public static void casesheet_general9(String general9)
{
	if(Commonfield.patientinfovalidation(patientlistinfolocators("Locators_casesheet_generalquestion9"), general9))
	{
	}else {
		Assert.fail("Are you using any glasses currently is mismatched with input");
	}
}
public static void casesheet_general10(String general10, String general11)
{
	if(general10.equals("Yes"))
	{
		if(Commonfield.patientinfovalidation(patientlistinfolocators("Locators_casesheet_generalquestion10"), general10))
		{
			if(Commonfield.patientinfovalidation(patientlistinfolocators("Locators_casesheet_generalquestion11"), general11))
			{
			}else {
				Assert.fail("Type of hospital is mismatched with input");
			}
		}else {
			Assert.fail("Are you aware of nearby hospital is mismatched with input");
		}
	}else if (general10.equals("No")) {
		if(Commonfield.patientinfovalidation(patientlistinfolocators("Locators_casesheet_generalquestion10"), general10))
		{
		}else {
			Assert.fail("Type of hospital is mismatched with input");
		}
	}
	JavascriptExecutor j1s=(JavascriptExecutor)driver;
	j1s.executeScript("arguments[0].scrollIntoView(true);", patientlistinfolocators("Locators_casesheet_va_headtext"));
}
public static void casesheet_bloodpressure(String bpmax, String bpmin)
{
	String bp=bpmax+"/"+bpmin;
	if(Commonfield.patientinfovalidation(patientlistinfolocators("Locators_casesheet_MedicalExamination_Bloodpressure"), bp))
	{
	}else {
		Assert.fail("Blood pressure values are mismatched with input");
	}
}
public static void casesheet_bloodsugar(Integer bloodsugar)
{
	if(Commonfield.patientinfovalidationnumeric(patientlistinfolocators("Locators_casesheet_MedicalExamination_Bloodsugar"), bloodsugar))
	{
	}else {
		Assert.fail("Blood sugar value is mismatched with input");
	}
}
public static void casesheet_syringing(String syring)
{
	if(Commonfield.patientinfovalidation(patientlistinfolocators("Locators_casesheet_MedicalExamination_Syringing"), syring))
	{
	}else {
		Assert.fail("Syringing is mismatched with input");
	}
}
public static void casesheet_weightheight(Integer weight, Integer height)
{
	if(Commonfield.patientinfovalidationnumeric(patientlistinfolocators("Locators_casesheet_MedicalExamination_weight"), weight) && Commonfield.patientinfovalidationnumeric(patientlistinfolocators("Locators_casesheet_MedicalExamination_Height"), height))
	{
	}else {
		Assert.fail("Weight or Height is mismatched with input");
	}
}
public static void casesheet_intraocularpressure(String righteye, String lefteye)
{
	if(Commonfield.patientinfovalidation(patientlistinfolocators("Locators_casesheet_Intraocularpressure_Righteye"), righteye+" mmHg") && Commonfield.patientinfovalidation(patientlistinfolocators("Locators_casesheet_Intraocularpressure_Lefteye"), lefteye+" mmHg"))
	{
	}else {
		Assert.fail("Intraocular pressure right or left values are mismatched with input");
	}
}

public static void casesheet_VArightuadis(String ruad)
{
	if(Commonfield.patientinfovalidation(patientlistinfolocators("Locators_casesheet_VA_Right_Unaided_Distance"), ruad))
	{
	}else {
		Assert.fail("Right UnAided distance is mismatched with input");
	}
}
public static void casesheet_VArightuanear(String ruan)
{
	if(Commonfield.patientinfovalidation(patientlistinfolocators("Locators_casesheet_VA_Right_Unaided_Near"), ruan))
	{
	}else {
		Assert.fail("Right UnAided near is mismatched with input");
	}	
}
public static void casesheet_VAleftuadis(String luad)
{
	if(Commonfield.patientinfovalidation(patientlistinfolocators("Locators_casesheet_VA_Left_Unaided_Distance"), luad))
	{
	}else {
		Assert.fail("Left Unaided Distance is mismatched with input");
	}
}
public static void casesheet_VAleftuanear(String luan)
{
	if(Commonfield.patientinfovalidation(patientlistinfolocators("Locators_casesheet_VA_Left_Unaided_Near"), luan))
	{
	}else {
		Assert.fail("Left Unaided Near is mismatched with input");
	}	
}
public static void casesheet_VArightadis(String rad)
{
	if(Commonfield.patientinfovalidation(patientlistinfolocators("Locators_casesheet_VA_Right_aided_Distance"), rad))
	{
	}else {
		Assert.fail("Right aided Distance is mismatched with input");
	}
}
public static void casesheet_VArightanear(String ran)
{
	if(Commonfield.patientinfovalidation(patientlistinfolocators("Locators_casesheet_VA_Right_aided_Near"), ran))
	{
	}else {
		Assert.fail("Right aided Near is mismatched with input");
	}
}
public static void casesheet_VAleftadis(String lad)
{
	if(Commonfield.patientinfovalidation(patientlistinfolocators("Locators_casesheet_VA_Left_aided_Distance"), lad))
	{
	}else {
		Assert.fail("Left aided Distance is mismatched with input");
	}
}
public static void casesheet_VAleftanear(String lan)
{
	if(Commonfield.patientinfovalidation(patientlistinfolocators("Locators_casesheet_VA_Left_aided_Near"), lan))
	{
	}else {
		Assert.fail("Left aided Near is mismatched with input");
	}
}
public static void casesheet_VArightpinhiole(String rpinhole)
{
	if(Commonfield.patientinfovalidation(patientlistinfolocators("Locators_casesheet_VA_Right_Pinhole"), rpinhole))
	{
	}else {
		Assert.fail("Right_Pinhole is mismatched with input");
	}
}
public static void casesheet_VAleftpinhiole(String lpinhole)
{
	if(Commonfield.patientinfovalidation(patientlistinfolocators("Locators_casesheet_VA_Left_Pinhole"), lpinhole))
	{
	}else {
		Assert.fail("Left Pinhole is mismatched with input");
	}
}
public static void casesheet_righteyecolor(String rightcolor)
{
	if(Commonfield.patientinfovalidation(patientlistinfolocators("Locators_casesheet_VA_Right_Color"), rightcolor))
	{
	}else {
		Assert.fail("Right color is mismatched with input");
	}
}
public static void casesheet_lefteyecolor(String leftcolor)
{
	if(Commonfield.patientinfovalidation(patientlistinfolocators("Locators_casesheet_VA_Left_Color"), leftcolor))
	{
	}else {
		Assert.fail("Left color is mismatched with input");
	}
}

public static void casesheet_treatrefraction(String refraction)
{
	if(Commonfield.patientinfovalidation(patientlistinfolocators("Locators_casesheet_Treatment_refraction"), refraction))
	{
	}else {
		Assert.fail("Treatment refraction value is mismatched with input");
	}	
}
public static void casesheet_referred(String refer, String referfor, String referto)
{
	if(refer.equals("Yes"))
	{
		if(Commonfield.patientinfovalidation(patientlistinfolocators("Locators_casesheet_Refer"), refer))
		{
			if(Commonfield.patientinfovalidation(patientlistinfolocators("Locators_casesheet_Refer_for"), referfor) && Commonfield.patientinfovalidation(patientlistinfolocators("Locators_casesheet_Refer_to"), referto))
			{
			}else {
				Assert.fail("Refer for or Refer to is mismatched with input");
			}
		}else {
			Assert.fail("Do you want to refer is mismatched with input");
		}
	}else if (refer.equals("No")) {
		if(Commonfield.patientinfovalidation(patientlistinfolocators("Locators_casesheet_Refer"), refer))
		{
		}else {
			Assert.fail("Do you want to refer is mismatched with input");
		}
	}
}




public static WebElement patientlistinfolocators(String xpath)
{
	return driver.findElement(By.xpath(prob.getProperty(xpath)));
}
}
