package tests

import driverutil.DriverFactory
import org.openqa.selenium.WebDriver
import org.scalatest._
import org.scalatest.selenium.WebBrowser
import pageobjects.{GoogleSearchPage, SearchResultsPage}

class Test extends FeatureSpec with GivenWhenThen with Matchers with WebBrowser with BeforeAndAfterAll with BeforeAndAfterEach  {

  //WebDriverManager.chromedriver().setup()
  implicit val driver: WebDriver = DriverFactory.getDriver
  val host = "https://www.google.com/"
  lazy val googleSearchPage = new GoogleSearchPage(driver)
  lazy val searchResultsPage = new SearchResultsPage(driver)

  override def beforeEach() = {
    go to (host)
  }

  override def afterAll() = {
    quit()
  }

  feature("Google Search Test") {
    scenario("Verify Title") {
      Given("I am on the Google Search Page")

      Then("Page title should be Google")
      pageTitle should be("Google")
    }

    scenario("Search for Selenium") {
      Given("I am on the Google Search Page")

      When("I Search for Selenium")
      googleSearchPage.searchFor("Selenium")

      Then("Search results should contain Selenium Result")
      assert(searchResultsPage.isLnkSeleniumPresent())
    }
  }

}
