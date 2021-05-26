#Test Automation Framework for https://profitero2.my.salesforce.com/
#TECHNOLOGIES
- Java 14
- Selenium
- Maven
- TestNG

#PRE-CONDITIONS TO RUN TESTS
- Java 14
- Maven
- TestNG
- Chrome browser





### MAVEN
##### Обновить версии всех библиотек в проекте и ее вывод, например

- `mvn versions:display-dependency-updates`команда для просмотра доступных обновлений библиотек

- `mvn versions:use-latest-versions` команда для автоматического обновления всех версий

  
`mvn versions:display-dependency-updates` command result:

[INFO] --- versions-maven-plugin:2.8.1:display-dependency-updates (default-cli) @ SalesForce ---
[INFO] The following dependencies in Dependencies have newer versions:
[INFO]   io.github.bonigarcia:webdrivermanager ................. 4.4.1 -> 4.4.3
[INFO]   org.seleniumhq.selenium:selenium-java ....... 3.141.59 -> 4.0.0-beta-3
[INFO]   org.testng:testng ..................................... 7.1.0 -> 7.4.0
[INFO]
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------

### Run TestSuite

[INFO] Results:
[INFO]
[WARNING] Tests run: 3, Failures: 0, Errors: 0, Skipped: 0
[INFO]
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  02:57 min
[INFO] Finished at: 2021-05-25T19:47:20+03:00
[INFO] ------------------------------------------------------------------------

### SEND PROPERTIES TO LOGIN TEST
`mvn -Dtest=PRLoginTest test -DUSER="sergei.zayats1992-clgs@force.com" -DPASSWORD="pswrd123"`

[INFO] Results:
[INFO]
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0
[INFO]
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
