package com.atmecs.project.script;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.atmecs.project.constants.Constants;
import com.atmecs.project.constants.PageGetText;
import com.atmecs.project.helper.MouseOver;
import com.atmecs.project.helper.Scrolling;
import com.atmecs.project.helper.Wait;
import com.atmecs.project.report.LoggerReportInfo;
import com.atmecs.project.testbase.Browsers;
import com.atmecs.project.utils.propertyReader;



/**
 * Validate context menu and footer
 * @author ranjitha.selvam
 *
 */
public class VerifyFooter extends Browsers {

	@Test
	public void verifyFooter() throws IOException {

		Wait.implicitWait(driver);
		MouseOver.click(driver, propertyReader.properties(Constants.footer_file, "loc_home_xpath_link"));
		Scrolling.scrollingDown();
		LoggerReportInfo.logReporter("Home page footer...");
		String home = PageGetText.text(propertyReader.properties(Constants.footer_file, "loc_footer_xpath_link"),
				"Homepage Footer");

		MouseOver.click(driver, propertyReader.properties(Constants.footer_file, "loc_aboutus_xpath_link"));
		Scrolling.scrollingDown();
		LoggerReportInfo.logReporter("AboutUs page footer...");
		String aboutUs = PageGetText.text(propertyReader.properties(Constants.footer_file, "loc_footer_xpath_link"),
				"Aboutuspage Footer");

		MouseOver.click(driver, propertyReader.properties(Constants.footer_file, "loc_service_xpath_link"));
		Scrolling.scrollingDown();
		LoggerReportInfo.logReporter("Service Page footer...");
		String service = PageGetText.text(propertyReader.properties(Constants.footer_file, "loc_footer_xpath_link"),
				"Servicepage Footer");

		MouseOver.click(driver, propertyReader.properties(Constants.footer_file, "loc_partner_xpath_link"));
		Scrolling.scrollingDown();
		LoggerReportInfo.logReporter("Partner page footer...");
		String partner = PageGetText.text(propertyReader.properties(Constants.footer_file, "loc_footer_xpath_link"),
				"Partnerpage Footer");

		MouseOver.click(driver, propertyReader.properties(Constants.footer_file, "loc_insight_xpath_link"));
		Scrolling.scrollingDown();
		LoggerReportInfo.logReporter("Insight page footer...");
		String insight = PageGetText.text(propertyReader.properties(Constants.footer_file, "loc_footer_xpath_link"),
				"InsightPage Footer");

		MouseOver.click(driver, propertyReader.properties(Constants.footer_file, "loc_carrers_xpath_link"));
		Scrolling.scrollingDown();
		LoggerReportInfo.logReporter("Carrers page footer...");
		String carrers = PageGetText.text(propertyReader.properties(Constants.footer_file, "loc_footer_xpath_link"),
				"CarrersPage Footer");

		MouseOver.click(driver, propertyReader.properties(Constants.footer_file, "loc_contactus_xpath_link"));
		Scrolling.scrollingDown();
		LoggerReportInfo.logReporter("Contact us page footer....");
		String contactUs = PageGetText.text(propertyReader.properties(Constants.footer_file, "loc_footer_xpath_link"),
				"contactusPage Footer");

		LoggerReportInfo.logReporter("verifying footer.....");
		if (aboutUs.equals(home) && insight.equals(home) && service.equals(home) && carrers.equals(home)
				&& partner.equals(home) && contactUs.equals(home)) {
			LoggerReportInfo.logReporter("Verified that all the pages are having the footer");

		} else {
			LoggerReportInfo.logReporter("All the pages are not having the footer");
		}

	}

	/*@Test
	public void contextMenuItem() throws IOException {
		driver.findElement(By.xpath(propertyReader.properties(Constants.contextMenu_file, "loc_service_xpath_link")));

		WebElement menu = driver.findElement(
				By.xpath(propertyReader.properties(Constants.contextMenu_file, "loc_digitallife_xpath_slt")));
		Select select = new Select(menu);
		List<WebElement> allSelectedOptions = select.getAllSelectedOptions();
		for (WebElement x : allSelectedOptions) {
			System.out.println(x.getText());
		}*/

	}


