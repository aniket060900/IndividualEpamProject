package org.example;
import com.Browser.FactoryBrowser;
import org.openqa.selenium.*;
import org.testng.annotations.Test;
public class GoogleCloudTest {
    @Test
    public void GoogleCloud() throws InterruptedException {
        WebDriver driver= FactoryBrowser.setupBrowser("chrome","https://cloud.google.com/");
        GoogleCloudSecond calculatorPage=new GoogleCloudSecond(driver);
        GoogleCloudFirst Cloud = new GoogleCloudFirst(driver);
        Cloud.homePage();
        Cloud.sendKeyInToNumberOfInstancesField("4");
        Cloud.selectSeriesOfMachine();
        Cloud.selectMachineType();
        Cloud.clickAddGpusCheckBox();
        Cloud.selectGpuType();
        Cloud.selectNumberOfGpus();
        Cloud.selectLocalSsd();
        Cloud.selectDataCenterLocation();
        Cloud.selectCommittedUsage();
        calculatorPage.pushAddToEstimate();
        driver.quit();
        Thread.sleep(2000);
    }
}
