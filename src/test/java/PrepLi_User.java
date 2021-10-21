import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class PrepLi_User extends Base {
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
        //Click n indian shop image
        //driver.findElement(By.xpath("//android.widget.ImageView[@bounds='[101,961][1339,1463]']")).click();
        //Click on Indian Branch 1
        driver.findElement(By.xpath("//android.widget.TextView[@text='Indian Branch 1']")).click();
        //Click on menu Pizza
        driver.findElement(By.xpath("//android.widget.TextView[@text='Pizza']")).click();
        //Scroll down till add to cart button
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))" +
                ".scrollIntoView(new UiSelector().text(\"Add To Cart\"))");
        //Click on customization values
        driver.findElement(By.xpath("//android.view.ViewGroup[@bounds='[105,1322][194,1411]']")).click();
        driver.findElement(By.xpath("//android.view.ViewGroup[@bounds='[105,1606][194,1695]']")).click();
        Thread.sleep(9000);

        //Click on add to cart button
        driver.findElement(By.xpath("//android.widget.TextView[@text='Add To Cart']")).click();
        //Click on go to cart button
        driver.findElement(By.xpath("//android.widget.TextView[@text='Go to Cart']")).click();

        //click on place order button, Order is placing through Crd
        driver.findElement(By.xpath("//android.widget.TextView[@text='Place Order']")).click();

        //Click on continue button
        driver.findElement(By.xpath("//android.widget.TextView[@text='Continue']")).click();
        Thread.sleep(15000);

        //Add card details
        //Add card number
        WebElement Card= driver.findElement(By.xpath("//android.widget.EditText[@resource-id='card-number']"));
        Card.click();
        Thread.sleep(2000);
        Card.sendKeys("4242424242424242");

        //Add Expiry Number
        driver.findElement(By.xpath("//android.widget.EditText[@resource-id='expiration-date']")).sendKeys("1224");

        //Add CVV number
        driver.findElement(By.xpath("//android.widget.EditText[@resource-id='cvv']")).sendKeys("123");

        //Add Card Holder Name
        driver.findElement(By.xpath("//android.widget.EditText[@resource-id='card-holder']")).sendKeys("test");

        //Click on Submit button
        driver.findElement(By.xpath("//android.widget.Button[@text='Submit']")).click();
        Thread.sleep(10000);

        //Click on submit button after adding card details
        driver.findElement(By.xpath("//android.widget.Button[@text='Submit']")).click();

    }
    }


