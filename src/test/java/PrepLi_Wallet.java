import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class PrepLi_Wallet extends Base {
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
        //Scroll down till Indian shop
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))" +
                ".scrollIntoView(new UiSelector().text(\"Indian Shop\"))");
        Thread.sleep(5000);
        //Click on Indian Branch 1
        driver.findElement(By.xpath("//android.widget.TextView[@text='Indian Branch 1']")).click();
        //Click on menu Pizza
        driver.findElement(By.xpath("//android.widget.TextView[@text='Pizza']")).click();
        //Scroll down till add to cart button
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))" +
                ".scrollIntoView(new UiSelector().text(\"Add To Cart\"))");
        Thread.sleep(9000);
        //Click on add to cart button
        driver.findElement(By.xpath("//android.widget.TextView[@text='Add To Cart']")).click();
        //Click on go to cart button
        driver.findElement(By.xpath("//android.widget.TextView[@text='Go to Cart']")).click();

        // Order placing through Wallet
        //Click on change button
        driver.findElement(By.xpath("//android.widget.TextView[@text='Change']")).click();

        //Click on wallet checkbox
        driver.findElement(By.xpath("//android.widget.TextView[@text='Wallet ( NaN )']")).click();

        //Click on Continue Button
        driver.findElement(By.xpath("//android.widget.TextView[@text='Continue']")).click();

        //click on place order button, Order is placing through Crd
        driver.findElement(By.xpath("//android.widget.TextView[@text='Place Order']")).click();

        //Click on continue button
        driver.findElement(By.xpath("//android.widget.TextView[@text='Continue']")).click();
        Thread.sleep(15000);

        //Click on Continue Button
        driver.findElement(By.xpath("//android.widget.TextView[@text='Continue']")).click();
    }
}


