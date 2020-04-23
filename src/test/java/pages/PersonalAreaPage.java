package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PersonalAreaPage extends LoginPage {

    public WebElement personalPageHeader() {
        return driver.findElement(By.xpath("//p[contains(text(),  'Подписка')]"));
    }
}
