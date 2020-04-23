package tests;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.MainPage;
import pages.PersonalAreaPage;


public class VerifyLoginFunctionality extends MainPage {


    @Parameters ({"Login/Registration"})
    @Test
    public void testLoginOption(String tab) {
        PersonalAreaPage loginPage = new MainPage()
                .openHomePage()
                .openLoginPage(tab)
                .fillOutEmailField()
                .fillOutPasswordField();
        Assert.assertEquals(loginPage.personalPageHeader().getText(),"Подписка");
    }
    }

