package driverutil

import DriverType._
import io.github.bonigarcia.wdm.WebDriverManager
import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.edge.EdgeDriver
import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.ie.InternetExplorerDriver
import org.openqa.selenium.opera.OperaDriver

object DriverFactory {

  def getDriver: WebDriver = getWebDriver()

  def getWebDriver(): WebDriver = {
    val browsername = System.getProperty("browser", DriverType.CHROME.toString).toUpperCase()

    val browser = DriverType.withNameOpt(browsername)

    implicit val driver: WebDriver = browser match {
      case CHROME =>
        WebDriverManager.chromedriver().setup()
        new ChromeDriver()

      case FIREFOX =>
        WebDriverManager.firefoxdriver().setup()
        new FirefoxDriver()

      case IE =>
        WebDriverManager.iedriver().setup()
        new InternetExplorerDriver()

      case EDGE =>
        WebDriverManager.edgedriver().setup()
        new EdgeDriver()

      case OPERA =>
        WebDriverManager.operadriver().setup()
        new OperaDriver()

      case _ =>
        WebDriverManager.chromedriver().setup()
        new ChromeDriver()

    }

    return driver
  }

}
