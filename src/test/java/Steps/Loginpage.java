package Steps;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;


public class Loginpage extends PageObject {

    @FindBy(xpath = "//a[@class='list-group-item']")
    private WebElementFacade   labelSimpleFormDemo;

    public void    ClickLabel() {

        waitFor(labelSimpleFormDemo).click();
    }



    @FindBy(xpath = "//button[@aria-label='Next page' and @disabled='true']")
    private WebElementFacade   nextPageButtonDisable;

    @FindBy(xpath = "//button[@aria-label='Next page']")
    private WebElementFacade   nextPageButton;


    @FindBy(xpath = "//button[@aria-label='Previous page' and @disabled='true']")
    private WebElementFacade   previousPageButtonDisable;

    @FindBy(xpath = "//button[@aria-label='Previous page']")
    private WebElementFacade   previousPageButton;


    @FindBy(xpath = "//button[@aria-label='Last page' and @disabled='true']")
    private WebElementFacade   lastPageButtonDisable;

    @FindBy(xpath = "//button[@aria-label='Last page']")
    private WebElementFacade   lastPageButton;


    @FindBy(xpath = "//button[@aria-label='First page']")
    private WebElementFacade   firstPageButton;

    @FindBy(xpath = "//button[@aria-label='First page' and @disabled='true']")
    private WebElementFacade   firstPageButtonDisable;





   @FindBy(xpath = "//mat-select[@id='mat-select-0']")
   private   WebElementFacade  btnMatSelect;


    public void selectItemsPerPage(String  itemsPerPage) {
        btnMatSelect.click();
        WebElementFacade buttonMapOption =
                findBy(String.format("//span[contains(text(),'%s')]//parent::button", itemsPerPage));
        buttonMapOption.waitUntilVisible().waitUntilClickable().click();
    }


    public void  verifyItemNumberDisplayed (int  items) {
        String baseXpathDateModelsTable = "//tbody/tr/td";
        int itemsNumber = findAll(By.xpath(baseXpathDateModelsTable)).size();
        Assert.assertTrue(itemsNumber<=items);
    }



}
