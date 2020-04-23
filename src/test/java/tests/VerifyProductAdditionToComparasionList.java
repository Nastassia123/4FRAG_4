package tests;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.ComparasionListPage;
import pages.MainPage;

public class VerifyProductAdditionToComparasionList extends MainPage {

    @Parameters({"Products Comparasion"})
    @Test
    public void testProductAdditionToTheList(String tab) {

        ComparasionListPage comparasionListPage = new MainPage()
                .openHomePage()
                .addItemToComparasionList()
                .closePopUpWindow()
                .openComparasionListPage(tab);
        Assert.assertEquals(comparasionListPage.elementsAddedInComparasionListPage().getText(), "Товары для сравнения");
    }
}

