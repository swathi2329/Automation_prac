package com.automation.practice.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPages extends BaseClass {

	public MainPages()  {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//div[@id='navbar-brand-centered']/ul/li/a[normalize-space()='Input Forms']")
	private WebElement inputforms_dropdown;
	
	@FindBy(xpath = "(//li/a[normalize-space()='Simple Form Demo'])[1]")
	private WebElement simpleFormDemo_option;
	@FindBy(xpath = "(//li/a[normalize-space()='Checkbox Demo'])[1]")
	private WebElement CheckboxDemo_option;
	@FindBy(xpath = "(//li/a[normalize-space()='Radio Buttons Demo'])[1]")
	private WebElement RadioButtonsDemo_option;
	@FindBy(xpath = "(//li/a[normalize-space()='Select Dropdown List'])[1]")
	private WebElement SelectDropdownList_option;
	@FindBy(xpath = "(//li/a[normalize-space()='Input Form Submit'])[1]")
	private WebElement InputFormSubmit_option;
	@FindBy(xpath = "(//li/a[normalize-space()='Ajax Form Submit'])[1]")
	private WebElement AjaxFormSubmit_option;
	@FindBy(xpath = "(//li/a[normalize-space()='JQuery Select dropdown'])[1]")
	private WebElement JQuerySelectdropdown_option;
	
	public void selectCheckboxDemoOption()
	{
		inputforms_dropdown.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		CheckboxDemo_option.click();
	}
	
	
	
}
