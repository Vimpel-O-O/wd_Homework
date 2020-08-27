import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class GoogleSearch {

    WebDriver driver;

    @BeforeSuite
    private void start(){
        driver = new ChromeDriver();
    }

    /*@AfterSuite
    private void end(){
        driver.quit();
    }*/

    //1) go to google main page
    //2) Type the search query (for example yahoo.com)
    //3) Submit the query
    //4) Verify that results page is displayed

    @Test
    public void test0001() {
        String queryForSearch = "Portnov";
        String selector = "#search";

        openPage();
        typeGoogleQuery(queryForSearch, selector);
        submitGoogleQuery(selector);


    }

    private void openPage() {
        driver.get("https://www.youtube.com/");
    }

    private void typeGoogleQuery(String queryForSearch, String selector) {
        WebElement search = driver.findElement(By.cssSelector(selector));
        search.sendKeys(queryForSearch);
    }

    private void submitGoogleQuery(String selector) {
        WebElement search = driver.findElement(By.cssSelector(selector));
        search.submit();
    }


}
