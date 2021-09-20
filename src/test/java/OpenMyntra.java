import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class OpenMyntra {

    //open in Android device to check the mobile view

    static AppiumDriver<MobileElement> driver;

    public static void main(String[] args) {

        try {
            openMyntra();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }


    }

    public static void openMyntra() throws MalformedURLException {
        DesiredCapabilities cap=new DesiredCapabilities();
        cap.setCapability("deviceName", "Deepankar's phone");
        cap.setCapability("udid","870cc6da");
        cap.setCapability("platformName", "Android");
        cap.setCapability("platformVersion", "11");
        cap.setCapability("appPackage","com.myntra.android");
        cap.setCapability("appActivity","com.myntra.android.activities.WebViewActivity");

        URL url=new URL("http://127.0.0.1:4723/wd/hub");
        driver=new AppiumDriver<MobileElement>(url, cap);

        System.out.println("Application started....");

    }
}
