package pages;

import org.openqa.selenium.By;

public class BookmarksPage extends MainPage {

    public boolean isBookmarksPageHeaderDisplayed() {
        return isElementDisplayed(By.xpath("//h1[contains(text(), 'Мои закладки')]"));
    }
}
