package pages;

import org.openqa.selenium.By;

public class DiscountSystemPage extends MainPage {

    public boolean isDiscountSystemPageHeaderDisplayed() {
        return isElementDisplayed(By.xpath("//h1[contains(text(), 'Дисконтная программа')]"));
    }
}
