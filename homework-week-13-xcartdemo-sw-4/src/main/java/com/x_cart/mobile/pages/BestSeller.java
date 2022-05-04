package com.x_cart.mobile.pages;

import com.x_cart.mobile.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class BestSeller extends Utility {
    By bestSellersLinkText = By.xpath("//h1[text()='Bestsellers']");
    By sortBy = By.xpath("//span[text()='Sort by:']");
    By sortZToA = By.xpath("//li[@class='list-type-grid ']//a[@data-sort-by='translations.name' and @data-sort-order='desc']");
    By zToAText = By.xpath("//span[text()='Name Z - A']");
    By sortAToZ = By.xpath("//li[@class='list-type-grid ']//a[@data-sort-by='translations.name' and @data-sort-order='asc']");
    By sortPriceHighLow = By.xpath("//li[@class='list-type-grid ']//a[@data-sort-by='p.price' and @data-sort-order='desc']");
    By highToLowText = By.xpath("//span[text()='Price High - Low']");
    By sortRate = By.xpath("//ul[@class='display-sort sort-crit grid-list']/child::li[6]/a");
    By hooverToAddToCart = By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/ul[1]/li[1]/div[1]/div[1]/a[1]/img[1]");
    By addToCart = By.xpath("//button[@class='btn  regular-button add-to-cart product-add2cart productid-42']");
    By productText = By.xpath("//li[text()='Product has been added to your cart']");
    By closeSign = By.xpath("//a[@class='close']");
    By cartSymbol = By.xpath("//div[@title='Your cart']");
    By viewCart = By.xpath("//a[@class='regular-button cart']");
    By addVinlyProduct = By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/ul[1]/li[8]/div[1]/div[2]/div[4]/div[1]/button[1]");

    public String verifyBestSellerText() {
        return getTextFromElement(bestSellersLinkText);
    }

    public void mouseHoverOnSortBy() {
        mouseHoverToElementAndClick(sortBy);
    }

    public void clickOnSortRate() {
        clickOnElement(sortRate);
    }

    public void clickOnSortZToA() {
        clickOnElement(sortZToA);
    }

    public void clickOnSortAToZ() {
        clickOnElement(sortAToZ);
    }

    public void clickOnSortPriceHighToLow() {
        clickOnElement(sortPriceHighLow);
    }

    public void clickOnSortRateBestSeller() {
        clickOnElement(sortBy);
    }

    public String VerifyZToAText() {
        return getTextFromElement(zToAText);
    }

    public String verifyHighToLowText() {
        return getTextFromElement(highToLowText);
    }

    public void mouseHoverOnAddToCart() {
        mouseHoverToElement(hooverToAddToCart);
    }

    public void clickOnAddToCart() {
        clickOnElement(addToCart);
    }

    public String verifyProductText() {
        return getTextFromElement(productText);
    }

    public void clickOnCloseSign() {
        clickOnElement(closeSign);
    }

    public void clickOnCartSymbol() {
        clickOnElement(cartSymbol);
    }

    public void clickOnViewCart() {
        clickOnElement(viewCart);
    }

    public void mouseHoverAndClickOnAddToCartVinlyProduct() {
        mouseHoverToElementAndClick(addVinlyProduct);
    }

}
