package patientlist;

import java.io.IOException;

import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import initialize.Browserinitializer;
import initialize.Searchfilter;

public class Patientlisttest extends Browserinitializer{

static String browser;
static String url;
static String username;
static String pass;

@Given ("^Select the browser as (.*)$")
public void camp_browser(String Browser)
{
	browser(Browser);
}
@When ("^Give the camp management url as (.*)$")
public void camp_geturl(String Url)
{
	getcampurl(Url);
}
@And ("^Enter the camp user name as (.*)$")
public void camp_username(String user)
{
	getusername(user);
}
@But ("^Enter the camp user passdword as (.*)$")
public void camp_pass(String pass)
{
	getpassword(pass);
}
@Then ("^click to login button$")
public void camp_login()
{
	login();
}
@When ("^click to patientlist tab and search filter link for search the patient in worklist$")
public void camp_patientsearchfilter()
{
	Searchfilter.clickpatientlist();
	Searchfilter.clicksearchfilter();
}
@And ("^Give the uid and patientname respective as (.*), (.*) in search filter$")
public void camp_UIDpatientnamesearch(String UID, String patientname) throws IOException
{
	Patientlisttestpage.searchfilter_uid(UID);
	Patientlisttestpage.searchfilter_patientname(patientname);
}
@Then ("^click to search button$")
public void camp_searchbutton() throws InterruptedException
{
	Patientlisttestpage.searchfilter_searchbutton();
	Thread.sleep(3000);
}
@But ("^validate Uid, patientname, age as (.*), sex as (.*) and mobileno as (.*) in worklist$")
public void camp_worklistvalidation(Integer age, String Sex, Double mobileno)
{
	Patientlisttestpage.worklist_patientvalidation(age, Sex, mobileno);
}
@When ("^Click to patientid link$")
public void camp_patientidlink()
{
	Patientlisttestpage.worklist_patientidlink();
}
@And ("^Validate the uid, patientname, age, sex and mobileno in patient info$")
public void camp_patientinfovali1()
{
	Patientlisttestpage.patientinfo_patientvalidation1();
}
@But ("^Validate the address, state, district and taluk as (.*), (.*), (.*), (.*) in patient info$")
public void camp_patientinfovali2(String Address, String State, String District, String Taluk)
{
	Patientlisttestpage.patientinfo_patientvalidation2(Address, State, District, Taluk);
}
@Then ("^Validate the aadhaarno, occupation, caste and income as (.*), (.*), (.*), (.*) in patient info$") 
public void camp_patientinfovali3(String Aadhaarno, String Occupation, String Caste, String Income)
{
	Patientlisttestpage.patientinfo_patientvalidation3(Aadhaarno, Occupation, Caste, Income);
}
@When ("^Validate the Token id as (.*) in patient info$")
public void camp_patientinfotoken(String Token)
{
	Patientlisttestpage.patientinfo_tokenidvalidate(Token);
}
@And ("^Click to casesheet tab for validation$")
public void camp_casesheettab() throws InterruptedException
{
	Patientlisttestpage.casesheet_casesheettab();
}
@When ("^Have you had a medical check up in the past one year as (.*) in general questions$")
public void camp_generalquestion1(String General1)
{
	Patientlisttestpage.casesheet_general1(General1);
}
@But ("^Do you have Diabetes as (.*) in general questions$")
public void camp_generalquestion2(String General2)
{
	Patientlisttestpage.casesheet_general2(General2);
}
@And ("^Do you have Hypertension as (.*) in general questions$")
public void camp_generalquestion3(String General3)
{
	Patientlisttestpage.casesheet_general3(General3);
}
@Then ("^Do you Smoke as (.*) in general questions$")
public void camp_generalquestion4(String General4)
{
	Patientlisttestpage.casesheet_general4(General4);
}
@When ("^Do you consume Alcohol as (.*) in general questions$")
public void camp_generalquestion5(String General5)
{
	Patientlisttestpage.casesheet_general5(General5);
}
@And ("^Have you ever had eye examination as (.*) in general questions$")
public void camp_generalquestion6(String General6)
{
	Patientlisttestpage.casesheet_general6(General6);
}
@Given ("^Do you have any difficulty in seeing distant object as (.*) in general questions$")
public void camp_generalquestion7(String General7)
{
	Patientlisttestpage.casesheet_general7(General7);
}
@When ("^Have you been advised to wear glassess ever as (.*) in general questions$")
public void camp_generalquestion8(String General8)
{
	Patientlisttestpage.casesheet_general8(General8);
}
@But ("^Are you using any glasses currently as (.*) in general questions$")
public void camp_generalquestion9(String General9)
{
	Patientlisttestpage.casesheet_general9(General9);
}
@Then ("^Are you aware of nearby hospital as (.*) and Type of hospital as (.*) in general questions$")
public void camp_generalquestion10(String General10, String General11)
{
	Patientlisttestpage.casesheet_general10(General10, General11);
}
@And ("^Validate the Blood pressure max level as (.*) over min level as (.*) in Medical Examination$")
public void camp_Bloodpressure(String Bpmax, String BPmin)
{
	Patientlisttestpage.casesheet_bloodpressure(Bpmax, BPmin);
}
@But ("^Validate the Blood sugar as (.*) in Medical Examination$")
public void camp_Bloodsugar(Integer Bloodsugar)
{
	Patientlisttestpage.casesheet_bloodsugar(Bloodsugar);
}
@Then ("^Validate the Syringing as (.*) in Medical Examination$")
public void camp_Syringing(String Syring)
{
	Patientlisttestpage.casesheet_syringing(Syring);
}
@When ("^Validate the Weight and Height as (.*), (.*) in Medical Examination$")
public void camp_Weightandheight(Integer Weight, Integer Height)
{
	Patientlisttestpage.casesheet_weightheight(Weight, Height);
}
@Given ("^Validate the Right and Left eye Intraocular pressure as (.*), (.*)$")
public void camp_Eyeintraocularpressure(String RighteyeIntracular, String LefteyeIntracular)
{
	Patientlisttestpage.casesheet_intraocularpressure(RighteyeIntracular, LefteyeIntracular);
}
@But ("^validate the VA Right eye Un-Aided Distance as (.*)$")
public void camp_VArightUAdistance(String RUAD)
{
	Patientlisttestpage.casesheet_VArightuadis(RUAD);
}
@When ("^validate the VA Right eye Un-Aided Near as (.*)$")
public void camp_VArightUAnear(String RUAN)
{
	Patientlisttestpage.casesheet_VArightuanear(RUAN);
}
@But ("^validate the VA Left eye Un-Aided Distance as (.*)$")
public void camp_VAleftUAdistance(String LUAD)
{
	Patientlisttestpage.casesheet_VAleftuadis(LUAD);
}
@And ("^validate the VA Left eye Un-Aided Near as (.*)$")
public void camp_VAleftUAnear(String LUAN)
{
	Patientlisttestpage.casesheet_VAleftuanear(LUAN);
}
@Then ("^validate the VA Right eye Aided Dist as (.*)$")
public void camp_VArightAdistance(String RAD)
{
	Patientlisttestpage.casesheet_VArightadis(RAD);
}
@But ("^validate the VA Right eye Aided Near as (.*)$")
public void camp_VArightAnear(String RAN)
{
	Patientlisttestpage.casesheet_VArightanear(RAN);
}
@When ("^validate the VA Left eye Aided Dist as (.*)$")
public void camp_VAleftAdistance(String LAD)
{
	Patientlisttestpage.casesheet_VAleftadis(LAD);
}
@And ("^validate the VA Left eye Aided Near as (.*)$")
public void camp_VAleftAnear(String LAN)
{
	Patientlisttestpage.casesheet_VAleftanear(LAN);
}
@But ("^validate the VA Right eye Pinhole as (.*)$")
public void camp_VArightpinhole(String Rpinhole)
{
	Patientlisttestpage.casesheet_VArightpinhiole(Rpinhole);
}
@Then ("^validate the VA Left eye Pinhole as (.*)$")
public void camp_VAleftpinhole(String Lpinhole)
{
	Patientlisttestpage.casesheet_VAleftpinhiole(Lpinhole);
}
@And ("^validate the VA Right eye color as (.*)$")
public void camp_righteyecolor(String Rcolor)
{
	Patientlisttestpage.casesheet_righteyecolor(Rcolor);
}
@Given ("^validate the VA Left eye color as (.*)$")
public void camp_lefteyecolor(String Lcolor)
{
	Patientlisttestpage.casesheet_lefteyecolor(Lcolor);
}
@And ("^Validate the Treatment for refraction as (.*) in casesheet$")
public void camp_Treatmentrefraction(String Refraction)
{
	Patientlisttestpage.casesheet_treatrefraction(Refraction);
}
@When ("^Validate the Do you want to refer as (.*), and Refer for as (.*) then Referred to (.*)$")
public void camp_refer(String Refer, String Referfor, String Referto)
{
	Patientlisttestpage.casesheet_referred(Refer, Referfor, Referto);
}
}
