package com.atmecs.project.script;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.atmecs.project.constants.Constants;
import com.atmecs.project.constants.PageGetText;
import com.atmecs.project.helper.MouseOver;
import com.atmecs.project.helper.Wait;
import com.atmecs.project.report.LoggerReportInfo;
import com.atmecs.project.testbase.Browsers;
import com.atmecs.project.utils.propertyReader;
import com.atmecs.project.validation.WebSiteValidation;

public class SearchBlogs extends Browsers {
	@Test
	public static void searchLog() throws IOException {
		Wait.implicitWait(driver);
		MouseOver.click(driver, propertyReader.properties(Constants.blogs_file, "loc_insight_xpath_link"));

		driver.findElement(By.xpath(propertyReader.properties(Constants.blogs_file, "loc_blogs_xpath_clk"))).click();

		LoggerReportInfo.logReporter("Actual date");
		String oldDate = PageGetText.text(propertyReader.properties(Constants.blogs_file, "loc_date_xpath_slt"),
				"Three months before blogs");
		LoggerReportInfo.logReporter("Expected date");
		System.out.println("Current date : sep 26, 2019");
		WebSiteValidation.pageValidation(oldDate, "sep 26, 2019");
		LoggerReportInfo.logReporter("The actual date is not equal to the expected date");
		boolean title = driver
				.findElement(By.xpath(propertyReader.properties(Constants.blogs_file, "loc_title_xpath_txt")))
				.isEnabled();
		if (title == true) {
			LoggerReportInfo.logReporter("Title is enabled");
		} else {
			LoggerReportInfo.logReporter("Not enable");
		}

		Wait.explicitWait(driver, propertyReader.properties(Constants.blogs_file, "loc_ai_xpath_slt"));
		
	}

}
