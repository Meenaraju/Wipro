package sel_projct;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;




public class Calci {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//launch the browser
		System.setProperty("webdriver.chrome.driver", "E:\\20085198\\Selenium\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		//launch url
		d.get("https://www.calculator.net/");
		//maximize the window
				d.manage().window().maximize();
	   // click the gas mileage link 
		d.findElement(By.xpath("//*[@id=\"hl5\"]/li[2]/a")).click();
		//clear the default input and enter the value
		d.findElement(By.name("uscodreading")).clear();
		d.findElement(By.name("uscodreading")).sendKeys("10000");
		//clear the default input and enter the value
		d.findElement(By.name("uspodreading")).clear();
		d.findElement(By.name("uspodreading")).sendKeys("125");
		//clear the default input and enter the value
		d.findElement(By.name("usgasputin")).clear();
		d.findElement(By.name("usgasputin")).sendKeys("25");
		//clear the default input and enter the value
		d.findElement(By.name("usgasprice")).clear();
		d.findElement(By.name("usgasprice")).sendKeys("5");
		//click the calculate button
		d.findElement(By.xpath("//*[@id=\"standard\"]/tbody/tr[5]/td/input")).click();
		//print the result
		WebElement result = d.findElement(By.xpath("//*[@id=\"content\"]/font/b"));
		String s = result.getText();
		Double i = Double.parseDouble(s.replaceAll("[\\D&&[^\\.]]", ""));
		//String i =(s.replaceAll("[\\D&&[^\\.]]", ""));
		//int r = Integer.parseInt(result.getText());
		 System.out.printf("%.2f",i);
		Thread.sleep(5000);
		//close the browser
		//d.close();

	}

}
