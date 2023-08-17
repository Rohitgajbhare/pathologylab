package Lab;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test1 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://gor-pathology.web.app/");
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("email")).sendKeys("test@kennect.io");
		
		driver.findElement(By.name("password")).sendKeys("Qwerty@1234");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[contains(text(),'Login')]")).click();
		
		Thread.sleep(3000);
			
		driver.findElement(By.xpath("//span[contains(text(),'Tests')]")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/main[1]/div[2]/div[1]/a[2]/button[1]/span[1]")).click();
		
		String name1= "Rohit";
		
		driver.findElement(By.name("name")).sendKeys(name1);
		
		String email = "gajbharerohit@gmail.com";
		
		driver.findElement(By.name("email")).sendKeys(email);
		
		String number = "7757036032";
		 
		driver.findElement(By.name("phone")).sendKeys(number);
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/main[1]/div[2]/div[2]/div[1]/div[2]/div[2]/button[2]/span[1]")).click();
		
		Thread.sleep(3000);
		
		String height = "180";
		
		driver.findElement(By.name("height")).sendKeys(height);
		
		String weight = "75";
		
		driver.findElement(By.name("weight")).sendKeys(weight);
		
		driver.findElement(By.xpath("//div[@id='mui-component-select-gender']")).click();
		
		driver.findElement(By.xpath("//body/div[@id='menu-gender']/div[3]/ul[1]/li[2]")).click();
		
		String Age = "25";
		
		driver.findElement(By.name("age")).sendKeys(Age);
		
		String SystolicBP  = "110";

		driver.findElement(By.name("systolic")).sendKeys(SystolicBP);
		
		String DiastolicBP  = "80";
		
		driver.findElement(By.name("diastolic")).sendKeys(DiastolicBP);
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/main[1]/div[2]/div[2]/div[1]/div[2]/div[2]/button[2]/span[1]")).click();
		
		Thread.sleep(3000);
		
		
		WebElement ddown = driver.findElement(By.xpath("//body/div[@id='root']/div[1]/main[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/button[2]/span[1]/*[1]"));
		ddown.click();
		
		driver.findElement(By.xpath("//div[contains(text(),'VITAMIN B12, SERUM')]")).click();
		
		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/main[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]")).click();
		
		driver.findElement(By.xpath("//body/div[@id='menu-']/div[3]/ul[1]/li[4]")).click();
		
		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/main[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]")).click();
		
		driver.findElement(By.xpath("//li[@id='patient-tests-labs-option-1']")).click();
		
		driver.findElement(By.xpath("//span[contains(text(),'add_box')]")).click();
		
		driver.findElement(By.xpath("//tbody/tr[1]/td[1]/div[1]/div[1]")).click();
		
		driver.findElement(By.xpath("//body/div[@id='menu-']/div[3]/ul[1]/li[1]")).click();
		
		driver.findElement(By.xpath("//span[contains(text(),'check')]")).click();
		
		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/main[1]/div[2]/div[2]/div[1]/div[2]/div[2]/button[2]/span[1]")).click();

		Thread.sleep(10000);
		
		driver.findElement(By.xpath("//span[contains(text(),'Dashboard')]")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[contains(text(),'view')]")).click();
		
		
	}

}
