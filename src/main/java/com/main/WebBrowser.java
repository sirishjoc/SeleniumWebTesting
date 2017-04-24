package com.main;

import java.awt.image.BufferedImage;
import java.io.File;
import java.net.URL;

import javax.imageio.ImageIO;

import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebBrowser {
	
	public static void main(String[] args) {
		// Create WebDriver reference
        WebDriver driver;
        
        // Set path for Chrome Driver executable
        System.setProperty("webdriver.chrome.driver", "/opt/chromedriver");
        
        File addonpath = new File("/home/lenovo/Downloads/3.8.2_0.crx");
        ChromeOptions chrome = new ChromeOptions();
        chrome.addExtensions(addonpath);
        
        // Launch ChromeDriver
        driver = new ChromeDriver(chrome);
        
        // Open the web page
        // For sales force
//        driver.get("http://staging.salesai.fusemachines.com/login");
//        
//        driver.findElement(ByClassName.className("login-email")).sendKeys("sirish@parakhi.com");
//        
//        driver.findElement(ByClassName.className("login-password")).sendKeys("123456");
//        
//        driver.findElement(ByClassName.className("login-submit")).click();
        try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        // For downloading manga pages
        driver.get("http://mangafox.me/manga/tales_of_demons_and_gods/c107/1.html");
        
        for(int i = 1 ; i < 10; i++){
        	
        	 try {
     			Thread.sleep(4000);
     		} catch (InterruptedException e) {
     			// TODO Auto-generated catch block
     			e.printStackTrace();
     		}
        	
//        	URL url;
//			try {
//				url = new URL(driver.findElement(ById.id("image")).getAttribute("src"));
//				System.out.println(url.toString());
//				BufferedImage bufImgOne = ImageIO.read(url);
//				ImageIO.write(bufImgOne, "jpg", new File("page"+i+".jpg"));
//			} catch (Exception e1) {
//				e1.printStackTrace();
//			}
            
			// This was a code for CTRL + s command but didnot work
//        	String download = Keys.chord(Keys.CONTROL, "s");
//        	newdriver.findElement(ByTagName.tagName("img")).sendKeys(download);
        	 
        	 
        	driver.findElement(ByClassName.className("next_page")).click();
        }
        
//        List<WebElement> searchText = driver.findElements(ByClassName.className("title"));
//        System.out.println(searchText.get(1).getText());
        
        // Enter the text in the search box
//        WebElement searchText = driver.findElement(By.name("q"));
//        searchText.sendKeys("ChromeDriver");
        
        // Close the driver
        driver.quit();
	}
}
