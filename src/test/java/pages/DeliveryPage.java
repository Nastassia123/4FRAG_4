package pages;

import pages.basepagesconfiguration.BasePageClass;
import org.openqa.selenium.By;


public class DeliveryPage extends BasePageClass {

    public boolean isDeliveryPageHeaderDisplayed() {
        return isElementDisplayed(By.xpath("//h1[contains(text(), 'Информация о доставке')]"));
    }
}
