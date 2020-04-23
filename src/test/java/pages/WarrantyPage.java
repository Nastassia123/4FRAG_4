package pages;

import org.openqa.selenium.By;

public class WarrantyPage extends MainPage {

    public boolean isWarrantyPageHeaderDisplayed() {
        return isElementDisplayed(By.xpath("//h1[contains(text(), 'Гарантия')]"));
    }
}
