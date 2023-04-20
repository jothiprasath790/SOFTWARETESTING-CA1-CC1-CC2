package Ca1;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;
public class amazon {
    public static void main( String[] args ) throws InterruptedException
    {
           WebDriverManager.chromedriver().setup();
        ChromeOptions co=new ChromeOptions();
        WebDriver driver=new ChromeDriver(co);
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in/ASUS-ROG-Strix-Impact-Ambidextrous/dp/B082J9PT7P/ref=sr_1_18?keywords=Rog&qid=1681289519&sr=8-18&th=1");
        driver.findElement(By.id("add-to-cart-button")).submit();
        String t=driver.getTitle();
        System.out.println(t);
       
       
        String cart=driver.findElement(By.xpath("//*[@id=\"NATC_SMART_WAGON_CONF_MSG_SUCCESS\"]/span")).getText();
        if(cart.equals("Added to cart"));
        System.out.println("1.  Verified that Product added to cart ");
       
        driver.navigate().back();
           
            WebElement sort1=driver.findElement(By.xpath("//*[@id=\"quantity\"]"));
                sort1.click();
                Select select=new Select(sort1);
                select.selectByIndex(1);
               
                String drop=driver.findElement(By.xpath("//*[@id=\"quantity\"]")).getText();
            if(drop.equals("2"));
            System.out.println("3.  Verified that Product is updated to cart ");
    }
}