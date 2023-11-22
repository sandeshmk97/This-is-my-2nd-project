package com.abc.stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class LoginStepDefnition 
		//facebook Register functionality 
	{
		ChromeDriver driver1;
		@Given("open the browser")
		public void Openbrowser1()
		{
		System.setProperty("webdriver.chrome.driver","C:\\\\\\\\Users\\\\\\\\sandesh MK\\\\\\\\Desktop\\\\\\\\selenium webdriver\\\\\\\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions(); 
		options.addArguments("disable-notifications");
		driver1=new ChromeDriver(options);
		driver1.manage().window().maximize();
		driver1.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		}
		//REGISTER TO FACEBOOK
		@Given("navigate to {string}website")
		public void NavigateToUrl1(String s)
		{
			driver1.get(s);
		}
		@When("click on create New Account")
		public void CreateNewAccount()
		{
			driver1.findElement(By.xpath("//input[@class='bh bi bj bt bl bu']")).click();
		}
		@When("enter valid First Name")
		public void EnterFirstName()
		{
			driver1.findElement(By.name("firstname")).sendKeys("sandesh");
		}
		@When("enter valid Sur Name")
		public void EnterSurName()
		{
			driver1.findElement(By.name("lastname")).sendKeys("mk");
		}
		@When ("Enter valid Email Address")
		public void EnterEmailAddress()
		{
			driver1.findElement(By.name("reg_email__")).sendKeys("sandeshmk01@gmail.com");
		}
		@When ("click on valid gender")
		public void EnterGender()
		{
			driver1.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/table/tbody/tr/td/form/div[3]/div/div[2]/div/table/tbody/tr/td[2]/label/span")).click();
		}
		@When("Enter valid date of Birth")
		public void EnterDateOfbirth()
		{
			WebElement myDropdown=driver1.findElement(By.id("day"));
			myDropdown.click();
			Select s=new Select(myDropdown);
			s.selectByIndex(0);
			
			   WebElement myDropdown1=driver1.findElement(By.id("month"));
				myDropdown1.click();
				Select s1=new Select(myDropdown1);
				   s1.selectByIndex(1);
				   
				   WebElement myDropdown2=driver1.findElement(By.id("year"));
					myDropdown2.click();
					Select s2=new Select(myDropdown2);
					   s2.selectByIndex(26);
		}			   
		@When ("Enter valid password")
		public void EnterValidPassword()
		{
			driver1.findElement(By.name("reg_passwd__")).sendKeys("Cognizant@2023");
		}
		
		@When("Click on sign up")
		public void ClickOnSignUp()
		{
			driver1.findElement(By.id("signup_button")).click();
		}
		@When ("Enter Confirmation code")
		public void EnterConfirmcode()
		{
			driver1.findElement(By.name("c")).sendKeys("54559");
			
		}
		@When ("Click On confirm")
		public void ClickOnConfirm()
		{
			driver1.findElement(By.name("submit[confirm]")).click();
		}
		@And("Close the Browser")
		public void CloseBrowser()
		{
		driver1.close();	
	}
	}
		
		//LOGIN in to fb, SEARCH for Friend by name and Send friend request//
		
		/* @Given("open the browser")
		public void Openbrowser()
		{
			System.setProperty("webdriver.chrome.driver","C:\\\\\\\\Users\\\\\\\\sandesh MK\\\\\\\\Desktop\\\\\\\\selenium webdriver\\\\\\\\chromedriver.exe");
			ChromeOptions options = new ChromeOptions(); 
			options.addArguments("disable-notifications");
			driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		}
		@Given("navigate to {string}website")
		public void NavigateToUrl(String s)
		{
			driver.get(s);
		}
		@When("enter a valid email")
	   public void EnteraValidEmail()
	   {
		   driver.findElement(By.name("email")).sendKeys("sandeshmk01@gmail.com");
	   }
		@When("enter a valid password")
	   public void EnterValidPassword()
	   {
		   driver.findElement(By.name("pass")).sendKeys("Cognizant@2023");
	   }
		@When("click on Log in button")
	   public void ClickOnLoginbutton()
	   {
		   driver.findElement(By.name("login")).click();   	   
	   }
		@When ("click on ok")
		public void ClickOk()
		{
			driver.findElement(By.xpath("/html/body/div/div/div/div/table/tbody/tr/td/div/form/div/input")).click();
		}
		@When("click on find friends")
		public void FindFriends()
		{
			driver.findElement(By.xpath("/html/body/div/div/div[1]/div/nav/a[6]")).click();
		}
		@When("click on search for friends")
		public void searchforfriends()
		{
			driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/div[2]/div/div/a")).click();
		}
		@When ("Enter valid friend name")
		public void validfriendname()
		{
			driver.findElement(By.name("q")).sendKeys("Sandesh mk gowda");
		}
		@When ("Click on search")
		public void search()
		{
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		}
		@When ("Enter valid friend name1")
		public void enterVlaidname1()
		{
			driver.findElement(By.name("q")).sendKeys("sandesh mk gowda");
		}
		@When ("Click on search1")
		public void search1()
		{
		driver.findElement(By.name("submit")).click();
		}
		@When ("Click on Add friend")
		public void Addfriend()
		{
			driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/div[1]/div/div[1]/table/tbody/tr/td[2]/div[2]/a")).click();
		}
		@And("Close the Browser")
	public void CloseBrowser()
	{
	driver.close();	
	}
	}*/
		           
		          
		//Logging out from facebook
		
		/*@Given("open the browser")
		public void Openbrowser()
		{
			System.setProperty("webdriver.chrome.driver","C:\\\\\\\\Users\\\\\\\\sandesh MK\\\\\\\\Desktop\\\\\\\\selenium webdriver\\\\\\\\chromedriver.exe");
			ChromeOptions options = new ChromeOptions(); 
			options.addArguments("disable-notifications");
			driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		}
		@Given("navigate to {string}website")
		public void NavigateToUrl(String s)
		{
			driver.get(s);
		}
		@When("enter a valid email")
	   public void EnteraValidEmail()
	   {
		   driver.findElement(By.name("email")).sendKeys("sandeshmk01@gmail.com");
	   }
		@When("enter a valid password")
	   public void EnterValidPassword()
	   {
		   driver.findElement(By.name("pass")).sendKeys("Cognizant@2023");
	   }
		@When("click on Log in button")
	   public void ClickOnLoginbutton()
	   {
		   driver.findElement(By.name("login")).click();   	   
	   }
		@When ("click on ok")
		public void ClickOk()
		{
			driver.findElement(By.xpath("/html/body/div/div/div/div/table/tbody/tr/td/div/form/div/input")).click();
		}
		@When ("click on logout")
		public void ClickOnLogout()
		{
			driver.findElement(By.id("mbasic_logout_button")).click();
		}
		@And("Close the Browser")
	public void CloseBrowser()
	{
	driver.close();	
	}
	}*/
		
		
		
	//checking others profile in facebook//
		
		/*ChromeDriver driver;
		@Given("open the browser")
		public void Openbrowser()
		{
			System.setProperty("webdriver.chrome.driver","C:\\\\\\\\Users\\\\\\\\sandesh MK\\\\\\\\Desktop\\\\\\\\selenium webdriver\\\\\\\\chromedriver.exe");
			ChromeOptions options = new ChromeOptions(); 
			options.addArguments("disable-notifications");
			driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		}
		@Given("navigate to {string}website")
		public void NavigateToUrl(String s)
		{
			driver.get(s);
		}
		@When("enter a valid email")
	   public void EnteraValidEmail()
	   {
		   driver.findElement(By.name("email")).sendKeys("sandeshmk01@gmail.com");
	   }
		@When("enter a valid password")
	   public void EnterValidPassword()
	   {
		   driver.findElement(By.name("pass")).sendKeys("Cognizant@2023");
	   }
		@When("click on Log in button")
	   public void ClickOnLoginbutton()
	   {
		   driver.findElement(By.name("login")).click();   	   
	   }
		@When ("click on ok")
		public void ClickOk()
		{
			driver.findElement(By.xpath("/html/body/div/div/div/div/table/tbody/tr/td/div/form/div/input")).click();
		}
		@When("click on Edit profile")
		public void EditProfile()
		{
			driver.findElement(By.xpath("/html/body/div/div/div[1]/div/nav/a[2]\r\n")).click();
		}
		@When("click on find friends")
		public void ClickonFindFriends()
		{
			driver.findElement(By.xpath("/html/body/div/div/div[1]/div/nav/a[6]\r\n")).click();
		}
		@When("enter valid name")
		public void EnterValidName()
		{
		driver.findElement(By.name("query")).sendKeys("shiva prasad");	
		}
		@When ("Click on search")
		public void ClickonSearch()
		{
			driver.findElement(By.xpath("//input[@type='submit']")).click();
		}
		@When("click on name")
		public void ClickonName()
		{
			driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div[1]/div[2]/div[1]/div/div/div/div[1]/div/table/tbody/tr/td[2]/a")).click();
		}
		@And("Close the Browser")
	public void CloseBrowser()
	{
	driver.close();	
	}
	}*/
		
		
		
		//Log in to facebook with invalid credentials //
		
		
		//ChromeDriver driver;
		/*@Given("open the browser")
		public void Openbrowser()
		{
			System.setProperty("webdriver.chrome.driver","C:\\\\\\\\Users\\\\\\\\sandesh MK\\\\\\\\Desktop\\\\\\\\selenium webdriver\\\\\\\\chromedriver.exe");
			ChromeOptions options = new ChromeOptions(); 
			options.addArguments("disable-notifications");
			driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		}
		@Given("navigate to {string}website")
		public void NavigateToUrl(String s)
		{
			driver.get(s);
		}
		@When("enter a invalid email")
	   public void EnteraInValidEmail()
	   {
		   driver.findElement(By.name("email")).sendKeys("sbdhbsdbcsbdj");
	   }
		@When("enter a invalid password")
	   public void EnterInValidPassword()
	   {
		   driver.findElement(By.name("pass")).sendKeys("jdncjsd");
	   }
		@When("click on Log in button")
	   public void ClickOnLoginbutton()
	   {
		   driver.findElement(By.name("login")).click();   	   
	   }
	   @And("Close the Browser")
	public void CloseBrowser()
	{
	driver.close();	
	}
	]*/
		
		
	     //ACCEPTING FRIEND REQUEST//
		
		
		/*@Given("open the browser")
		public void Openbrowser()
		{
			System.setProperty("webdriver.chrome.driver","C:\\\\\\\\Users\\\\\\\\sandesh MK\\\\\\\\Desktop\\\\\\\\selenium webdriver\\\\\\\\chromedriver.exe");
			ChromeOptions options = new ChromeOptions(); 
			options.addArguments("disable-notifications");
			driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		}
		@Given("navigate to {string}website")
		public void NavigateToUrl(String s)
		{
			driver.get(s);
		}
		@When("enter a valid email")
	   public void EnteraValidEmail()
	   {
		   driver.findElement(By.name("email")).sendKeys("sandeshmk01@gmail.com");
	   }
		@When("enter a valid password")
	   public void EnteraValidPassword()
	   {
		   driver.findElement(By.name("pass")).sendKeys("Cognizant@2023");
	   }
		@When("click on Log in button")
	   public void ClickOnLoginbutton()
	   {
		   driver.findElement(By.name("login")).click();   	   
	   }
	    @When ("click on ok")
		public void ClickOk()
		{
			driver.findElement(By.xpath("/html/body/div/div/div/div/table/tbody/tr/td/div/form/div/input")).click();
		}
	    @When("Click on Find Friends")
	    public void FindFriends()
		{
			driver.findElement(By.xpath("/html/body/div/div/div[1]/div/nav/a[6]/strong")).click();
		}
	    
	    @When("click on confirm")
	    public void ClickonConfirm()
		{
			driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/div[1]/div/table/tbody/tr/td[2]/div[2]/a[1]")).click();
		}
		@And("Close the Browser")
	public void CloseBrowser()
	{
	driver.close();	
	}
	}*/
		
		
		
	    
		
