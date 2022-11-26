
import java.util.Iterator;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Optestt {
	public static void main(String[] args) throws InterruptedException {
		{
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\rami\\Desktop\\chromedriver_win32\\chromedriver.exe");
				
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			Thread.sleep(3000);
			
	driver.get("http://127.0.0.1:5500/index.html");
	String myTitile = driver.getTitle();
	System.out.println(myTitile);
	
	
	
	List<WebElement>myListOptions = driver.findElements(By.tagName("option"));
	System.out.println(myListOptions.size());
	

	
	for(int i =0;i<=myListOptions.size();i++) {
		
		System.out.println(myListOptions.get(i).getText());
		
		
		
	}
	
					}
	
		} 
		
	}
	
	
	
	


