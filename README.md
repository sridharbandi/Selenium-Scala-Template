## Selenium Scala Template with Page Object Model

To automate [Selenium Webdriver](https://docs.seleniumhq.org/projects/webdriver/) binaries management in runtime am using [webdrivermanager](https://github.com/bonigarcia/webdrivermanager), an excellent library by [Boni García](https://github.com/bonigarcia) 
### How to use?
Create the Page Objects of your Web application under **_pageobjects_** package, call those Page Objects in tests under **_test_** package (Sample Page Objects, testcase included in this template)

### How to run?
Make sure you have [sbt](https://www.scala-sbt.org/download.html) downloaded and configured in path.

And then execute the below command in project root directory to run the tests
```javascript
sbt test
```
## TO DO
Command line switch to change the browser.

> Feel free to modify it to your own needs :)
