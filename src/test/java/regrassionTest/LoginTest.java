package regrassionTest;

import frameWork.WebDriverFactory;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pageObject.LandingPage;

import java.util.Iterator;
import java.util.Set;

public class LoginTest extends WebDriverFactory {

    @Test
    public void regisrtySearchTest() throws InterruptedException {
        getDriver();

        LandingPage landingPageObj = PageFactory.initElements(driver, LandingPage.class);

        String parentWindowHandler = driver.getWindowHandle(); // Store your parent window
        String subWindowHandler = null;
        Set<String> handles = driver.getWindowHandles(); // get all window handles
        Iterator<String> iterator = handles.iterator();

        subWindowHandler = iterator.next();

        driver.switchTo().window(subWindowHandler);
        landingPageObj.alartWindow();
        driver.switchTo().window(parentWindowHandler);


    }

}