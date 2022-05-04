package com.x_cart.mobile.testsuite;

import com.x_cart.mobile.pages.BestSeller;
import com.x_cart.mobile.pages.HomePage;
import com.x_cart.mobile.pages.SaleProducts;
import com.x_cart.mobile.testbase.TestBase;
import org.checkerframework.checker.units.qual.A;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HotDealsTest extends TestBase {
    HomePage homePage = new HomePage();
    BestSeller bestSeller = new BestSeller();
    SaleProducts saleProducts = new SaleProducts();

    @Test
    public void verifySaleProductsArrangeAlphabetically() throws InterruptedException {
        Thread.sleep(1000);
        homePage.mouseHoverNClickHotDeal();
        Thread.sleep(1000);
        homePage.mouseHoverNclickSale();
        Thread.sleep(1000);
        Assert.assertEquals(saleProducts.verifySaleText(), "Sale", "Caanot Navigate to page");
        saleProducts.mouseHoverOnSortBy();
        saleProducts.clickOnSortAToZ();
        Thread.sleep(1000);
        Assert.assertEquals(saleProducts.verifyAToZText(), "Name A - Z", "Cannot Navigate to page");


    }

    @Test
    public void verifySaleProductsPriceArrangeLowToHigh() throws InterruptedException {
        Thread.sleep(1000);
        homePage.mouseHoverNClickHotDeal();
        Thread.sleep(1000);
        homePage.mouseHoverNclickSale();
        Thread.sleep(1000);
        Assert.assertEquals(saleProducts.verifySaleText(), "Sale", "Cannot Navigate to page");
        saleProducts.mouseHoverOnSortBy();
        saleProducts.clickOnSortPriceLowtoHigh();
        Thread.sleep(1000);
        Assert.assertEquals(saleProducts.verifyLowToHighText(), "Price Low - High", "Not Navigate to page");
    }

    @Test
    public void verifySaleProductsArrangeByRates() throws InterruptedException {
        Thread.sleep(1000);
        homePage.mouseHoverNClickHotDeal();
        Thread.sleep(1000);
        homePage.mouseHoverNclickSale();
        Thread.sleep(1000);
        Assert.assertEquals(saleProducts.verifySaleText(), "Sale", "Cannot Navigate to page");
        saleProducts.mouseHoverOnSortBy();
        saleProducts.clickOnSortByRate();
        Thread.sleep(1000);
        Assert.assertEquals(saleProducts.verifyRateText(), "Rates", "Cannot Navigate to page");
    }

    @Test
    public void verifyBestSellersProductsArrangeByZToA() throws InterruptedException {
        Thread.sleep(1000);
        homePage.mouseHoverNClickHotDeal();
        Thread.sleep(1000);
        homePage.mouseHoverNclickBestSeller();
        Thread.sleep(1000);
        Assert.assertEquals(bestSeller.verifyBestSellerText(), "Bestsellers", "Cannot Navigate to page");
        //
        bestSeller.mouseHoverOnSortBy();
        bestSeller.clickOnSortZToA();
        Assert.assertEquals(bestSeller.VerifyZToAText(), "Name Z-A", "Cannot navigate page");
    }

    @Test
    public void verifyBestSellersProductsPriceArrangeHighToLow() throws InterruptedException {
        Thread.sleep(1000);
        homePage.mouseHoverNClickHotDeal();
        Thread.sleep(1000);
        homePage.mouseHoverNclickBestSeller();
        Thread.sleep(1000);
        Assert.assertEquals(bestSeller.verifyBestSellerText(), "Bestsellers", "Cannot Navigate to page");
        bestSeller.mouseHoverOnSortBy();
        bestSeller.clickOnSortPriceHighToLow();
        Assert.assertEquals(bestSeller.verifyHighToLowText(), "Price High-Low", "Cannot navigate to page");
    }

    @Test
    public void verifyBestSellersProductsArrangeByRates() throws InterruptedException {
        Thread.sleep(1000);
        homePage.mouseHoverNClickHotDeal();
        Thread.sleep(1000);
        homePage.mouseHoverNclickBestSeller();
        Thread.sleep(1000);
        Assert.assertEquals(bestSeller.verifyBestSellerText(), "Bestsellers", "Cannot Navigate to page");
        bestSeller.mouseHoverOnSortBy();
        bestSeller.clickOnSortRate();
    }
}