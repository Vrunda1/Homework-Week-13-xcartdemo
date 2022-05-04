package com.x_cart.mobile.testsuite;


import com.x_cart.mobile.pages.*;
import com.x_cart.mobile.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TopMenuTest extends TestBase {
    HomePage homePage = new HomePage();
   Shipping shipping = new Shipping();
   BestSeller bestSeller = new BestSeller();
   ContactUs contactUs = new ContactUs();
   NewArrivalPage newArrival = new NewArrivalPage();
   ComingSoon comingSoon = new ComingSoon();

    @Test
    public void verifyUserShouldNavigateToShippingPageSuccessfully(){
        homePage.clickonShipping();

    }
    @Test
    public void verifyUserShouldNavigateToNewPageSuccessfully(){
        homePage.clickOnNew();
       Assert.assertEquals(newArrival.verifyNewText(), "New arrivals", "Cannot navigate to page");
    }
    @Test
    public void verifyUserShouldNavigateToComingsoonPageSuccessfully(){
        homePage.clickOnComingSoon();
        Assert.assertEquals(comingSoon.verifyComingText(), "Coming soon", "Cannot navigate to page");
    }
    @Test
    public void verifyUserShouldNavigateToContactUsPageSuccessfully(){
        homePage.clickOnContactUs();
        Assert.assertEquals(contactUs.verifyContactUsText(), "Contact us", "Cannot navigate to page");
    }



}
