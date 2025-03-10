package com.automation.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class LoginTest {


	     ChromeDriver driver;
		 
			void setup()
			{
				
			System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\SRI\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
			 driver=new ChromeDriver();
	         driver.manage().window().maximize();  
	         driver.get("https://practicetestautomation.com/practice-test-login/"); 
		  }
	        void login_with_valid_credentials()
	        {
	        	
	        System.out.println("-------------Login with Valid Password--------------");
	        driver.findElement(By.id("username")).sendKeys("student");
	        driver.findElement(By.id("password")).sendKeys("Password123");
	        driver.findElement(By.id("submit")).click();
	        WebElement e1 =driver.findElement(By.xpath("//strong[text()='Congratulations student. You successfully logged in!']"));
	        e1.getText();
	        System.out.println(e1.getText());
	        driver.findElement(By.xpath("//a[text()= 'Log out']")).click();
	        }
	        
	        void login_with_invalid_username()
	        {
	        System.out.println("-------------Login with  invalid username valid Password--------------");
	        driver.findElement(By.id("username")).sendKeys("Student");
	        driver.findElement(By.id("password")).sendKeys("Password123");
	        driver.findElement(By.id("submit")).click();
	        WebElement e2 =driver.findElement(By.id("error"));
	        String s2= e2.getText();
	        System.out.println(s2);
	        }
	        void login_with_invalid_pwd()
	        {
	        System.out.println("-------------Login with  valid username invalid Password--------------");
	        driver.findElement(By.id("username")).sendKeys("student");
	        driver.findElement(By.id("password")).sendKeys("Password12345");
	        driver.findElement(By.id("submit")).click();
	        WebElement e3 =driver.findElement(By.id("error"));
	        String s3= e3.getText();
	        System.out.println(s3);
	        }
	        
	        void login_with_invalid_credentials()
	        {
	        
	        System.out.println("-------------Login with  invalid username invalid Password--------------");
	        driver.findElement(By.id("username")).sendKeys("Student");
	        driver.findElement(By.id("password")).sendKeys("Password12345");
	        driver.findElement(By.id("submit")).click();
	        WebElement e4 =driver.findElement(By.id("error"));
	        String s4= e4.getText();
	        System.out.println(s4);
	        }
	        
	        void close()
	        {
	        driver.quit();
	        
	        }
	        
	        public static void main(String[] args)
	    	{
	    		
	        // TODO Auto-generated method stub
	    		
	        	LoginTest test = new LoginTest();
	    		test.setup();
	    		test.login_with_valid_credentials();
	    		test.login_with_invalid_username();
	    		test.login_with_invalid_pwd();
	    		test.login_with_invalid_credentials();
	    		test.close();
	    		
	    	}
	        
	        }
			