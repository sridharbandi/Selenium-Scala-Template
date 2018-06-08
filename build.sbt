name := "Selenium-Scala-Template"

version := "0.1"

scalaVersion := "2.12.6"

fork in Test := true

libraryDependencies ++= Seq(
  "org.seleniumhq.selenium" % "selenium-java" % "3.12.0",
  "org.scalatest" %% "scalatest" % "3.0.5" % Test,
  "io.github.bonigarcia" % "webdrivermanager" % "2.2.1"

)

testOptions in Test += Tests.Argument(TestFrameworks.ScalaTest, "-u", "target/reports")