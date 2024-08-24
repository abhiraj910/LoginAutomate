package com.Demoblaze;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginAutomate  {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		Thread.sleep(2000);
		//To get website
		driver.get("https://www.demoblaze.com/");
		
		
		Thread.sleep(3000);
		//toclick on contact
		driver.findElement(By.xpath("//a[contains(text(),'Contact')]")).click();
		
		// provide gmail
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("#recipient-email")).sendKeys("abhiraj@gmail.com");
		
		//provide name
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("#recipient-name")).sendKeys("Abhishek");
		
		//provide message
		driver.findElement(By.cssSelector("#message-text")).sendKeys("Hlw Abhi");
		
		//back page
//		Thread.sleep(3000);
//		driver.navigate().back();
		
//		Thread.sleep(2000);
		//click on send message
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[3]/button[2]")).click();
   		
//		Thread.sleep(2000);
       Alert alert=driver.switchTo().alert();
       alert.accept();
		
       //to click on sign up
      driver.findElement(By.xpath("//a[@id='signin2']")).click();
      
        //If user not provide credential and click on submit
//		alert.accept();
      Thread.sleep(2000);
		
		//provide user name to sign up
       driver.findElement(By.xpath("//input[@id='sign-username']")).sendKeys("Abhishek");
       
       //provide password
       driver.findElement(By.xpath("//input[@id='sign-password']")).sendKeys("1234");
       
       //signup button click
       driver.findElement(By.xpath("//button[contains(text(),'Sign up')]")).click();
       
       Thread.sleep(2000);
       alert.accept();
       
       driver.findElement(By.xpath("//body/div[@id='signInModal']/div[1]/div[1]/div[3]/button[1]")).click();
		
       //to login
       driver.findElement(By.xpath("//a[@id='login2']")).click();
       
       Thread.sleep(2000);
       //provide username
       driver.findElement(By.xpath("//input[@id='loginusername']")).sendKeys("Abhishek");
       
       //provide password
       driver.findElement(By.xpath("//input[@id='loginpassword']")).sendKeys("1234");
       
       //login button
       driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();
       
       Thread.sleep(2000);
       alert.accept();
		

	}

}
