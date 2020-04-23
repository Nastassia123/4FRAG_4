package tests;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.MainPage;
import pages.WishListPage;

public class VerifyProductsCatalogOptions extends MainPage {


    @Parameters({"Bookmarks"})
    @Test
    public void testChooseProductFromCatalog(String tab) {

        WishListPage wishListPage = new MainPage()
                .openHomePage()
                .chooseProductCategory()
                .filloutInputFormaxPrice()
                .clickOnTheProductTypeDropDown()
                .chooseProductFromProductTypeDropDown()
                .filloutInputDPIAndCPIResolutionValue()
                .chooseProductSubCategoryFromResultList()
                .addProductToWishListFromResultList()
                .closePopUpWindow()
                .openProductInTheWishListPage(tab);
        Assert.assertEquals(wishListPage.buyButtonForProductInTheWishListPage().getText(),"КУПИТЬ");
    }
}
