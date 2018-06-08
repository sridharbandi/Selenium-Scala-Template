package pageobjects

import org.openqa.selenium.{Keys, WebDriver, WebElement}
import org.openqa.selenium.support.{FindBy, PageFactory}

class GoogleSearchPage(driver: WebDriver) {

  @FindBy(id = "lst-ib")
  var searchBox: WebElement = _

  PageFactory.initElements(driver, this)

  def searchFor(searchTerm: String): Unit ={
    searchBox.sendKeys(searchTerm + Keys.RETURN)
  }




}
