package junitdemo;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import junit.framework.TestCase;
import io.appium.java_client.TouchAction;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
public class appium_test {




        private AndroidDriver driver;

        @Before
        public void setUp() throws MalformedURLException {
            DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
            desiredCapabilities.setCapability("platformName", "Android");
            desiredCapabilities.setCapability("deviceName", "192.168.215.101:5555");
            desiredCapabilities.setCapability("appPackage", "com.banggood.client");
            desiredCapabilities.setCapability("appActivity", ".module.home.MainActivity");

            URL remoteUrl = new URL("http://localhost:4723/wd/hub");

            driver = new AndroidDriver(remoteUrl, desiredCapabilities);
        }

        @Test
        public void sampleTest() {
            (new TouchAction(driver)).tap(313, 93).perform();
            (new TouchAction(driver)).tap(271, 265).perform();
        }

        @After
        public void tearDown() {
            driver.quit();
        }
    }

