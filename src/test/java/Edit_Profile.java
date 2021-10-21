import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class Edit_Profile extends Base {
    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        AndroidDriver<AndroidElement> driver = Capabilities();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //Select on country code dropdown
        driver.findElements(By.className("android.widget.ImageView")).get(1).click();
        //Search Country code Pakistan
        driver.findElement(By.xpath("//android.widget.EditText[@text='Enter country name']")).sendKeys("Pakistan");
        Thread.sleep(2000);
        //Click on pakistan
        driver.findElement(By.xpath("//android.widget.TextView[@text='Pakistan (+92)']")).click();
        //Enter your phone number
        driver.findElement(By.xpath("//android.widget.EditText[@text='Enter your phone number']")).sendKeys("3052410056");
        //Enter your Password
        driver.findElement(By.xpath("//android.widget.EditText[@text='Enter your password']")).sendKeys("Admin 123");
        Thread.sleep(2000);
        //Click on Sign In button
        driver.findElement(By.xpath("//android.widget.TextView[@text='Sign In']")).click();
        Thread.sleep(9000);

        //Click on menu
        //then click on profile
        driver.findElement(By.xpath("//android.widget.TextView[@text='My Profile']")).click();
        //Click on my profile option
        Thread.sleep(6000);
        //Click on Edit Profile option
        driver.findElement(By.xpath("//android.widget.TextView[@text='Edit Profile']")).click();

        //Change the FirstName
        driver.findElement(By.xpath("//android.widget.EditText[@text='Channell']")).sendKeys("Channel");
        //Change The LastName
        driver.findElement(By.xpath("//android.widget.EditText[@text='Maxx']")).sendKeys("Max");
        //Click on Update button
        driver.findElement(By.xpath("//android.widget.TextView[@text='Update']")).click();
    }
}
