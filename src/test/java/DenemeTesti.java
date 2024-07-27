import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class DenemeTesti {

    AndroidDriver<MobileElement> driver;

    @Test
    public void deneme() throws MalformedURLException {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"Pixel API 35");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,"Android API 35");
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,";UiAutomator2");
        capabilities.setCapability(MobileCapabilityType.APP,"C:\\Users\\fatiholcay\\IdeaProjects\\Appium\\Apps\\Calculator_8.6.1 (625857114)_APKPure.apk");

        driver =new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);


    }

}
