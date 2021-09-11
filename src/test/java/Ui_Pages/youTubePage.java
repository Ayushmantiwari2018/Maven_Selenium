package Ui_Pages;

import Ui_Locators.youTubeLocators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class youTubePage {

    WebDriver driver = new ChromeDriver();

    public void openYouTube() {
        driver.get("https://www.youtube.com/");
    }

    public void searchInYouTube(String search) {
        driver.findElement(By.xpath(youTubeLocators.youTubeSearchBox)).sendKeys(search);
        driver.findElement(By.xpath(youTubeLocators.youTubeSearch)).click();
    }
}
