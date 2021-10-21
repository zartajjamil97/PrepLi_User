import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class SignUp extends Base {
    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        AndroidDriver<AndroidElement> driver = Capabilities();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.findElement(By.xpath("//android.widget.TextView[@text='Sign Up!']")).click();
        Thread.sleep(2000);
        //FirstName
        driver.findElement(By.xpath("//android.widget.EditText[@text='First Name']")).sendKeys("Channel");
        //LastName
        driver.findElement(By.xpath("//android.widget.EditText[@text='Last Name']")).sendKeys("Max");
        //Phone number
        Thread.sleep(2000);
        //Select on country code dropdown
        driver.findElement(By.xpath("//android.widget.TextView[@text='+966']")).click();
        //Search Country code Pakistan
        driver.findElement(By.xpath("//android.widget.EditText[@text='Enter country name']")).sendKeys("Pakistan");
        Thread.sleep(2000);
        //Click on pakistan
        driver.findElement(By.xpath("//android.widget.TextView[@text='Pakistan (+92)']")).click();
        //Enter your phone number
        driver.findElement(By.xpath("//android.widget.EditText[@text='Enter your phone number']")).sendKeys("3052410056");
        //Email Address
        driver.findElement(By.xpath("//android.widget.EditText[@text='Email address']")).sendKeys("ChannelMax@yopmail.com");
        //Password
        driver.findElement(By.xpath("//android.widget.EditText[@text='Enter your password']")).sendKeys("PurplE 97");
        //Confirm Password
        driver.findElement(By.xpath("//android.widget.EditText[@text='Confirm password']")).sendKeys("PurplE 97");
        //Submit Button
        driver.findElement(By.xpath("//android.widget.TextView[@text='Sign Up!']")).click();

    }

}
