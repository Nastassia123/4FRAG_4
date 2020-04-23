package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ComparasionListPage extends MainPage {

    public boolean isComparasionListPageHeaderDisplayed() {
        return isElementDisplayed(By.xpath("//h1[contains(text(), 'Сравнение товаров')]"));
    }



    public WebElement elementsAddedInComparasionListPage() {
        return driver.findElement(By.xpath("//label[contains(text(), 'Товары для сравнения')]"));

    }

}
