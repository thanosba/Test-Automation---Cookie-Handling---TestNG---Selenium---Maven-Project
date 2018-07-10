package CookieExample;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class getCookies {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver;
       	System.setProperty("webdriver.chrome.driver","/Users/thanosbabalas/Desktop/cookiehandlingapp/src/main/resources/chromedriver");
        driver=new ChromeDriver();
        //driver.get("http://github.com/login");
        driver.get("https://github.com/login");


        // Input Email id and Password If you are already Register
        driver.findElement(By.name("login")).sendKeys("here write email");
        driver.findElement(By.name("password")).sendKeys("here write your password");
        driver.findElement(By.name("commit")).click();

        // create file named Cookies to store Login Information
        File file = new File("Cookies.data");
        try
        {
            // Delete old file if exists
            file.delete();
            file.createNewFile();
            FileWriter fileWrite = new FileWriter(file);
            BufferedWriter Bwrite = new BufferedWriter(fileWrite);
            // loop for getting the cookie information

            // loop for getting the cookie information
            for(Cookie ck : driver.manage().getCookies())
            {
                Bwrite.write((ck.getName()+";"+ck.getValue()+";"+ck.getDomain()+";"+ck.getPath()+";"+ck.getExpiry()+";"+ck.isSecure()));
                Bwrite.newLine();
            }
            Bwrite.close();
            fileWrite.close();

        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }
}