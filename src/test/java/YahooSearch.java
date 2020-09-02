import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;



public class YahooSearch {

    WebDriver driver;

    @BeforeSuite
    private void start(){
        driver = new ChromeDriver();
    }

    @AfterSuite
    private void end(){
        //driver.quit();
    }

    //1) go to yahoo main page
    //2) Type the search query (for example: SiliconValleyVoice)
    //3) Submit the query
    //4) Verify that results page is displayed
    //5) find SiliconValleyVoice youtube link
    //6) click SiliconValleyVoice youtube link

    @Test
    public void test0001() {
        String queryForSearch = "silicon valley voice";
        String selector = "#header-search-input";
        String Pv_selector = "SiliconValleyVoice - YouTube";


        openPage();
        typeYahooQuery(queryForSearch, selector);
        submitYahooQuery(selector);
        clickPLink(Pv_selector);


    }

    private void openPage() {
        driver.get("https://www.yahoo.com/");
    }

    private void typeYahooQuery(String queryForSearch, String selector) {
        driver.findElement(By.cssSelector(selector)).click();
        WebElement search = driver.findElement(By.cssSelector(selector));
        search.sendKeys(queryForSearch);
    }


    private void submitYahooQuery(String selector) {
        WebElement search = driver.findElement(By.cssSelector(selector));
        search.submit();
    }

    private void clickPLink(String Pv_selector){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement search = wait.until(ExpectedConditions.elementToBeClickable(By.linkText(Pv_selector)));
        search.click();
        //WebElement search = driver.findElement(By.linkText(Pv_selector));
    }


}

