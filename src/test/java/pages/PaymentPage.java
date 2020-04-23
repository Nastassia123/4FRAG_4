package pages;

import org.openqa.selenium.By;

public class PaymentPage extends MainPage {

    public boolean isPaymentPageHeaderDisplayed() {
        return isElementDisplayed(By.xpath("//h1[contains(text(), 'Информация об оплате')]"));
    }
}
