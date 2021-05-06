package com.automation.practice.tests;

import org.testng.annotations.Test;

import com.automation.practice.pages.MainPages;

public class MainPagesTest extends BaseTest {
	
	@Test
	public void checkboxDemoTest()
	{
		MainPages mp=new MainPages();
		mp.selectCheckboxDemoOption();
	}

}
