package com.nopCommerce.pages;

import com.nopCommerce.driverfactory.ManageDriver;
import com.nopCommerce.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ComputerPage extends Utility {
    private static final Logger log = LogManager.getLogger(ComputerPage.class.getName());

    public ComputerPage() {
        PageFactory.initElements(ManageDriver.driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']/li/ul/li/a[contains(text(),'Desktops')]")
    WebElement desktop;

    @CacheLookup
    @FindBy(id= "products-orderby")
    WebElement sort;

    @CacheLookup
    @FindBy(xpath= "//div[@class='item-grid']/div[1]//button[@class='button-2 product-box-add-to-cart-button']")
    WebElement addToCartBtn;

    @CacheLookup
    @FindBy(xpath= "//div[@class='product-name']/h1")
    WebElement itemText;

    @CacheLookup
    @FindBy(id= "product_attribute_1")
    WebElement  procceser;

    @CacheLookup
    @FindBy(id= "product_attribute_2")
    WebElement  ram ;

    @CacheLookup
    @FindBy(id= "product_attribute_3_7")
    WebElement  hhd ;

    @CacheLookup
    @FindBy(id= "product_attribute_5_12")
    WebElement  chckbx;

    @CacheLookup
    @FindBy(xpath= "//span[@id='price-value-1']")
    WebElement  price;

    @CacheLookup
    @FindBy(id= "add-to-cart-button-1")
    WebElement  addbtn;

    @CacheLookup
    @FindBy(xpath= "//p[contains(text(),'The product has been added to your ')]")
    WebElement  msg;

    @CacheLookup
    @FindBy(xpath= "//span[@class='close']")
    WebElement  clos;

    @CacheLookup
    @FindBy(xpath= "//li[@id='topcartlink']/a")
    WebElement  shoppingCart;

    @CacheLookup
    @FindBy(xpath= "//button[@class='button-1 cart-button']")
    WebElement  gotoc;

    @CacheLookup
    @FindBy(xpath= "//h1")
    WebElement shoppingCartMsg;

    @CacheLookup
    @FindBy(xpath= "//input[@class='qty-input']")
    WebElement qty;

    @CacheLookup
    @FindBy(xpath= "//button[@class='button-2 update-cart-button']")
    WebElement update;
    @CacheLookup
    @FindBy(xpath= "//span[@class='product-subtotal']")
    WebElement total;

    @CacheLookup
    @FindBy(id= "termsofservice")
    WebElement  terms ;

    @CacheLookup
    @FindBy(xpath= "//button[@class='button-1 checkout-button']")
    WebElement  ckechout;

    @CacheLookup
    @FindBy(xpath= "//h1")
    WebElement  welcomeText;

    @CacheLookup
    @FindBy(xpath= "//button[@class='button-1 checkout-as-guest-button']")
    WebElement  guestCheckout;

    @CacheLookup
    @FindBy(id= "BillingNewAddress_FirstName")
    WebElement  fName;

    @CacheLookup
    @FindBy(id= "BillingNewAddress_LastName")
    WebElement  lname;

    @CacheLookup
    @FindBy(id= "BillingNewAddress_Email")
    WebElement  email ;

    @CacheLookup
    @FindBy(id= "BillingNewAddress_CountryId")
    WebElement  country;

    @CacheLookup
    @FindBy(id= "BillingNewAddress_StateProvinceId")
    WebElement  state;

    @CacheLookup
    @FindBy(id= "BillingNewAddress_City")
    WebElement  city;
    @CacheLookup
    @FindBy(id= "BillingNewAddress_Address1")
    WebElement  address;

    @CacheLookup
    @FindBy(id= "BillingNewAddress_ZipPostalCode")
    WebElement  zipcode ;

    @CacheLookup
    @FindBy(id= "BillingNewAddress_PhoneNumber")
    WebElement  phoneNumber ;

    @CacheLookup
    @FindBy(xpath= "//div[@id='billing-buttons-container']/button[@class='button-1 new-address-next-step-button']")
    WebElement  continueBtn ;

    @CacheLookup
    @FindBy(id= "shippingoption_1")
    WebElement  radioair;

    @CacheLookup
    @FindBy(xpath= "//button[@class='button-1 shipping-method-next-step-button']")
    WebElement  contnue;

    @CacheLookup
    @FindBy(id= "paymentmethod_1")
    WebElement  crcard;

    @CacheLookup
    @FindBy(xpath= "//label[contains(text(),'Credit Card')]")
    WebElement  creditTxt;

    @CacheLookup
    @FindBy(xpath= "//button[@class='button-1 payment-method-next-step-button']")
    WebElement  clCont;

    @CacheLookup
    @FindBy(id= "CardholderName")
    WebElement  cardHoldr;

    @CacheLookup
    @FindBy(id= "CardNumber")
    WebElement  cardNo;

    @CacheLookup
    @FindBy(id= "ExpireMonth")
    WebElement  expMonth;

    @CacheLookup
    @FindBy(id= "ExpireYear")
    WebElement  expYear;

    @CacheLookup
    @FindBy(id= "CardCode")
    WebElement  code;

    @CacheLookup
    @FindBy(xpath= "//button[@class='button-1 payment-info-next-step-button']")
    WebElement  contn;

    @CacheLookup
    @FindBy(xpath= "//span[@class='value-summary']/strong")
    WebElement  totlamt;

    @CacheLookup
    @FindBy(xpath= "//button[@class='button-1 confirm-order-next-step-button']")
    WebElement  contnu;

    @CacheLookup
    @FindBy(xpath= "//div[@class='title']/strong[contains(text(),'Your order has been successfully processed!')]")
    WebElement  successMsg;

    @CacheLookup
    @FindBy(xpath= "//button[@class='button-1 order-completed-continue-button']")
    WebElement  clkcon;

    @CacheLookup
    @FindBy(xpath= "//h2")
    WebElement  welcmMsg;



    public void sortText() {
        clickOnElement(desktop);
        selectByVisibleTextFromDropDown(sort, "Name: Z to A");

    }

    public void clickOnDesktop() {
        clickOnElement(desktop);
    }

    public void selectAtoZ(String name) {

        selectByVisibleTextFromDropDown(sort, name);
    }

    public void addtoCart(){
        driver.navigate().refresh();
        clickOnElement(addToCartBtn);
    }


    public String getItemText()  {

        log.info("get item text" +itemText.toString());

        return getTextFromElement(itemText);
        //System.out.println(getTextFromElement(itemText));

    }

    public void selectProcesser(String name) {
        log.info("item added msg " +procceser.toString());
        selectByVisibleTextFromDropDown(procceser, name);
    }

    public void selectRam(String name) {
        log.info("item added msg " +ram.toString());
        selectByVisibleTextFromDropDown(ram, name);
    }

    public void selectRadiobtn() {
        clickOnElement(hhd);
    }

    public void selectCheckbox() {
        clickOnElement(chckbx);
    }

    public void getPrice() {
        log.info("price of product is " +price.toString());
        getTextFromElement(price);
    }

    public void clickAddBtn() {
        clickOnElement(addbtn);
    }

    public String getMsg() {
        log.info("item added msg " +msg.toString());
        return getTextFromElement(msg);
    }

    public void closemsg() {
        clickOnElement(clos);
    }

    public void shoppingCart() {
        mouseHoverToElement(shoppingCart);
    }

    public void clickGoTo() {
        clickOnElement(gotoc);
    }

    public String shoppingCartMsg() {
        log.info("shopping cart message " +shoppingCartMsg.toString()+"<br>");
        return getTextFromElement(shoppingCartMsg);
    }

    public void changeQty() {
        //Reporter.log("change quantity " +qty.toString()+"<br>");

        clearTextFromField(qty);
        sendTextToElement(qty, "2");
    }

    public void clickOnUpdate() {
        clickOnElement(update);
    }

    public String getTotlal() {
        log.info("total " +total.toString()+"<br>");
        return getTextFromElement(total);
    }

    public void clickTerms() {
        clickOnElement(terms);
    }

    public void checkout() {
        clickOnElement(ckechout);
    }

    public String getTitleText() {
        log.info("welcome message " +welcomeText.toString()+"<br>");
        return getTextFromElement(welcomeText);
    }

    public void clickGuestCheckout() {
        clickOnElement(guestCheckout);
    }

    //fill form
    public void getFname(String name) {
        log.info("firstname " +fName.toString()+"<br>");
        sendTextToElement(fName, name);
    }

    public void getlname(String name) {

        log.info("lastname" +lname.toString()+"<br>");
        sendTextToElement(lname, name);
    }

    public void getEmail(String name) {
        log.info("email " +email.toString()+"<br>");
        sendTextToElement(email, name);
    }

    public void getCountry(String name) {
        log.info("country" +country.toString()+"<br>");
        selectByVisibleTextFromDropDown(country, name);
    }

    public void getState(String name) {
        log.info("state " +state.toString()+"<br>");
        selectByVisibleTextFromDropDown(state, name);
    }

    public void getCity(String name) {
        log.info("city" +state.toString()+"<br>");
        sendTextToElement(city, name);
    }

    public void getAddress(String name) {

        sendTextToElement(address, name);
        log.info("address" +address.toString()+"<br>");
    }

    public void getZipcode(String name) {
        log.info("zipcode" +zipcode.toString()+"<br>");
        sendTextToElement(zipcode, name);
    }

    public void getPhoneNumber(String name) {
        sendTextToElement(phoneNumber, name);
    }

    public void clickContinue() {
        clickOnElement(continueBtn);
    }

    public void clkradioair(){
        clickOnElement(radioair);
    }

    public void clkcontinue(){
        clickOnElement(contnue);
    }



    public void cliktCrediCard() {
        clickOnElement(crcard);
    }

    public String getcredittxt(){
        log.info("creditcard " +creditTxt.toString()+"<br>");
       return getTextFromElement(creditTxt);
    }



    public void clickCont() {
        clickOnElement(clCont);
    }



    public void getCardHoldr(String name) {
        sendTextToElement(cardHoldr, name);
    }



    public void getCardNo(String no) {
        sendTextToElement(cardNo, no);
    }



    public void getExpMonth(String name) {
        selectByVisibleTextFromDropDown(expMonth, name);
    }



    public void getExpYear(String year) {
        selectByVisibleTextFromDropDown(expYear, year);
    }

    public void getcardcode(String crcode){
        sendTextToElement(code,crcode);
    }

    public void clkcontn(){
        clickOnElement(contn);
    }

    public String gettotlamt(){
       return getTextFromElement(totlamt);
    }

    public void clkcon(){
        clickOnElement(contnu);
    }

    public String getSuccessfullorderMsg(){
        log.info("placed successfull " +successMsg.toString()+"<br>");
        return getTextFromElement(successMsg);
    }

    public void cliccon(){
        clickOnElement(clkcon);
    }

    public String getwelcmmsg(){
        log.info("navigate to another page after successfull order " +welcmMsg.toString()+"<br>");
        return getTextFromElement(welcmMsg);
    }

    /*
    public void selectSortByPositionAndVerify() {
        // list of the product displayed before sort button
      // List<WebElement> beforeSortFilter= driver.findElements(By.xpath("xpath =//div[@class='caption']/h4/a"));
        List<String> beforeSortFilters = new ArrayList<>();
        for (WebElement s : beforeSortFilter) {
            System.out.println(s.getText());
        }
        // list of the product after clicked on sort button
        WebElement sort = driver.findElement((By) clickedOnSortButton);
        sort.click();
        Select s = new Select(sort);
        s.selectByVisibleText("Name (Z - A)");
        List<WebElement> afterSortFilter = driver.findElements(By.xpath("//div[@class='caption']/h4/a"));
        List<String> afterSortFilters = new ArrayList<>();
        for (WebElement as : afterSortFilter) {
            System.out.println(as.getText());
        }
        Collections.sort(beforeSortFilters);
        Assert.assertEquals(beforeSortFilters, afterSortFilters);
        // Assert.assertNotEquals(beforeSortFilters, afterSortFilters);

    }

*/


}
