package qspiders;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RunTimePoly {

	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver = null;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the browsername:GC/FF");
		String browser = sc.next();
		if(browser.equals("FF")) {
			driver=new FirefoxDriver();
		}
		else if(browser.equals("GC")) {
			driver=new ChromeDriver();
		}
		driver.get("http://localhost/login.do");
		Thread.sleep(2000);
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.close();
		
	}

}
