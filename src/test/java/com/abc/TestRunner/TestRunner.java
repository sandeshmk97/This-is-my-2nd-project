package com.abc.TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(
		features ="C:\\Users\\sandesh MK\\selenium webdriver\\FacebookCucumber\\src\\test\\java\\login\\login.feature",
		glue ="com.abc.stepdefinition",
		dryRun= false
		)
public class TestRunner 
	{
		
	}
